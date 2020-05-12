package manas.project.attendance.service;

import manas.project.attendance.entity.Student;

import java.util.List;

public interface ContentService {
    List<Student>getStudentList(String subjectName,String teacherUsername);
}
