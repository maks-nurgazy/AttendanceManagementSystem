package manas.project.attendance.service.impl;

import manas.project.attendance.entity.Subject;
import manas.project.attendance.entity.Teacher;
import manas.project.attendance.repository.SubjectRepository;
import manas.project.attendance.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    private SubjectRepository subjectRepository;

    @Autowired
    public void setSubjectRepository(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<Subject> findSubjectsByTeacherUserName(Principal principal) {
        return subjectRepository.findSubjectByTeacherUserName(principal.getName());
    }

    @Override
    public Subject findSubjectByTeacherAndName(Teacher teacher, String subjectName) {
        return subjectRepository.findSubjectByTeacherAndName(teacher, subjectName);
    }
}
