/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.service.custom;

import com.ceyentra.communicationSystem.model.RegistrationDTO;
import com.ceyentra.communicationSystem.service.SuperService;
import java.util.List;

/**
 *
 * @author sandunDilhan
 */
public interface RegistrationMessageService extends SuperService{
    
    public boolean saveRegMsg(RegistrationDTO regMsgDto)throws Exception;
        
    public RegistrationDTO searchRegMsg(int id)throws Exception;
    
    public List<RegistrationDTO>fndAll()throws Exception;
}
