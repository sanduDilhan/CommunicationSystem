/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.resources;

import com.ceyentra.communicationSystem.entity.ClassTeacher;
import com.ceyentra.communicationSystem.entity.Message;
import com.ceyentra.communicationSystem.entity.Parent;
import com.ceyentra.communicationSystem.entity.RegistrationMessage;
import com.ceyentra.communicationSystem.entity.Teacher;
import com.ceyentra.communicationSystem.entity.TeacherRegistration;
import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author sandunDilhan
 */
public class HibernateUtil {

    
    private static SessionFactory sessionFactory;
    private static StandardServiceRegistry standardServiceRegistry;
    
    static{
       
        try{
            standardServiceRegistry=new StandardServiceRegistryBuilder().loadProperties(new File("settings/properties.properties")).build();
            sessionFactory=new MetadataSources(standardServiceRegistry)
                    
                    .addAnnotatedClass(Parent.class)
                    .addAnnotatedClass(ClassTeacher.class)
                    .addAnnotatedClass(TeacherRegistration.class)
                    .addAnnotatedClass(Teacher.class)
                    .addAnnotatedClass(Message.class)
                    .addAnnotatedClass(RegistrationMessage.class)
                    
                    .buildMetadata().buildSessionFactory();
       
        }catch(Throwable ex){
            System.err.println("Initial SessionFactory creation failed." + ex);
            
            StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
            
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
}
