/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.business.custom.Impl;

import com.ceyentra.communicationSystem.business.custom.TeacherBo;
import com.ceyentra.communicationSystem.entity.Teacher;
import com.ceyentra.communicationSystem.model.TeacherDTO;
import com.ceyentra.communicationSystem.repository.RepositoryFactory;
import com.ceyentra.communicationSystem.repository.custom.TeacherRepository;
import com.ceyentra.communicationSystem.resources.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author sandunDilhan
 */
public class TeacherBoImpl implements TeacherBo{
    private TeacherRepository teacherRepository;
    
    public TeacherBoImpl() {
        teacherRepository=(TeacherRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.repositoryTypes.TEACHER);
    }

    
    @Override
    public boolean saveTeacher(TeacherDTO teacherDto) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            teacherRepository.setSession(session);
            session.beginTransaction();
            Teacher teacher=new Teacher(
                    teacherDto.getTeacherCode(),
                    teacherDto.getTeacherName(),
                    teacherDto.gettClass()
            );
            boolean result=teacherRepository.save(teacher);
            session.getTransaction().commit();
            return result;
        }
    }

    @Override
    public TeacherDTO searchTeacher(int teacherId) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            teacherRepository.setSession(session);
            session.beginTransaction();
            Teacher teacher=teacherRepository.findById(teacherId);
            if(teacher!=null){
                session.beginTransaction().commit();
                return new TeacherDTO(teacher.gettId(), teacher.getTeacherCode(), teacher.getTeacherName(), teacher.gettClass());
            }else{
                return null;
            }
        }
    }

    @Override
    public List<TeacherDTO> fndAll() throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            teacherRepository.setSession(session);
            session.beginTransaction();
            List<TeacherDTO>teacherList=new ArrayList<>();
            if(teacherRepository.fndAll()!=null){
                for (TeacherDTO teacherList1 : teacherList) {
                    teacherList.add(new TeacherDTO(teacherList1.gettId(), teacherList1.getTeacherCode(), teacherList1.getTeacherName(), teacherList1.gettClass()));
                }
                return teacherList;
            }else{
                return null;
            }
        }
    }
    
}
