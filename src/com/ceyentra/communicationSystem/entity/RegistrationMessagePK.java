/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.entity;

import javax.persistence.Embeddable;

/**
 *
 * @author sandunDilhan
 */
@Embeddable
public class RegistrationMessagePK {
    
    private int tId;
    private int parentId;

    public RegistrationMessagePK() {
    }

    public RegistrationMessagePK(int tId, int parentId) {
        this.tId = tId;
        this.parentId = parentId;
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

    @Override
    public String toString() {
        return "RegistrationMessagePK{" + "tId=" + tId + ", parentId=" + parentId + '}';
    }
    
    
    
}
