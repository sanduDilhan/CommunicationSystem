/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 *
 * @author sandunDilhan
 */
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int msgId;
    private String tCode;
    private int pId;
    private String msg;

    public Message() {
    }

    public Message(int msgId, String tCode, int pId, String msg) {
        this.msgId = msgId;
        this.tCode = tCode;
        this.pId = pId;
        this.msg = msg;
    }
    
     public Message(String tCode, int pId, String msg) {
        this.tCode = tCode;
        this.pId = pId;
        this.msg = msg;
    }

    /**
     * @return the msgId
     */
    public int getMsgId() {
        return msgId;
    }

    /**
     * @param msgId the msgId to set
     */
    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    /**
     * @return the tCode
     */
    public String gettCode() {
        return tCode;
    }

    /**
     * @param tCode the tCode to set
     */
    public void settCode(String tCode) {
        this.tCode = tCode;
    }

    /**
     * @return the pId
     */
    public int getpId() {
        return pId;
    }

    /**
     * @param pId the pId to set
     */
    public void setpId(int pId) {
        this.pId = pId;
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

    @Override
    public String toString() {
        return "Message{" + "msgId=" + msgId + ", tCode=" + tCode + ", pId=" + pId + ", msg=" + msg + '}';
    }
     
    
}
