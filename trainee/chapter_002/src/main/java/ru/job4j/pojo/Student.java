package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fullname;
    private String group;
    private Date matriculation;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getMatriculation() {
        return matriculation;
    }

    public void setMatriculation(Date matriculation) {
        this.matriculation = matriculation;
    }
}
