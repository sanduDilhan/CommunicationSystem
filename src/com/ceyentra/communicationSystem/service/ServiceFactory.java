/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.service;

import com.ceyentra.communicationSystem.service.custom.impl.MessageServiceImpl;
import com.ceyentra.communicationSystem.service.custom.impl.ParentServiceImpl;
import com.ceyentra.communicationSystem.service.custom.impl.RegistrationMessageServiceImpl;
import com.ceyentra.communicationSystem.service.custom.impl.TeacherServiceImpl;

/**
 *
 * @author sandunDilhan
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }
    
    public enum ServiceTypes{
        PARENT,MESSAGE,TEACHER,REGISTRATION
    }
    
    public static ServiceFactory getInstance(){
        if(serviceFactory==null){
            serviceFactory=new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceTypes serviceTypes){
        switch(serviceTypes){
            case PARENT:
                return new ParentServiceImpl();
            case TEACHER:
                return new TeacherServiceImpl();
            case MESSAGE:
                return new MessageServiceImpl();
            case REGISTRATION:
                return new RegistrationMessageServiceImpl();
            default:
                return null;
        }
    }
}
