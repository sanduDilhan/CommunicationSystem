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
public class ClassTeacherDTO {
    private int calssCode;
    private String calssName;
    private String grade;
    private int noOfStudent;

    public ClassTeacherDTO() {
    }

    public ClassTeacherDTO(int calssCode, String calssName, String grade, int noOfStudent) {
        this.calssCode = calssCode;
        this.calssName = calssName;
        this.grade = grade;
        this.noOfStudent = noOfStudent;
    }

    /**
     * @return the calssCode
     */
    public int getCalssCode() {
        return calssCode;
    }

    /**
     * @param calssCode the calssCode to set
     */
    public void setCalssCode(int calssCode) {
        this.calssCode = calssCode;
    }

    /**
     * @return the calssName
     */
    public String getCalssName() {
        return calssName;
    }

    /**
     * @param calssName the calssName to set
     */
    public void setCalssName(String calssName) {
        this.calssName = calssName;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the noOfStudent
     */
    public int getNoOfStudent() {
        return noOfStudent;
    }

    /**
     * @param noOfStudent the noOfStudent to set
     */
    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }
    
    
}
