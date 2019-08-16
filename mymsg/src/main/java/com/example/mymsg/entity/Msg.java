package com.example.mymsg.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Msg {
    private int id;
    private String author;
    private String msg;
    private Timestamp date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }
}
