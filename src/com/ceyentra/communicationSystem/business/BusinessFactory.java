/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.business;

import com.ceyentra.communicationSystem.business.custom.Impl.MessageBoImpl;
import com.ceyentra.communicationSystem.business.custom.Impl.ParentBoImpl;
import com.ceyentra.communicationSystem.business.custom.Impl.RegistrationMessageBoImpl;
import com.ceyentra.communicationSystem.business.custom.Impl.TeacherBoImpl;

/**
 *
 * @author sandunDilhan
 */
public class BusinessFactory {
    
    private static BusinessFactory boFactory;

    private BusinessFactory() {
    }
    
    public enum BOTypes{
        PARENT,TEACHER,MESSAGE,REGISTRATION
    }
    
    public static BusinessFactory getInstance(){
        if(boFactory==null){
            boFactory=new BusinessFactory();
        }
        return boFactory;
    }
    
    public SuperBo getBo(BOTypes boTypes){
        switch(boTypes){
            case PARENT:
                return new ParentBoImpl();
            case TEACHER:
                return new TeacherBoImpl();
            case MESSAGE:
                return new MessageBoImpl();
            case REGISTRATION:
                return new RegistrationMessageBoImpl();
                default:
                    return null;
        }
    }
}
