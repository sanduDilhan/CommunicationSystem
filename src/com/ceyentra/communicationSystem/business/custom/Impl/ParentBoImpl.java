/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.business.custom.Impl;

import com.ceyentra.communicationSystem.business.custom.ParentBo;
import com.ceyentra.communicationSystem.entity.Parent;
import com.ceyentra.communicationSystem.entity.RegistrationMessage;
import com.ceyentra.communicationSystem.entity.RegistrationMessagePK;
import com.ceyentra.communicationSystem.model.ParentDTO;
import com.ceyentra.communicationSystem.model.RegistrationDTO;
import com.ceyentra.communicationSystem.repository.RepositoryFactory;
import com.ceyentra.communicationSystem.repository.custom.ParentRepository;
import com.ceyentra.communicationSystem.repository.custom.RegistrationMessageRepository;
import com.ceyentra.communicationSystem.resources.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author sandunDilhan
 */
public class ParentBoImpl implements ParentBo{
    private ParentRepository parentRepository;
    private RegistrationMessageRepository regMsgRepository;
    public ParentBoImpl() {
        parentRepository=(ParentRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.repositoryTypes.PARENT);
        regMsgRepository=(RegistrationMessageRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.repositoryTypes.REGISTRATION);
    }

    @Override
    public boolean saveParent(ParentDTO parentDto) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            parentRepository.setSession(session);
            session.beginTransaction();
            Parent parent=new Parent(
                    parentDto.getMobileNo(),
                    parentDto.getName(),
                    parentDto.getStudentClass()
            );
            boolean result=parentRepository.save(parent);
            session.getTransaction().commit();
            return result;
        }
    }

    @Override
    public ParentDTO searchParent(int parentId) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            parentRepository.setSession(session);
            session.beginTransaction();
            Parent parent=parentRepository.findById(parentId);
            if(parent!=null){
                session.getTransaction().commit();
                return new ParentDTO(parent.getParentId(), parent.getMobileNo(), parent.getName(), parent.getStudentClass());
            }else{
                return null;
            }
        }
    }

    @Override
    public List<ParentDTO> fndAll() throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            parentRepository.setSession(session);
            session.beginTransaction();
            List<ParentDTO> parentList=new ArrayList<>();
            if(parentRepository.fndAll()!=null){
                for (ParentDTO pList : parentList) {
                    parentList.add(new ParentDTO(pList.getParentId(), pList.getMobileNo(), pList.getName(), pList.getStudentClass()));
                }
                return parentList;
            }else{
                return null;
            }
        }
    }

    @Override
    public boolean saveParentsMessage(ParentDTO parentDto, RegistrationDTO regDto) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            parentRepository.setSession(session);
            regMsgRepository.setSession(session);
            
            session.beginTransaction();
            
            Parent parent=new Parent(
                    parentDto.getMobileNo(),
                    parentDto.getName(),
                    parentDto.getStudentClass()
            );
            
            RegistrationMessagePK regPK=new RegistrationMessagePK(regDto.getRegistrationMessagePK().gettId(), regDto.getRegistrationMessagePK().getParentId());
            
            RegistrationMessage regMsg=new RegistrationMessage(
                    regDto.getRegMsg(),
                    regDto.getParent(),
                    regDto.getTeacher(),
                    regPK
            );
            boolean result=parentRepository.save(parent);
            if(result){
                boolean result2=regMsgRepository.save(regMsg);
                if(result2){
                    session.getTransaction().commit();
                    return true;
                }
            }else{
                if(session.getTransaction()!=null){
                    session.getTransaction().rollback();
                    return false;
                }
            }
            return false;
        }
    }
    
}
