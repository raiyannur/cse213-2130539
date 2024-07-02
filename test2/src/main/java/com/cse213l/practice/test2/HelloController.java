package com.cse213l.practice.test2;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.StringConverter;

public class HelloController implements Initializable {

    private Label label;
    @FXML
    private ComboBox<String> selectProductComboBox;
    @FXML
    private ComboBox<Integer> quantityComboBox;
    @FXML
    private ComboBox<Integer> vatConsiderComboBox;
    @FXML
    private Label unitPriceTextField;
    @FXML
    private TableView<Payment> table;
    @FXML
    private TableColumn<Payment, String> productCol;
    @FXML
    private TableColumn<Payment, Double> unitPriceCol;
    @FXML
    private TableColumn<Payment, Integer> quantityCol;
    @FXML
    private TableColumn<Payment, Double> vatCol;
    @FXML
    private TableColumn<Payment, Double> vatAmountCol;
    @FXML
    private TableColumn<Payment, Double> totalAmountCol;
    @FXML
    private TextArea totalpaymetTextArea;
    @FXML
    private TextField maximumperunitproductcostTextField;
    @FXML
    private TextArea showTotalVatAmountTextArea;
    @FXML
    private RadioButton cashRadioButton;
    @FXML
    private ToggleGroup paymentmethod;
    private RadioButton onlinePaymentRadioButton;
    @FXML
    private Label statusLabel;
    @FXML
    private CheckBox usdSelected;
    @FXML
    private Label unitPriceLabel;
    @FXML
    private Label predefinedVatLabel;

    private ObservableList<Payment> oblist;
    @FXML
    private RadioButton cardRadioButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Add product in combobox

        selectProductComboBox.getItems().addAll("Soap","Milk","Coffee","Tea","Rui Fish","Beef");
        quantityComboBox.getItems().addAll(1,2,3,4,5,6,7,8,9,10);
        vatConsiderComboBox.getItems().addAll(1,2,3,4,5,6,7,8,9,10);

        // set default value in combo box
        selectProductComboBox.setValue("Select Product");

        // Initialize Table column and  green word indicate the field name of a person class and another

        productCol.setCellValueFactory(new PropertyValueFactory<Payment,String>("productName"));
        unitPriceCol.setCellValueFactory(new PropertyValueFactory<Payment,Double>("unitPrice"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<Payment,Integer>("quantity"));
        vatCol.setCellValueFactory(new PropertyValueFactory<Payment, Double>("predefinedVat"));
        vatAmountCol.setCellValueFactory(new PropertyValueFactory<Payment,Double>("vatAmount"));
        totalAmountCol.setCellValueFactory(new PropertyValueFactory<Payment, Double>("totalAmount"));


        table.setVisible(true);

        // set multiple selection mode
        table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        // for edit on table cell in runtime
        table.setEditable(true);



    }

    @FXML
    public void addOnClickMouse(ActionEvent actionEvent) {
        // verification and validation
        String selected = selectProductComboBox.getValue();
        String sp = "Select Product";
        if (selected.equals(sp)){
            showAlert("No Product Selected","Please select a product from the product list!");

        }else{
            Integer selectedValue = quantityComboBox.getValue();
            // create payment instance and add ob list to instance of payment

            String productname = selectProductComboBox.getValue();
            Double unitprice = Double.valueOf(unitPriceLabel.getText());
            Integer quantity = quantityComboBox.getValue();
            Double predefinedvat = Double.valueOf(predefinedVatLabel.getText());
            Double parcentage = unitprice*(predefinedvat/100);
            String s = String.format("%.2f",(quantityComboBox.getValue()*unitprice) + parcentage);
            Double totalvalue = Double.valueOf(s);


            Payment p =  new Payment(productname,unitprice,quantity,predefinedvat,parcentage,totalvalue);

            oblist = FXCollections.observableArrayList();
            oblist.add(p);

            //set clear mode
            selectProductComboBox.setValue("Select Product");
            quantityComboBox.setValue(null);

            // pass the instance of Payment into tabel
            table.getItems().addAll(oblist);





        }

    }

    // session 2
    @FXML
    public void checkOutOnMouseClick(ActionEvent actionEvent) {
        statusLabel.setText("");
        totalpaymetTextArea.clear();
        if (!cashRadioButton.isSelected() && !cardRadioButton.isSelected()){
            showAlert("No Payment method selected", "Please select Payment method from RadioButton.");

        }
        else{
            if (cashRadioButton.isSelected()){
                statusLabel.setText("Paid by Cash");
            }
            else if (cardRadioButton.isSelected()){
                statusLabel.setText("Paid by Card");
            }

        }

        if (!oblist.isEmpty()) {
            Double total = 0.00;

            // store all row's data from table
            ObservableList<Payment> allrows= table.getItems();

            // sumation totalAmount column
            for (Payment p : allrows) {
                total += p.getTotalAmount();


            }

            if (usdSelected.isSelected()) {
                double d = total/110.39;
                String ds = Double.toString(d).substring(0, Double.toString(d).indexOf('.')+3);

                totalpaymetTextArea.appendText(ds+ " USD");
            } else {
                totalpaymetTextArea.appendText(Double.toString(total) + " TK");
            }

        } else {
            if (usdSelected.isSelected()) {
                totalpaymetTextArea.appendText("0.00" + " USD");
                return;
            } else {
                totalpaymetTextArea.appendText("0.00" + " Tk");
                return;
            }

        }


    }

    // session 2

    @FXML
    public void showTotalVatAmountOnMouseClick(ActionEvent actionEvent) {
        if (maximumperunitproductcostTextField.getText().equals("") && vatConsiderComboBox.getValue()==null){
            showAlert("No Payment or percentage Given ", "Please Give Payment and select vat % from select% combo box.");
        }else
            showTotalVatAmountTextArea.clear();
        Integer parcent = vatConsiderComboBox.getValue();
        Double maximumTkPerUnit= Double.parseDouble(maximumperunitproductcostTextField.getText());

        Double totalVat=0.00;
        for (Payment p : oblist){
            if(p.getUnitPrice()>=maximumTkPerUnit){
                totalVat+=p.getVatAmount();
            }
            else totalVat+=0.00;
        }
        // calculate discount functionality

        Double discount = (totalVat*((double)(parcent)/100));

        showTotalVatAmountTextArea.appendText("The Total Vat amount paid for the products meeting search criterion is: "+discount+" Tk");

    }

    @FXML
    public void deleteItemOnMouseClick(ActionEvent actionEvent) {
        if(table.getSelectionModel().getSelectedItems().isEmpty()){
            showAlert("No value selected", "Please select a row for delete!");
        }else{
            ObservableList<Payment> selectedRows,addAllproduct ;
            addAllproduct=table.getItems();
            selectedRows=table.getSelectionModel().getSelectedItems();

            addAllproduct.removeAll(selectedRows);
            /* //removeall
            for (Payment p: selectedRows){
            addAllproduct.remove(p);
            }
             */
        }

    }

    @FXML
    public void selectProductOnMouseClick(ActionEvent actionEvent) {
        // takes value from selected product combo box and use as expression inside the switch keyword


        switch (selectProductComboBox.getValue()){
            case "Soap":
                unitPriceLabel.setText("50");
                predefinedVatLabel.setText("5");
                break;
            case "Milk":
                unitPriceLabel.setText("80");
                predefinedVatLabel.setText("4.5");
                break;
            case "Coffee":
                unitPriceLabel.setText("500");
                predefinedVatLabel.setText("10");
                break;
            case "Tea":
                unitPriceLabel.setText("250");
                predefinedVatLabel.setText("6.5");
                break;
            case "Rui Fish":
                unitPriceLabel.setText("650");
                predefinedVatLabel.setText("3");
                break;
            case "Beef":
                unitPriceLabel.setText("800");
                predefinedVatLabel.setText("10");
                break;
            default:
                unitPriceLabel.setText("");
                predefinedVatLabel.setText("");
        }
    }

    // create an Alert Method for gives alert

    private void showAlert(String title, String content){
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();

    }

}