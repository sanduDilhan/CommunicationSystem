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
public class ParentDTO {
    private int parentId;
    private int mobileNo;
    private String name;
    private String teacherCode;

    public ParentDTO() {
    }

    public ParentDTO(int parentId, int mobileNo, String name, String teacherCode) {
        this.parentId = parentId;
        this.mobileNo = mobileNo;
        this.name = name;
        this.teacherCode = teacherCode;
    }

    public ParentDTO(int mobileNo, String name, String teacherCode) {
        this.mobileNo = mobileNo;
        this.name = name;
        this.teacherCode = teacherCode;
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
     * @return the mobileNo
     */
    public int getMobileNo() {
        return mobileNo;
    }

    /**
     * @param mobileNo the mobileNo to set
     */
    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the teacherCode
     */
    public String getTeacherCode() {
        return teacherCode;
    }

    /**
     * @param teacherCode the teacherCode to set
     */
    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }
    
    
}
