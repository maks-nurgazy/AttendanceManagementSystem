package manas.project.attendance.controller;

import manas.project.attendance.entity.Subject;
import manas.project.attendance.entity.Teacher;
import manas.project.attendance.repository.SubjectRepository;
import manas.project.attendance.repository.TeacherRepository;
import manas.project.attendance.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.websocket.server.PathParam;
import java.security.Principal;

@Controller
public class ContentController {

    UsersRepository usersRepository;

    TeacherRepository teacherRepository;

    SubjectRepository subjectRepository;


    @Autowired
    public void setUsersRepository(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Autowired
    public void setTeacherRepository(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Autowired
    public void setSubjectRepository(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @GetMapping("/content")
    public String getStudentList(@PathParam("subjectName") String subjectName, Model model, Principal principal) {
        Teacher teacher = teacherRepository.findTeacherByUserName(principal.getName());
        Subject subject = subjectRepository.findSubjectByTeacherAndName(teacher, subjectName);
        model.addAttribute("students", subject.getStudents());
        return "content :: studentList";
    }
}
