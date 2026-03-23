package com.teacherApp.repository;
import com.teacherApp.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// il faut revoir les interfaces
@Repository
public interface TeacherRepository extends JpaRepository<Teacher , Integer> {

}
