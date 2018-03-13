/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.service.custom.impl;

import com.ceyentra.communicationSystem.business.BusinessFactory;
import com.ceyentra.communicationSystem.business.custom.MessageBo;
import com.ceyentra.communicationSystem.model.MessageDTO;
import com.ceyentra.communicationSystem.service.custom.MessageService;
import java.util.List;

/**
 *
 * @author sandunDilhan
 */
public class MessageServiceImpl implements MessageService{

    private MessageBo messageBo;
    
    public MessageServiceImpl() {
        messageBo=(MessageBo) BusinessFactory.getInstance().getBo(BusinessFactory.BOTypes.MESSAGE);
    }

    
    @Override
    public boolean saveMessage(MessageDTO messageDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
