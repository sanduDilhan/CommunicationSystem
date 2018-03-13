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
public interface ParentBo extends SuperBo{
    
    public boolean saveParent(ParentDTO parentDto)throws Exception;
        
    public ParentDTO searchParent(int parentId)throws Exception;
    
    public List<ParentDTO>fndAll()throws Exception;
    
    public boolean saveParentsMessage(ParentDTO parentDto,RegistrationDTO regDto)throws Exception;
}
