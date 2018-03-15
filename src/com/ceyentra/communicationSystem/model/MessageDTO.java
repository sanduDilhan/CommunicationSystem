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
    private int msgId;
    private String tCode;
    private int pId;
    private String msg;

    public MessageDTO() {
    }

    public MessageDTO(int msgId, String tCode, int pId, String msg) {
        this.msgId = msgId;
        this.tCode = tCode;
        this.pId = pId;
        this.msg = msg;
    }
    
    public MessageDTO(String tCode, int pId, String msg) {
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
    
}
