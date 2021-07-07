package com.gogo.po;

import java.util.Date;

/**
 * describe
 * 作者：曾昭武
 */
public class User {
    //这个user对象的属性，暂时可以随便定义,以后真真开发的时候，必需与数据库对应
    //在真实开发的时候，数据库中的每一张表都会对应一个PO
    private  int sbqId;
    private  String sbqName;
    private  String sbqSassword;
    private  int tsbqSex;
    private Date sbqDate;
    private  String tsbqAddress;
    private  int sbqState;

    //这个主要是为了讲课，让大家理解
    public User(int sbqId, String sbqName, String sbqSassword, int tsbqSex) {
        this.sbqId = sbqId;
        this.sbqName = sbqName;
        this.sbqSassword = sbqSassword;
        this.tsbqSex = tsbqSex;
        this.sbqDate = sbqDate;
        this.tsbqAddress = tsbqAddress;
        this.sbqState = sbqState;
    }

    public User() {
    }

    public int getSbqId() {
        return sbqId;
    }

    public void setSbqId(int sbqId) {
        this.sbqId = sbqId;
    }

    public String getSbqName() {
        return sbqName;
    }

    public void setSbqName(String sbqName) {
        this.sbqName = sbqName;
    }

    public String getSbqSassword() {
        return sbqSassword;
    }

    public void setSbqSassword(String sbqSassword) {
        this.sbqSassword = sbqSassword;
    }

    public int getTsbqSex() {
        return tsbqSex;
    }

    public void setTsbqSex(int tsbqSex) {
        this.tsbqSex = tsbqSex;
    }

    public Date getSbqDate() {
        return sbqDate;
    }

    public void setSbqDate(Date sbqDate) {
        this.sbqDate = sbqDate;
    }

    public String getTsbqAddress() {
        return tsbqAddress;
    }

    public void setTsbqAddress(String tsbqAddress) {
        this.tsbqAddress = tsbqAddress;
    }

    public int getSbqState() {
        return sbqState;
    }

    public void setSbqState(int sbqState) {
        this.sbqState = sbqState;
    }

    @Override
    public String toString() {
        return "User{" +
                "sbqId=" + sbqId +
                ", sbqName='" + sbqName + '\'' +
                ", sbqSassword='" + sbqSassword + '\'' +
                ", tsbqSex=" + tsbqSex +
                ", sbqDate=" + sbqDate +
                ", tsbqAddress='" + tsbqAddress + '\'' +
                ", sbqState=" + sbqState +
                '}';
    }
}
