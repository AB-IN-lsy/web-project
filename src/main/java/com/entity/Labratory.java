package com.entity;

import java.util.Date;

/**
 * @Author: NEFU AB-IN
 * @Time : 2021/11/21 15:49
 * @Project : test
 */
public class Labratory {
    private int lId;
    private String lName;
    private String lLabel;
    private String lContent;
    private Date insertTime;
    private Date updateTime;

    public Labratory(int lId, String lName, String lLabel, String lContent, Date insertTime, Date updateTime) {
        this.lId = lId;
        this.lName = lName;
        this.lLabel = lLabel;
        this.lContent = lContent;
        this.insertTime = insertTime;
        this.updateTime = updateTime;
    }

    public Labratory() {

    }

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlLabel() {
        return lLabel;
    }

    public void setlLabel(String lLabel) {
        this.lLabel = lLabel;
    }

    public String getlContent() {
        return lContent;
    }

    public void setlContent(String lContent) {
        this.lContent = lContent;
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
