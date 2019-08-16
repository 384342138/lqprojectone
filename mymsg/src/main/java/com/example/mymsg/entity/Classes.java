package com.example.mymsg.entity;

import java.util.List;
import java.util.Set;

public class Classes {
    private Integer cId;

    private String cName;

//    private Integer tId;
    private Set<Teacher> teacherSet;

    private Set<Student> studentSet;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String CName) {
        this.cName = CName == null ? null : CName.trim();
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                '}';
    }
}