package com.cse213l.practice.demo;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class PaymentScene implements
{
    @javafx.fxml.FXML
    private Label unitPriceLabel;
    @javafx.fxml.FXML
    private TextArea showTotalVatAmountTextArea;
    @javafx.fxml.FXML
    private Label predefinedVatLabel;
    @javafx.fxml.FXML
    private ComboBox selectProductComboBox;
    @javafx.fxml.FXML
    private RadioButton cashRadioButton;
    @javafx.fxml.FXML
    private ComboBox quantityComboBox;
    @javafx.fxml.FXML
    private Button checkoutButton;
    @javafx.fxml.FXML
    private RadioButton cardRadioButton;
    @javafx.fxml.FXML
    private Button addProductToCartButton;
    @javafx.fxml.FXML
    private Button deleteitemButton;
    @javafx.fxml.FXML
    private TableView table;
    @javafx.fxml.FXML
    private ComboBox vatConsiderComboBox;
    @javafx.fxml.FXML
    private TextField maximumperunitproductcost;
    @javafx.fxml.FXML
    private CheckBox usdSelected;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void deleteOnClickMouse(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addOnClickMouse(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void selectQuantityOnClickMouse(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void selectProductOnClickMouse(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showTotalVatAmountOnMouseClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkoutOnClickMouse(ActionEvent actionEvent) {
    }
}