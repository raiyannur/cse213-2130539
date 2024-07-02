package com.cse213l.practice.interns;

import java.util.ArrayList;

public class TraineeClass {
    private int id;
    private ArrayList<String> trainingTitles;

    public TraineeClass(int id, ArrayList<String> trainingTitles) {
        this.id = id;
        this.trainingTitles = trainingTitles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getTrainingTitles() {
        return trainingTitles;
    }

    public void setTrainingTitles(ArrayList<String> trainingTitles) {
        this.trainingTitles = trainingTitles;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", trainingTitles=" + trainingTitles +
                '}';
    }

    public int getTrainingTitlesCount(){
        return trainingTitles.size();
    }



}
