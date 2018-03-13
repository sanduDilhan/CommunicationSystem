/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.business.custom;

import com.ceyentra.communicationSystem.business.SuperBo;
import com.ceyentra.communicationSystem.model.ParentDTO;
import com.ceyentra.communicationSystem.model.RegistrationDTO;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author sandunDilhan
 */
public interface RegistrationMessageBo extends SuperBo{
    
    public boolean saveRegMsg(RegistrationDTO regMsgDto)throws Exception;
        
    public RegistrationDTO searchRegMsg(int id)throws Exception;
    
    public List<RegistrationDTO>fndAll()throws Exception;
}
