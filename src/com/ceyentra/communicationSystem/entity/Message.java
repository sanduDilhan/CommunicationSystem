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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author sandunDilhan
 */
@Entity
public class Message {
    private String msg;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumns(@JoinColumn(name = "parentId",referencedColumnName = "parentId",insertable = false,updatable = false))
    private Parent parent;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumns(@JoinColumn(name = "tId",referencedColumnName = "tId",insertable = false,updatable = false))
    private List<Teacher> teacher;
    
    @EmbeddedId
    private MessagePK messagePK;

    public Message() {
    }

    public Message(String msg, Parent parent, List<Teacher> teacher, MessagePK messagePK) {
        this.msg = msg;
        this.parent = parent;
        this.teacher = teacher;
        this.messagePK = messagePK;
    }
    
    public Message(String msg, Parent parent, List<Teacher> teacher) {
        this.msg = msg;
        this.parent = parent;
        this.teacher = teacher;
    
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
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
     * @return the messagePK
     */
    public MessagePK getMessagePK() {
        return messagePK;
    }

    /**
     * @param messagePK the messagePK to set
     */
    public void setMessagePK(MessagePK messagePK) {
        this.messagePK = messagePK;
    }

    @Override
    public String toString() {
        return "Message{" + "msg=" + msg + ", parent=" + parent + ", teacher=" + teacher + ", messagePK=" + messagePK + '}';
    }

    
    
}
