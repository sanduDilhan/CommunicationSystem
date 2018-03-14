/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.model;

import com.ceyentra.communicationSystem.entity.MessagePK;
import com.ceyentra.communicationSystem.entity.Parent;
import com.ceyentra.communicationSystem.entity.Teacher;
import java.util.List;

/**
 *
 * @author sandunDilhan
 */
public class MessageDTO {
    private String message;
    private Parent parent;
    private Teacher teacher;
    private MessagePK messagePk;

    public MessageDTO() {
    }

    public MessageDTO(String message, Parent parent, Teacher teacher, MessagePK messagePk) {
        this.message = message;
        this.parent = parent;
        this.teacher = teacher;
        this.messagePk = messagePk;
    }
    
    public MessageDTO(String message, Parent parent, Teacher teacher) {
        this.message = message;
        this.parent = parent;
        this.teacher = teacher;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
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
    public Teacher getTeacher() {
        return teacher;
    }

    /**
     * @param teacher the teacher to set
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /**
     * @return the messagePk
     */
    public MessagePK getMessagePk() {
        return messagePk;
    }

    /**
     * @param messagePk the messagePk to set
     */
    public void setMessagePk(MessagePK messagePk) {
        this.messagePk = messagePk;
    }
    
    
    
}
