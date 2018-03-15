/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.business.custom.Impl;

import com.ceyentra.communicationSystem.business.custom.RegistrationMessageBo;
import com.ceyentra.communicationSystem.entity.RegistrationMessage;
import com.ceyentra.communicationSystem.model.RegistrationDTO;
import com.ceyentra.communicationSystem.repository.RepositoryFactory;
import com.ceyentra.communicationSystem.repository.custom.RegistrationMessageRepository;
import com.ceyentra.communicationSystem.resources.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author sandunDilhan
 */
public class RegistrationMessageBoImpl implements RegistrationMessageBo{
    private RegistrationMessageRepository regMsgRepository;
    
    public RegistrationMessageBoImpl() {
        regMsgRepository=(RegistrationMessageRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.repositoryTypes.REGISTRATION);
    }

    
    @Override
    public boolean saveRegMsg(RegistrationDTO regMsgDto) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            regMsgRepository.setSession(session);
            session.beginTransaction();
            RegistrationMessage regMsg=new RegistrationMessage(
                    regMsgDto.getTeacherId(),
                    regMsgDto.getpName(),
                    regMsgDto.getRegMsg()
            );
            boolean result=regMsgRepository.save(regMsg);
            session.getTransaction().commit();
            return result;
        }
    }

    @Override
    public RegistrationDTO searchRegMsg(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RegistrationDTO> fndAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
