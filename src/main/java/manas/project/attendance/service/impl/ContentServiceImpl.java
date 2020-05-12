package manas.project.attendance.service.impl;

import manas.project.attendance.entity.Student;
import manas.project.attendance.entity.Subject;
import manas.project.attendance.entity.Teacher;
import manas.project.attendance.service.ContentService;
import manas.project.attendance.service.SubjectService;
import manas.project.attendance.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

    private TeacherService teacherService;
    private SubjectService subjectService;


    @Autowired
    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Autowired
    public void setSubjectService(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @Override
    public List<Student> getStudentList(String subjectName, String teacherUsername) {
        Teacher teacher = teacherService.getTeacherByUsername(teacherUsername);
        Subject subject = subjectService.findSubjectByTeacherAndName(teacher, subjectName);
        return subject.getStudents();
    }
}
