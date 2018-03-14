/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.business.custom.Impl;

import com.ceyentra.communicationSystem.business.custom.TeacherBo;
import com.ceyentra.communicationSystem.entity.ClassTeacher;
import com.ceyentra.communicationSystem.entity.Teacher;
import com.ceyentra.communicationSystem.model.ClassTeacherDTO;
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
                    teacherDto.getClassTeacher()
            
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
                return new TeacherDTO(teacher.gettId(), teacher.getTeacherCode(), teacher.getTeacherName(), teacher.getClassTeacher());
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
            List<Teacher>teacherList=teacherRepository.fndAll();
            session.getTransaction().commit();
            if(teacherList!=null){
                List<TeacherDTO>teacherDtoList=new ArrayList<>();
                for (Teacher tList : teacherList) {
                    TeacherDTO teacherDto=new TeacherDTO(
                            tList.gettId(),
                            tList.getTeacherCode(),
                            tList.getTeacherName(),
                            new ClassTeacher(tList.getClassTeacher().getCalssCode(), tList.getClassTeacher().getCalssName(), tList.getClassTeacher().getGrade(), tList.getClassTeacher().getNoOfStudent())
                    );
                    teacherDtoList.add(teacherDto);
                }
                return teacherDtoList;
            }else{
                return null;
            }
            
        }
    }
    
}
