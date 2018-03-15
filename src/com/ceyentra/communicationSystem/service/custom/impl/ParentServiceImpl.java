/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.service.custom.impl;

import com.ceyentra.communicationSystem.business.BusinessFactory;
import com.ceyentra.communicationSystem.business.custom.ParentBo;
import com.ceyentra.communicationSystem.model.ParentDTO;
import com.ceyentra.communicationSystem.model.RegistrationDTO;
import com.ceyentra.communicationSystem.service.custom.ParentService;
import java.util.List;

/**
 *
 * @author sandunDilhan
 */
public class ParentServiceImpl implements ParentService{
    private ParentBo parentBo;
    
    public ParentServiceImpl() {
        parentBo=(ParentBo) BusinessFactory.getInstance().getBo(BusinessFactory.BOTypes.PARENT);
    }

    
    @Override
    public boolean saveParent(ParentDTO parentDto) throws Exception {
        return parentBo.saveParent(parentDto);
    }

    @Override
    public ParentDTO searchParent(int parentId) throws Exception {
        return parentBo.searchParent(parentId);
    }

    @Override
    public List<ParentDTO> fndAll() throws Exception {
        return parentBo.fndAll();
    }

    @Override
    public boolean saveParentsMessage(ParentDTO parentDto, RegistrationDTO regDto) throws Exception {
        return parentBo.saveParentsMessage(parentDto, regDto);
    }

    @Override
    public List<ParentDTO> findAllParent(String tCode) throws Exception {
        return parentBo.findAllParent(tCode);
    }
    
}
