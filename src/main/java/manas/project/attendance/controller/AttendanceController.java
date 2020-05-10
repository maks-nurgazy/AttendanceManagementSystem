package manas.project.attendance.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class AttendanceController {

    @GetMapping("/attendance")
    public String attendanceList(Model model, Principal principal)
    {




        return "attendance/attendanceList";
    }

}
