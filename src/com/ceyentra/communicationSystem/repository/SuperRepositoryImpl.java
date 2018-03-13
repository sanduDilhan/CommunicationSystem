/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author sandunDilhan
 */
public abstract class SuperRepositoryImpl<T,ID extends Serializable> implements SuperRepository<T, ID>{
    
    protected Session session;
    
    private Class<T> entity;

    public SuperRepositoryImpl() {
        entity=(Class<T>) ((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]; 
        
    }

    @Override
    public void setSession(Session session) throws Exception {
        this.session=session;
    }

    @Override
    public boolean save(T t) throws Exception {
        return (session.save(t)!=null);
    }

    @Override
    public T findById(ID id) throws Exception {
        return (T)session.get(entity, id);
    }

    @Override
    public List<T> fndAll() throws Exception {
       return session.createQuery("FROM " + entity.getSimpleName()).list();
    }
    
    
}
