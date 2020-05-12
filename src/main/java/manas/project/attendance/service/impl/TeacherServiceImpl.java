package manas.project.attendance.service.impl;

import manas.project.attendance.entity.Teacher;
import manas.project.attendance.repository.TeacherRepository;
import manas.project.attendance.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;

    @Autowired
    public void setTeacherRepository(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher getTeacherByUsername(String userName) {
        return teacherRepository.findTeacherByUserName(userName);
    }
}
