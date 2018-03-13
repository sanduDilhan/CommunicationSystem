/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.repository;

import com.ceyentra.communicationSystem.repository.custom.Impl.MessageRepositoryImpl;
import com.ceyentra.communicationSystem.repository.custom.Impl.ParentRepositoryImpl;
import com.ceyentra.communicationSystem.repository.custom.Impl.RegistrationRepositoryImpl;
import com.ceyentra.communicationSystem.repository.custom.Impl.TeacherRepositoryImpl;

/**
 *
 * @author sandunDilhan
 */
public class RepositoryFactory {
    private static RepositoryFactory repositoryFactory;

    private RepositoryFactory() {
    }
    
    public enum repositoryTypes{
        PARENT,TEACHER,MESSAGE,REGISTRATION
    }
    
    public static RepositoryFactory getInstance(){
        if(repositoryFactory==null){
            repositoryFactory=new RepositoryFactory();
        }
        return repositoryFactory;
    }
    
    public SuperRepository getRepository(repositoryTypes repositoryTypes){
        switch(repositoryTypes){
            case PARENT:
                return new ParentRepositoryImpl();
            case TEACHER:
                return new TeacherRepositoryImpl();
            case MESSAGE:
                return new MessageRepositoryImpl();
            case REGISTRATION:
                return new RegistrationRepositoryImpl();
            default:
                return null;
        }
    }
}
