/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.service.custom.impl;

import com.ceyentra.communicationSystem.business.BusinessFactory;
import com.ceyentra.communicationSystem.business.custom.RegistrationMessageBo;
import com.ceyentra.communicationSystem.model.RegistrationDTO;
import com.ceyentra.communicationSystem.service.custom.RegistrationMessageService;
import java.util.List;

/**
 *
 * @author sandunDilhan
 */
public class RegistrationMessageServiceImpl implements RegistrationMessageService{

    private RegistrationMessageBo regMsgBo;
    
    public RegistrationMessageServiceImpl() {
        regMsgBo=(RegistrationMessageBo) BusinessFactory.getInstance().getBo(BusinessFactory.BOTypes.REGISTRATION);
    }

    @Override
    public boolean saveRegMsg(RegistrationDTO regMsgDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrationDTO searchRegMsg(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<RegistrationDTO> fndAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
