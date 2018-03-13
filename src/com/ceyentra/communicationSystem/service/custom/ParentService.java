/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.service.custom;

import com.ceyentra.communicationSystem.model.ParentDTO;
import com.ceyentra.communicationSystem.model.RegistrationDTO;
import com.ceyentra.communicationSystem.service.SuperService;
import java.util.List;

/**
 *
 * @author sandunDilhan
 */
public interface ParentService extends SuperService{
    public boolean saveParent(ParentDTO parentDto)throws Exception;
        
    public ParentDTO searchParent(int parentId)throws Exception;
    
    public List<ParentDTO>fndAll()throws Exception;
    
    public boolean saveParentsMessage(ParentDTO parentDto,RegistrationDTO regDto)throws Exception;
}
