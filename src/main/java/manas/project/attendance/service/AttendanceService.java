package manas.project.attendance.service;

import manas.project.attendance.entity.Subject;

import java.security.Principal;
import java.util.List;

public interface AttendanceService {
    List<Subject> getTeacherSubjects(Principal principal);
}
