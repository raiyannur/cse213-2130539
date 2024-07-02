package com.cse213l.practice.midpracticeproject;

public class Intern {
    private int id;
    private String internName, uniName,status;

    public Intern(int id, String internName, String uniName, String status) {
        this.id = id;
        this.internName = internName;
        this.uniName = uniName;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInternName() {
        return internName;
    }

    public void setInternName(String internName) {
        this.internName = internName;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "id=" + id +
                ", internName='" + internName + '\'' +
                ", uniName='" + uniName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}


