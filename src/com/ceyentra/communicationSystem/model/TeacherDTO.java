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
public class TeacherDTO {
    private int tId;
    private String teacherCode;
    private String teacherName;
    private String tClass;

    public TeacherDTO() {
    }

    public TeacherDTO(int tId, String teacherCode, String teacherName, String tClass) {
        this.tId = tId;
        this.teacherCode = teacherCode;
        this.teacherName = teacherName;
        this.tClass = tClass;
    }
    
    public TeacherDTO(String teacherCode, String teacherName, String tClass) {
        this.teacherCode = teacherCode;
        this.teacherName = teacherName;
        this.tClass = tClass;
    }

    /**
     * @return the tId
     */
    public int gettId() {
        return tId;
    }

    /**
     * @param tId the tId to set
     */
    public void settId(int tId) {
        this.tId = tId;
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

    /**
     * @return the teacherName
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * @param teacherName the teacherName to set
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * @return the tClass
     */
    public String gettClass() {
        return tClass;
    }

    /**
     * @param tClass the tClass to set
     */
    public void settClass(String tClass) {
        this.tClass = tClass;
    }
    
    
}
