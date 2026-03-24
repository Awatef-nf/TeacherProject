package com.teacherApp.controller;


import com.teacherApp.model.Teacher;
import com.teacherApp.services.TeacherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("teacher")

//@Restcontroller("teacher") : remplace les deux
public class TeacherController {

    @Autowired
    TeacherServices teacherServices;

    @PostMapping("/add")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherServices.createTeacher(teacher);

    }
    //modifier un teacher
    @PostMapping("/modifier/{id}")
    public Teacher updateTeacher(@RequestBody  Teacher teacher) {
        return teacherServices.updateTeacher(teacher);
    }

    //afficher tous  teacher
    @GetMapping("/all")
    public List<Teacher> getAllTeachers() {
        return teacherServices.findAllTeachers();
    }


    //afficher les details d'un teacher
    @GetMapping("/{id}")
    public Teacher findTeacher( @PathVariable Integer id) {
        return teacherServices.findById(id);
    }

    //supprimer un teacher
    @DeleteMapping("/delete/{id}")
    public void deleteTeacher(@PathVariable Integer id) {
         teacherServices.deleteTeacher(id);
    }

}

