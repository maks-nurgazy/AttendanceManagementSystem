package manas.project.attendance.repository;

import manas.project.attendance.entity.Subject;
import manas.project.attendance.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    Subject findSubjectByName(String name);

    Subject findSubjectByTeacherAndName(Teacher teacher, String subjectName);

    List<Subject> findSubjectByTeacherUserName(String userName);
}
