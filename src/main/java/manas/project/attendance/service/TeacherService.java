package manas.project.attendance.service;

import manas.project.attendance.entity.Teacher;

public interface TeacherService {
    Teacher getTeacherByUsername(String userName);
}
