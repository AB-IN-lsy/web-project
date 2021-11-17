package com.entity;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private Date insertTime;
    private Date updateTime;

    public User() {
    }
    public User(int id, String name, Date insertTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.insertTime = insertTime;
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
