package manas.project.attendance.controller;


import manas.project.attendance.config.UserDetailsImpl;
import manas.project.attendance.entity.Subject;
import manas.project.attendance.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.List;

@Controller
public class AttendanceController {

    SubjectService subjectService;

    @Autowired
    public void setSubjectService(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping("/attendance")
    public String attendanceList(Model model, Principal principal) {
        List<Subject> subjects = subjectService.getSubjects(principal);
        model.addAttribute("subjects",subjects);
        return "attendance/attendanceList";
    }

}
