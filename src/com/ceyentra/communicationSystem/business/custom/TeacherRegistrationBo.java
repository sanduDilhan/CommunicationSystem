/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.business.custom;

import com.ceyentra.communicationSystem.business.SuperBo;
import com.ceyentra.communicationSystem.model.TeacherRegistrationDTO;

/**
 *
 * @author sandunDilhan
 */
public interface TeacherRegistrationBo extends SuperBo{
    
    public boolean SaveTeacherRegMsg(TeacherRegistrationDTO teacherRegMsgDto)throws Exception;
}
