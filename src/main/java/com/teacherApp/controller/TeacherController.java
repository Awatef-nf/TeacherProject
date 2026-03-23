package com.teacherApp.controller;


import com.teacherApp.model.Teacher;
import com.teacherApp.services.TeacherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}