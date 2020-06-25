package com.gulishop.gmall.user;


public class Dname {
    private String ename;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Dname() {
    }

    @Override
    public String toString() {
        return "Dname{" +
                "ename='" + ename + '\'' +
                '}';
    }
}