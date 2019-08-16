package com.example.mymsg.entity;

public class Student {
    private Integer stuId;

    private String stuName;

//    private Integer cId;

    private Classes classes;


    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

//    public Integer getcId() {
//        return cId;
//    }
//
//    public void setcId(Integer cId) {
//        this.cId = cId;
//    }


    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", classes=" + classes +
                '}';
    }
}