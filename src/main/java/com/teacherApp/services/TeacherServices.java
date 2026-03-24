package com.teacherApp.services;

import com.teacherApp.model.ClassRoom;
import com.teacherApp.model.Teacher;
import com.teacherApp.repository.TeacherRepository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
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


    //mise à jour un teacher
    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    //chercher un teacher
    public Teacher findById(int id) {
       return teacherRepository.findById(id)
                .orElseThrow(
                        () -> new IllegalArgumentException("this teacher " + id + " not found")
                );
    }

    //chercher tous teachers
    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }

    //supprimer un teacher
    public void deleteTeacher(Integer id) {
        teacherRepository.deleteById(id);
    }




}