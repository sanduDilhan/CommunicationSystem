/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.repository;

import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author sandunDilhan
 */
public interface SuperRepository<T,ID> {
    
    public void setSession(Session session)throws Exception;
    
    public boolean save(T t)throws Exception;
        
    public T findById(ID id)throws Exception;
    
    public List<T>fndAll()throws Exception;
}
