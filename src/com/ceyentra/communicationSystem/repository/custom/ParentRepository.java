/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.repository.custom;

import com.ceyentra.communicationSystem.entity.Parent;
import com.ceyentra.communicationSystem.repository.SuperRepository;
import java.util.List;

/**
 *
 * @author sandunDilhan
 */
public interface ParentRepository extends SuperRepository<Parent, Integer>{
    
    public List<Parent> findAllParent(String tCode)throws Exception;
}
