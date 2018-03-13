/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.business.custom;

import com.ceyentra.communicationSystem.business.SuperBo;
import com.ceyentra.communicationSystem.model.MessageDTO;
import com.ceyentra.communicationSystem.model.ParentDTO;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author sandunDilhan
 */
public interface MessageBo extends SuperBo{
   
    public boolean saveMessage(MessageDTO messageDto)throws Exception;
        
    public MessageDTO searchMessage(int id)throws Exception;
    
    public List<MessageDTO>fndAll()throws Exception;
}
