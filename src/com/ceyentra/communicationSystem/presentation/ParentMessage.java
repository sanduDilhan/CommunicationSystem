/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.presentation;

import com.ceyentra.communicationSystem.entity.Teacher;
import com.ceyentra.communicationSystem.model.ParentDTO;
import com.ceyentra.communicationSystem.model.RegistrationDTO;
import com.ceyentra.communicationSystem.model.TeacherDTO;
import com.ceyentra.communicationSystem.service.ServiceFactory;
import com.ceyentra.communicationSystem.service.custom.ParentService;
import com.ceyentra.communicationSystem.service.custom.RegistrationMessageService;
import com.ceyentra.communicationSystem.service.custom.TeacherService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sandunDilhan
 */
public class ParentMessage {
    
    private static void parentSmsController(){
        System.out.println("First sout");
        ParentService parentService=(ParentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.PARENT);
        TeacherService teacherService=(TeacherService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.TEACHER);
        RegistrationMessageService regMsgService=(RegistrationMessageService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);
        
        String regMsg="ADD 0774954012 t0001 Athukorala";
        String values=regMsg.substring(0, 3);
        String mNo=regMsg.substring(4, 14);
        int mobileNo=Integer.parseInt(mNo);
        String tCode=regMsg.substring(15, 20);
        String pName=regMsg.substring(21);
        System.out.println("Working");
        try {
            ParentDTO parentDto=new ParentDTO(mobileNo, pName, tCode);
            //parentService.saveParent(parentDto);
            
            //RegistrationDTO regDto=new RegistrationDTO(mobileNo, mobileNo, regMsg, null)
            List<TeacherDTO>getAllTeacher=teacherService.fndAll();
            System.out.println(getAllTeacher.size());
            for (TeacherDTO allTeacher : getAllTeacher) {
                if(allTeacher.getTeacherCode().equals(tCode)){
                    
                }else{
                    System.out.println("Please input correct ORDER or TEACHER CODE");
                }
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ParentMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        parentSmsController();
    }
    
}
