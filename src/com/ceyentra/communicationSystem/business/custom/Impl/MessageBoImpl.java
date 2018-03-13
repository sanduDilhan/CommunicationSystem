/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.business.custom.Impl;

import com.ceyentra.communicationSystem.business.custom.MessageBo;
import com.ceyentra.communicationSystem.entity.Message;
import com.ceyentra.communicationSystem.model.MessageDTO;
import com.ceyentra.communicationSystem.repository.RepositoryFactory;
import com.ceyentra.communicationSystem.repository.custom.MessageRepository;
import com.ceyentra.communicationSystem.resources.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author sandunDilhan
 */
public class MessageBoImpl implements MessageBo{
    private MessageRepository messageRepository;
    public MessageBoImpl() {
        messageRepository=(MessageRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.repositoryTypes.MESSAGE);
    }

    
    @Override
    public boolean saveMessage(MessageDTO messageDto) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            messageRepository.setSession(session);
            session.beginTransaction();
            Message msge=new Message(
                    messageDto.getMessage(),
                    messageDto.getParent(),
                    messageDto.getTeacher(),
                    messageDto.getMessagePk()
            );
            boolean result=messageRepository.save(msge);
            session.getTransaction().commit();
            return result;
        }
    }

    @Override
    public MessageDTO searchMessage(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MessageDTO> fndAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
