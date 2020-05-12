package manas.project.attendance.service.impl;

import manas.project.attendance.entity.Subject;
import manas.project.attendance.service.AttendanceService;
import manas.project.attendance.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    SubjectService subjectService;

    @Autowired
    public void setSubjectService(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @Override
    public List<Subject> getTeacherSubjects(Principal principal) {
        return subjectService.findSubjectsByTeacherUserName(principal);
    }
}
