/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.service.custom;

import com.ceyentra.communicationSystem.model.TeacherRegistrationDTO;
import com.ceyentra.communicationSystem.service.SuperService;

/**
 *
 * @author sandunDilhan
 */
public interface TeacherRegistrationService extends SuperService{
    
    public boolean SaveTeacherRegMsg(TeacherRegistrationDTO teacherRegMsgDto)throws Exception;
}
