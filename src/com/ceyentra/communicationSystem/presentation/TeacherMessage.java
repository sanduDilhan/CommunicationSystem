/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceyentra.communicationSystem.presentation;

import com.ceyentra.communicationSystem.entity.ClassTeacher;
import com.ceyentra.communicationSystem.entity.MessagePK;
import com.ceyentra.communicationSystem.entity.Parent;
import com.ceyentra.communicationSystem.entity.Teacher;
import com.ceyentra.communicationSystem.model.ClassTeacherDTO;
import com.ceyentra.communicationSystem.model.MessageDTO;
import com.ceyentra.communicationSystem.model.ParentDTO;
import com.ceyentra.communicationSystem.model.TeacherDTO;
import com.ceyentra.communicationSystem.model.TeacherRegistrationDTO;
import com.ceyentra.communicationSystem.service.ServiceFactory;
import com.ceyentra.communicationSystem.service.custom.MessageService;
import com.ceyentra.communicationSystem.service.custom.ParentService;
import com.ceyentra.communicationSystem.service.custom.TeacherRegistrationService;
import com.ceyentra.communicationSystem.service.custom.TeacherService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sandunDilhan
 */
public class TeacherMessage {

    private static void teacherSmsController(String mask, String msg) {
        TeacherRegistrationService teacherRegService = (TeacherRegistrationService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.TEACHERREGISTRATION);
        TeacherService teacherService = (TeacherService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.TEACHER);
        ParentService parentService = (ParentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.PARENT);
        MessageService msgService=(MessageService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.MESSAGE);
        
        String values = msg.substring(0, 7);

        try {
            int count = 0;
            int count2 = 0;

            if (values.equals("CONFIRM")) {
                String tCode = msg.substring(8, 13);
                int cCode = Integer.parseInt(msg.substring(14, 15));
                System.out.println(cCode);
                String tName = msg.substring(16);
                TeacherRegistrationDTO teacherRegDto = new TeacherRegistrationDTO(tCode, tName, msg, mask);
                TeacherDTO teacherDto = new TeacherDTO(tCode, tName, cCode);

                teacherRegService.SaveTeacherRegMsg(teacherRegDto);
                List<TeacherDTO> teacherDtoList = teacherService.fndAll();

                for (TeacherDTO tDtoList1 : teacherDtoList) {
                    if (!tDtoList1.getTeacherCode().equals(tCode)) {
                        count++;
                    }
                }
                System.out.println("BBB " + count);
                System.out.println("SIZE " + teacherDtoList.size());
                if (teacherDtoList.size() == count) {
                    for (TeacherDTO teacherDtoList2 : teacherDtoList) {
                        if (teacherDtoList2.getcId() != cCode) {
                            count2++;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please input valid TEACHER CODE");
                }
                if (teacherDtoList.size() == count2) {
                    teacherService.saveTeacher(teacherDto);
                    JOptionPane.showMessageDialog(null, "saved SUCCESSFULLY");
                } else {
                    JOptionPane.showMessageDialog(null, "A teacher has already registered to this class");
                }
            } else {
                String tCode=msg.substring(0, 5);
                String pMsg=msg.substring(6);
                int tId=0;
                int x=0;
                List<TeacherDTO>getAllTeacher=teacherService.fndAll();
                for (TeacherDTO allTeacher : getAllTeacher) {
                    if(allTeacher.getTeacherCode().equals(tCode)){
                        tId=allTeacher.gettId();
                    }
                }
               
                List<ParentDTO> getAllParent = parentService.findAllParent(tCode);
                for (ParentDTO allParent : getAllParent) {
                    MessageDTO msgDto=new MessageDTO(tCode, allParent.getParentId() , pMsg);
                    msgService.saveMessage(msgDto);
                    System.out.println(allParent.getName());
                    x++;
                }
                if(getAllParent.size()==x){
                    JOptionPane.showMessageDialog(null, "Your Message Is Send Success");
                }
                for (ParentDTO allParent1 : getAllParent) {
                    System.out.println(allParent1.getName());
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(TeacherMessage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        teacherSmsController("21321das", "CONFIRM t0003 3 SandunDilhan");
    }

}
