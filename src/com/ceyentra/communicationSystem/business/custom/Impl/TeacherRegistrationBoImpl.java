/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.business.custom.Impl;

import com.ceyentra.communicationSystem.business.custom.TeacherRegistrationBo;
import com.ceyentra.communicationSystem.entity.TeacherRegistration;
import com.ceyentra.communicationSystem.model.TeacherRegistrationDTO;
import com.ceyentra.communicationSystem.repository.RepositoryFactory;
import com.ceyentra.communicationSystem.repository.custom.TeacherRegistrationRepository;
import com.ceyentra.communicationSystem.resources.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author sandunDilhan
 */
public class TeacherRegistrationBoImpl implements TeacherRegistrationBo{

    private TeacherRegistrationRepository teacherRegMsg;
    
    public TeacherRegistrationBoImpl() {
        teacherRegMsg=(TeacherRegistrationRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.repositoryTypes.TEACHERREGISTRATION);
    }

    @Override
    public boolean SaveTeacherRegMsg(TeacherRegistrationDTO teacherRegMsgDto) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            teacherRegMsg.setSession(session);
            session.beginTransaction();
            TeacherRegistration teacherReg=new TeacherRegistration(
                    teacherRegMsgDto.getTeacherId(),
                    teacherRegMsgDto.gettName(),
                    teacherRegMsgDto.gettRegMsg(),
                    teacherRegMsgDto.getMaskNo()
            );
            boolean result=teacherRegMsg.save(teacherReg);
            session.getTransaction().commit();
            return result;
        }
    }

}
