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
    private int teacherId;
    private int parentId;
    private String regMsg;
    
    private List<Parent> parent;

    public RegistrationDTO() {
    }

    public RegistrationDTO(int pRegMsgId, int teacherId, int parentId, String regMsg, List<Parent> parent) {
        this.pRegMsgId = pRegMsgId;
        this.teacherId = teacherId;
        this.parentId = parentId;
        this.regMsg = regMsg;
        this.parent = parent;
    }
    
    public RegistrationDTO(int teacherId, int parentId, String regMsg, List<Parent> parent) {
        this.teacherId = teacherId;
        this.parentId = parentId;
        this.regMsg = regMsg;
        this.parent = parent;
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
    public int getTeacherId() {
        return teacherId;
    }

    /**
     * @param teacherId the teacherId to set
     */
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * @return the parentId
     */
    public int getParentId() {
        return parentId;
    }

    /**
     * @param parentId the parentId to set
     */
    public void setParentId(int parentId) {
        this.parentId = parentId;
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
    public List<Parent> getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(List<Parent> parent) {
        this.parent = parent;
    }
    
    
}
