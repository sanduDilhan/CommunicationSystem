/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.model;

import com.ceyentra.communicationSystem.entity.Parent;
import com.ceyentra.communicationSystem.entity.RegistrationMessagePK;
import com.ceyentra.communicationSystem.entity.Teacher;
import java.util.List;

/**
 *
 * @author sandunDilhan
 */
public class RegistrationDTO {
    
    private String regMsg;
    private Parent parent;
    private List<Teacher> teacher;
    private RegistrationMessagePK registrationMessagePK;

    public RegistrationDTO() {
    }

    public RegistrationDTO(String regMsg, Parent parent, List<Teacher> teacher, RegistrationMessagePK registrationMessagePK) {
        this.regMsg = regMsg;
        this.parent = parent;
        this.teacher = teacher;
        this.registrationMessagePK = registrationMessagePK;
    }

    /**
     * @return the regMsg
     */
    public String getRegMsg() {
        return regMsg;
    }

    /**
     * @param regMsg the regMsg to set
     */
    public void setRegMsg(String regMsg) {
        this.regMsg = regMsg;
    }

    /**
     * @return the parent
     */
    public Parent getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(Parent parent) {
        this.parent = parent;
    }

    /**
     * @return the teacher
     */
    public List<Teacher> getTeacher() {
        return teacher;
    }

    /**
     * @param teacher the teacher to set
     */
    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    /**
     * @return the registrationMessagePK
     */
    public RegistrationMessagePK getRegistrationMessagePK() {
        return registrationMessagePK;
    }

    /**
     * @param registrationMessagePK the registrationMessagePK to set
     */
    public void setRegistrationMessagePK(RegistrationMessagePK registrationMessagePK) {
        this.registrationMessagePK = registrationMessagePK;
    }

   
}
