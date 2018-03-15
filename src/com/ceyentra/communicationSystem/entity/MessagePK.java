/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author sandunDilhan
 */
@Embeddable
public class MessagePK implements Serializable{
    
    private int tId;
    private int parentId;
     
    public MessagePK() {
    }

    public MessagePK(int tId, int parentId) {
        this.tId = tId;
        this.parentId = parentId;
    }

}
