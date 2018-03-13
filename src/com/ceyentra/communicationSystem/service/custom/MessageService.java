/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.service.custom;

import com.ceyentra.communicationSystem.model.MessageDTO;
import com.ceyentra.communicationSystem.service.SuperService;
import java.util.List;

/**
 *
 * @author sandunDilhan
 */
public interface MessageService extends SuperService{
    public boolean saveMessage(MessageDTO messageDto)throws Exception;
        
    public MessageDTO searchMessage(int id)throws Exception;
    
    public List<MessageDTO>fndAll()throws Exception;
}
