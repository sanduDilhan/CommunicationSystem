/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.service.custom.impl;

import com.ceyentra.communicationSystem.business.BusinessFactory;
import com.ceyentra.communicationSystem.business.custom.TeacherBo;
import com.ceyentra.communicationSystem.model.TeacherDTO;
import com.ceyentra.communicationSystem.service.custom.TeacherService;
import java.util.List;

/**
 *
 * @author sandunDilhan
 */
public class TeacherServiceImpl implements TeacherService{

    private TeacherBo teacherBo;
    
    public TeacherServiceImpl() {
        teacherBo=(TeacherBo) BusinessFactory.getInstance().getBo(BusinessFactory.BOTypes.TEACHER);
    }

    @Override
    public boolean saveTeacher(TeacherDTO teacherDto) throws Exception {
        return teacherBo.saveTeacher(teacherDto);
    }

    @Override
    public TeacherDTO searchTeacher(int teacherId) throws Exception {
        return teacherBo.searchTeacher(teacherId);
    }

    @Override
    public List<TeacherDTO> fndAll() throws Exception {
        return teacherBo.fndAll();
    }
    
}
