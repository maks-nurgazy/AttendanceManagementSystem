package manas.project.attendance.service.impl;

import manas.project.attendance.entity.Subject;
import manas.project.attendance.entity.Teacher;
import manas.project.attendance.entity.User;
import manas.project.attendance.model.Role;
import manas.project.attendance.repository.SubjectRepository;
import manas.project.attendance.repository.TeacherRepository;
import manas.project.attendance.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    SubjectRepository subjectRepository;
    TeacherRepository teacherRepository;

    @Autowired
    public void setSubjectRepository(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Autowired
    public void setTeacherRepository(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Subject> getSubjects(Principal principal) {
        return subjectRepository.findSubjectByTeacherUserName(principal.getName());
    }
}
