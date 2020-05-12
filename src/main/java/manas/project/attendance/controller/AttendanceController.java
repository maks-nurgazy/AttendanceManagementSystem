package manas.project.attendance.controller;


import manas.project.attendance.entity.Subject;
import manas.project.attendance.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.List;

@Controller
public class AttendanceController {

    AttendanceService attendanceService;

    @Autowired
    public void setAttendanceService(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    @GetMapping("/attendance")
    public String attendanceList(Model model, Principal principal) {
        List<Subject> subjects = attendanceService.getTeacherSubjects(principal);
        model.addAttribute("subjects", subjects);
        return "attendance/attendanceList";
    }

}
