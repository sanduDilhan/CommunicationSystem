/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.model;

import com.ceyentra.communicationSystem.entity.Parent;
import java.util.List;

/**
 *
 * @author sandunDilhan
 */
public class RegistrationDTO {
    private int pRegMsgId;
    private String teacherId;
    private String pName;
    private String regMsg;

    public RegistrationDTO() {
    }

    public RegistrationDTO(int pRegMsgId, String teacherId, String pName, String regMsg) {
        this.pRegMsgId = pRegMsgId;
        this.teacherId = teacherId;
        this.pName = pName;
        this.regMsg = regMsg;
    }
    
    public RegistrationDTO(String teacherId, String pName, String regMsg) {
        this.teacherId = teacherId;
        this.pName = pName;
        this.regMsg = regMsg;
    }

    /**
     * @return the pRegMsgId
     */
    public int getpRegMsgId() {
        return pRegMsgId;
    }

    /**
     * @param pRegMsgId the pRegMsgId to set
     */
    public void setpRegMsgId(int pRegMsgId) {
        this.pRegMsgId = pRegMsgId;
    }

    /**
     * @return the teacherId
     */
    public String getTeacherId() {
        return teacherId;
    }

    /**
     * @param teacherId the teacherId to set
     */
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * @return the pName
     */
    public String getpName() {
        return pName;
    }

    /**
     * @param pName the pName to set
     */
    public void setpName(String pName) {
        this.pName = pName;
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
    
    
}
