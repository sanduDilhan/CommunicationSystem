/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author sandunDilhan
 */
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tId;
    private String teacherCode;
    private String teacherName;
    private int cId;

    public Teacher() {
    }

    public Teacher(int tId, String teacherCode, String teacherName, int cId) {
        this.tId = tId;
        this.teacherCode = teacherCode;
        this.teacherName = teacherName;
        this.cId = cId;
    }

    public Teacher(String teacherCode, String teacherName, int cId) {
        this.teacherCode = teacherCode;
        this.teacherName = teacherName;
        this.cId = cId;
    }
    
    public Teacher(String teacherCode) {
        this.teacherCode = teacherCode;
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
     * @return the cId
     */
    public int getcId() {
        return cId;
    }

    /**
     * @param cId the cId to set
     */
    public void setcId(int cId) {
        this.cId = cId;
    }

    @Override
    public String toString() {
        return "Teacher{" + "tId=" + tId + ", teacherCode=" + teacherCode + ", teacherName=" + teacherName + ", cId=" + cId + '}';
    }
    
    
}
