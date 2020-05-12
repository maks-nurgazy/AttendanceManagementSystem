package manas.project.attendance.repository;

import manas.project.attendance.entity.Subject;
import manas.project.attendance.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    Teacher findTeacherByUserName(String userName);
}
