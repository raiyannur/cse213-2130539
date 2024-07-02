package com.cse213l.practice.interns;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

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
    private TableColumn<DummyClass,String> paidInternCol;
    @javafx.fxml.FXML
    private CheckBox programmmgCheckBox;
    @javafx.fxml.FXML
    private TableColumn<DummyClass,String> uniNameCol;
    @javafx.fxml.FXML
    private TableColumn<DummyClass,Integer> trainingAmountCol;
    @javafx.fxml.FXML
    private Label paymentStatusLabel;
    @javafx.fxml.FXML
    private ComboBox<Integer> idComboBox;
    @javafx.fxml.FXML
    private Button showiInTableButton;
    @javafx.fxml.FXML
    private TableColumn<DummyClass,Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<DummyClass,ArrayList<String>> selectedTrainingCol;
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
    private TableView<DummyClass> internTableView;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private CheckBox blockChainCheckBox;

    ArrayList<InternClass> internArrayList= new ArrayList<>();
    ArrayList<TraineeClass> traineeArrayList= new ArrayList<>();
    ArrayList<String> trainingTitles = new ArrayList<>();




    @javafx.fxml.FXML
    public void initialize() {
        idComboBox.getItems().addAll(12340,12341,12342,12343,12344,12345);
        uniNameComboBox.getItems().addAll("NSU","BRAC","IUB");
        statusComboBox.getItems().addAll("Paid","Unpaid");
        filterComboBox.getItems().addAll("Paid","Unpaid");


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

    }

    @javafx.fxml.FXML
    public void addNewTraineeOnMouseButton(ActionEvent actionEvent) {

    }
    }