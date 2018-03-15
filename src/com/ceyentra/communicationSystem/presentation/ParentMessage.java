/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.presentation;

import com.ceyentra.communicationSystem.entity.RegistrationMessage;
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
import javax.swing.JOptionPane;

/**
 *
 * @author sandunDilhan
 */
public class ParentMessage {

    private static void parentSmsController(String maskCode, String regMsg) {

        ParentService parentService = (ParentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.PARENT);
        TeacherService teacherService = (TeacherService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.TEACHER);
        RegistrationMessageService regMsgService = (RegistrationMessageService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.REGISTRATION);

        String values = regMsg.substring(0, 3);
        String tCode = regMsg.substring(4, 9);
        String pName = regMsg.substring(10);

        try {
            int count=0;
            int count2=0;
            RegistrationDTO regDto = new RegistrationDTO(tCode, pName, regMsg);
            regMsgService.saveRegMsg(regDto);
            
            ParentDTO parentDto=new ParentDTO(maskCode, pName, tCode);

            List<TeacherDTO> getAllTeacher = teacherService.fndAll();
            System.out.println(getAllTeacher.size());
            for (TeacherDTO allTeacher : getAllTeacher) {
                if (allTeacher.getTeacherCode().equals(tCode)) {
                    if(values.equals("ADD")){
                        parentService.saveParent(parentDto);
                        JOptionPane.showMessageDialog(null, "Registration SuccessFull");
                        count2++;
                        System.out.println("Registration SuccessFully");
                    }else{
                        JOptionPane.showMessageDialog(null, "Please input correct ORDER or TEACHER CODE");
                        System.out.println("Please input correct ORDER or TEACHER CODE");
                    }
                } else {
                    count++;
                    //System.out.println("Please input correct ORDER or TEACHER CODE");
                }
              
                if(getAllTeacher.size()-1==count2){
                    //parentService.saveParent(parentDto);
                    //JOptionPane.showMessageDialog(null, "Registration SuccessFull");
                }
                if(getAllTeacher.size()==count){
                    JOptionPane.showMessageDialog(null, "Please input correct TEACHER CODE");
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(ParentMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        parentSmsController("1234gfgh5asd", "ADD t0001 dilhan");
    }

}
