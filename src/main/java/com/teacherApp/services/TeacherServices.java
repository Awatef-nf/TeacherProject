package com.teacherApp.services;

import com.teacherApp.model.ClassRoom;
import com.teacherApp.model.Teacher;
import com.teacherApp.repository.TeacherRepository;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class TeacherServices {
    private final TeacherRepository teacherRepository;

    public TeacherServices(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    //creation d'un nouveau teacher
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
