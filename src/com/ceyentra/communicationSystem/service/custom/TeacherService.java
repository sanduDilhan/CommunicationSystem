/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.service.custom;

import com.ceyentra.communicationSystem.model.TeacherDTO;
import com.ceyentra.communicationSystem.service.SuperService;
import java.util.List;

/**
 *
 * @author sandunDilhan
 */
public interface TeacherService extends SuperService{
    public boolean saveTeacher(TeacherDTO teacherDto)throws Exception;
        
    public TeacherDTO searchTeacher(int teacherId)throws Exception;
    
    public List<TeacherDTO>fndAll()throws Exception;
}
