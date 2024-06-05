package com.cse213l.practice.matrixoperationsec6;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MatrixOperationView
{
    @javafx.fxml.FXML
    private TextField NoOfRowsOf1stMatrixTextField;
    @javafx.fxml.FXML
    private TextField NoOfRowsOf12ndMatrixTextField;
    @javafx.fxml.FXML
    private ComboBox selectOperationCOmboBox;
    @javafx.fxml.FXML
    private TextField NoOfColsOf2ndMatrixTextField;
    @javafx.fxml.FXML
    private TextField NoOfColssOf1stMatrixTextField;
    @javafx.fxml.FXML
    private Label resultLabel;

    Matrix m1,m2,m3;
    int rowIndex,colIndex;
    @javafx.fxml.FXML
    private TextField matrixelementtextfield;

    @javafx.fxml.FXML
    public void initialize() {
        reoIndex=colIndex=0;
        selectOperationCOmboBox.getItems().add("Add");
        selectOperationCOmboBox.getItems().addAll()
    }

    @javafx.fxml.FXML
    public void addMatrixElementButtonOnMouseClicked(Event event) {
        m1=new Matrix(
                Integer.parseInt(NoOfRowsOf1stMatrixTextField.getText()),
                Integer.parseInt(NoOfColssOf1stMatrixTextField.getText())
        );
        if(rowIndex==m1.vals.length-1 &&  )
        m1.vals[rowIndex][colIndex]=Integer.parseInt(matrixelementtextfield.getText());
        if(colIndex<m1.vals[0].length-1){
            colIndex++;
        }
        else if(colIndex==m1.vals[0].length-1){
            if(rowIndex<m1.vals.length-1){
                rowIndex++; colIndex=0;
            }
            else if(rowIndex==m1.vals.length-1){
                resultLabel.setText("Oops");
            }
        }
    }

    @javafx.fxml.FXML
    public void GenerateMatrixWithRandomValuesOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ExecuteOperationButtonOnMouseClicked(Event event) {

    }
}