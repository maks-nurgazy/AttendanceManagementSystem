package manas.project.attendance.service;

import manas.project.attendance.entity.Subject;
import manas.project.attendance.entity.Teacher;

import java.security.Principal;
import java.util.List;

public interface SubjectService {
    Subject findSubjectByTeacherAndName(Teacher teacher, String subjectName);
    List<Subject> findSubjectsByTeacherUserName(Principal principal);
}
