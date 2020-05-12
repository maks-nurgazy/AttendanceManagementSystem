package manas.project.attendance.controller;

import manas.project.attendance.entity.Student;
import manas.project.attendance.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.websocket.server.PathParam;
import java.security.Principal;
import java.util.List;

@Controller
public class ContentController {

    ContentService contentService;

    @Autowired
    public void setContentService(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping("/content")
    public String studentList(@PathParam("subjectName") String subjectName, Model model, Principal principal) {
        List<Student> students = contentService.getStudentList(subjectName, principal.getName());
        model.addAttribute("students", students);
        return "content :: studentList";
    }
}
