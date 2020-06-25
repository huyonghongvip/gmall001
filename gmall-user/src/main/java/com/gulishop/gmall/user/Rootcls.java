package com.gulishop.gmall.user;



public class Rootcls{
    private  int phone;
    private  String name;
    private  Cname cname;


    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cname getCname() {
        return cname;
    }

    public void setCname(Cname cname) {
        this.cname = cname;
    }


    @Override
    public String toString() {
        return "Rootcls{" +
                "phone=" + phone +
                ", name='" + name + '\'' +
                ", cname=" + cname +
                '}';
    }
}
