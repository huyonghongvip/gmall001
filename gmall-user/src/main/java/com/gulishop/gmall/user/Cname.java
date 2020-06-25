package com.gulishop.gmall.user;


public class Cname {
    private  Dname dname;

    public Dname getDname() {
        return dname;
    }

    public void setDname(Dname dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Cname{" +
                "dname=" + dname +
                '}';
    }
}
