/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author sandunDilhan
 */
@Entity
public class RegistrationMessage {
   
    private String regMsg;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumns(@JoinColumn(name = "parentId",referencedColumnName = "parentId",insertable = false,updatable = false))
    private Parent parent;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumns(@JoinColumn(name = "tId",referencedColumnName = "tId",insertable = false,updatable = false))
    private List<Teacher> teacher;

    @EmbeddedId
    private RegistrationMessagePK registrationMessagePK;

    public RegistrationMessage() {
    }

    public RegistrationMessage(String regMsg, Parent parent, List<Teacher> teacher, RegistrationMessagePK registrationMessagePK) {
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

    @Override
    public String toString() {
        return "RegistrationMessage{" + "regMsg=" + regMsg + ", parent=" + parent + ", teacher=" + teacher + ", registrationMessagePK=" + registrationMessagePK + '}';
    }

}   
