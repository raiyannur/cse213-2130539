package com.cse213l.practice.midpracticeproject;

import java.util.ArrayList;
// used a dummy class cuz the fields needed for the table,
// the 2 models didnt have all the necessary variables for the table
public class DummyTable {
    int id ,cnt;
    String uniName, status;
    ArrayList<String> trainingTitles;
    //constructor
    public DummyTable(int id, int cnt, String uniName, String status, ArrayList<String> trainingTitles) {
        this.id = id;
        this.cnt = cnt;//no.of.training
        this.uniName = uniName;
        this.status = status;
        this.trainingTitles = trainingTitles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
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

    public ArrayList<String> getTrainingTiles() {
        return trainingTitles;
    }

    public void setTrainingTiles(ArrayList<String> trainingTiles) {
        this.trainingTitles = trainingTitles;
    }

    @Override
    public String toString() {
        return "DummyTable{" +
                "id=" + id +
                ", cnt=" + cnt +
                ", uniName='" + uniName + '\'' +
                ", status='" + status + '\'' +
                ", trainingTiles=" + trainingTitles +
                '}';
    }


}
