/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.service.custom.impl;

import com.ceyentra.communicationSystem.business.BusinessFactory;
import com.ceyentra.communicationSystem.business.custom.TeacherRegistrationBo;
import com.ceyentra.communicationSystem.model.TeacherRegistrationDTO;
import com.ceyentra.communicationSystem.service.custom.TeacherRegistrationService;

/**
 *
 * @author sandunDilhan
 */
public class TeacherRegistrationServiceImpl implements TeacherRegistrationService{

    private TeacherRegistrationBo teacherRegBo;
    
    public TeacherRegistrationServiceImpl() {
        teacherRegBo=(TeacherRegistrationBo) BusinessFactory.getInstance().getBo(BusinessFactory.BOTypes.TEACHERREGISTRATION);
    }
    
    @Override
    public boolean SaveTeacherRegMsg(TeacherRegistrationDTO teacherRegMsgDto) throws Exception {
        return teacherRegBo.SaveTeacherRegMsg(teacherRegMsgDto);
    }
    
}
