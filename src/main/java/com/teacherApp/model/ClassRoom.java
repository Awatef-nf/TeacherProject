package com.teacherApp.model;


import javax.persistence.*;

@Entity
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true)
    private String classRoomNumber;

    public ClassRoom(String classRoomNumber) {
        this.classRoomNumber = classRoomNumber;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassRoomNumber() {
        return classRoomNumber;
    }

    public void setClassRoomNumber(String classRoomNumber) {
        this.classRoomNumber = classRoomNumber;
    }
}
