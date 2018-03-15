/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.model;

/**
 *
 * @author sandunDilhan
 */
public class TeacherRegistrationDTO {
    private int tRegMsgId;
    private String teacherId;
    private String tName;
    private String tRegMsg;
    private String maskNo;

    public TeacherRegistrationDTO() {
    }

    public TeacherRegistrationDTO(int tRegMsgId, String teacherId, String tName, String tRegMsg, String maskNo) {
        this.tRegMsgId = tRegMsgId;
        this.teacherId = teacherId;
        this.tName = tName;
        this.tRegMsg = tRegMsg;
        this.maskNo = maskNo;
    }
    
    public TeacherRegistrationDTO(String teacherId, String tName, String tRegMsg, String maskNo) {
        this.teacherId = teacherId;
        this.tName = tName;
        this.tRegMsg = tRegMsg;
        this.maskNo = maskNo;
    }

    /**
     * @return the tRegMsgId
     */
    public int gettRegMsgId() {
        return tRegMsgId;
    }

    /**
     * @param tRegMsgId the tRegMsgId to set
     */
    public void settRegMsgId(int tRegMsgId) {
        this.tRegMsgId = tRegMsgId;
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
     * @return the tName
     */
    public String gettName() {
        return tName;
    }

    /**
     * @param tName the tName to set
     */
    public void settName(String tName) {
        this.tName = tName;
    }

    /**
     * @return the tRegMsg
     */
    public String gettRegMsg() {
        return tRegMsg;
    }

    /**
     * @param tRegMsg the tRegMsg to set
     */
    public void settRegMsg(String tRegMsg) {
        this.tRegMsg = tRegMsg;
    }

    /**
     * @return the maskNo
     */
    public String getMaskNo() {
        return maskNo;
    }

    /**
     * @param maskNo the maskNo to set
     */
    public void setMaskNo(String maskNo) {
        this.maskNo = maskNo;
    }
    
    
}
