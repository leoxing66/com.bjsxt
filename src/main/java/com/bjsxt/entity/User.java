package com.bjsxt.entity;

import java.io.Serializable;

public class User implements Serializable {

    private Integer uid;
    private String uname;
    private String pwd;


    public User() {
    }

    public User(Integer uid, String uname, String pwd) {
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
