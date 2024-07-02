package com.cse213l.practice.midpracticeproject;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class Internship
{
    @javafx.fxml.FXML
    private ComboBox<String> uniNameComboBox;
    @javafx.fxml.FXML
    private Label uniNameLabel;
    @javafx.fxml.FXML
    private CheckBox sprintBoostCheckBox;
    @javafx.fxml.FXML
    private TableColumn<DummyTable,String> paidInternCol;
    @javafx.fxml.FXML
    private CheckBox programmmgCheckBox;
    @javafx.fxml.FXML
    private TableColumn<DummyTable,String> uniNameCol;
    @javafx.fxml.FXML
    private TableColumn<DummyTable,Integer> trainingAmountCol;
    @javafx.fxml.FXML
    private Label paymentStatusLabel;
    @javafx.fxml.FXML
    private ComboBox<Integer> idComboBox;
    @javafx.fxml.FXML
    private Button showiInTableButton;
    @javafx.fxml.FXML
    private TableColumn<DummyTable,Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<DummyTable,ArrayList<String>> selectedTrainingCol;
    @javafx.fxml.FXML
    private Button addInArrayListButton;
    @javafx.fxml.FXML
    private Label internNameLabel;
    @javafx.fxml.FXML
    private Label showOutputLabel;
    @javafx.fxml.FXML
    private ComboBox<String> filterComboBox;
    @javafx.fxml.FXML
    private CheckBox skillCheckBox;
    @javafx.fxml.FXML
    private TableView<DummyTable> internTableView;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private CheckBox blockChainCheckBox;

    ArrayList<Intern> internArrayList= new ArrayList<>();
    ArrayList<Trainee> traineeArrayList= new ArrayList<>();
    ArrayList<String> trainingTitles = new ArrayList<>();




    @javafx.fxml.FXML
    public void initialize() {
        internArrayList.add(new Intern (12340,"Tawhid Choudhury","NSU","Unpaid"));
        internArrayList.add(new Intern (12341,"Meherab Hossain","Brac","Paid"));
        internArrayList.add(new Intern (12342,"Saad Naovi","NSU","Paid"));
        internArrayList.add(new Intern (12343,"Samiha Naz","NSU","Unpaid"));
        internArrayList.add(new Intern (12344,"Raiyan Nur","IUB","Unpaid"));
       internArrayList.add(new Intern (12345,"Saikat Barua","IUB","Paid"));

        for(Intern i: internArrayList){
            idComboBox.getItems().addAll(i.getId());
        //idComboBox.getItems().addAll(12340,12341,12342,12343,12344,12345);
        uniNameComboBox.getItems().addAll("NSU","BRAC","IUB");
        statusComboBox.getItems().addAll("Paid","Unpaid");
        filterComboBox.getItems().addAll("Paid","Unpaid");

        idCol.setCellValueFactory(new PropertyValueFactory<DummyTable,Integer>("id"));
        }


    }

    @javafx.fxml.FXML
    public void showTraineeCountButtonOnMouseClick(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void showTrainingInfoOnMouseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void internOnAction(ActionEvent actionEvent) {
        int id = idComboBox.getValue();
        for (Intern i : internArrayList){
            if (id==i.getId()){
                internNameLabel.setText(i.getInternName());
                uniNameLabel.setText(i.getUniName());
                paymentStatusLabel.setText(i.getStatus());
                break;
            }

        }
    }

    @javafx.fxml.FXML
    public void addNewTraineeOnMouseButton(ActionEvent actionEvent) {
        trainingTitles = new ArrayList<>();
        int id =idComboBox.getValue();
        if(sprintBoostCheckBox.isSelected()){
            trainingTitles.add("Sprint Boot");

        }
        if(skillCheckBox.isSelected()){
            trainingTitles.add("Communication skill");

        }
        if(blockChainCheckBox.isSelected()){
            trainingTitles.add("Block Chain");

        }

        if(programmmgCheckBox.isSelected()){
            trainingTitles.add("Programming");

        }

        Trainee t = new Trainee(id,trainingTitles);
        traineeArrayList.add(t);






    }
}