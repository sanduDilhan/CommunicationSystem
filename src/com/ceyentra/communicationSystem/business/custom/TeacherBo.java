/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.business.custom;

import com.ceyentra.communicationSystem.business.SuperBo;
import com.ceyentra.communicationSystem.model.ParentDTO;
import com.ceyentra.communicationSystem.model.TeacherDTO;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author sandunDilhan
 */
public interface TeacherBo extends SuperBo{
    
    public boolean saveTeacher(TeacherDTO teacherDto)throws Exception;
        
    public TeacherDTO searchTeacher(int teacherId)throws Exception;
    
    public List<TeacherDTO>fndAll()throws Exception;
}
