package com.oop.practice.libraybooks;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.converter.FloatStringConverter;

import java.util.ArrayList;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;


public class LibraryScene
{
    @javafx.fxml.FXML
    private TableColumn<Book,String> genreCol;
    @javafx.fxml.FXML
    private TextField minPriceTextField;
    @javafx.fxml.FXML
    private ComboBox<String> selectGenreComboBox;
    @javafx.fxml.FXML
    private TableColumn<Book,Integer> bookIdCol;
    @javafx.fxml.FXML
    private TableColumn<Book,Float> priceCol;
    @javafx.fxml.FXML
    private TableColumn<Book,String> bookTitleCol;
    @javafx.fxml.FXML
    private Button addToBookListButton;
    @javafx.fxml.FXML
    private Button searchShowButton;
    @javafx.fxml.FXML
    private TextField priceTextFiekd;
    @javafx.fxml.FXML
    private ComboBox<String> genreForSearchComboBox;
    @javafx.fxml.FXML
    private TextField bookIdTextField;
    @javafx.fxml.FXML
    private TableView<Book> table;
    @javafx.fxml.FXML
    private TextField maxPriceTextField;
    @javafx.fxml.FXML
    private TextField bookNameTextField;
    @javafx.fxml.FXML
    private TableColumn<Book,Integer> totalNoOfBooksCol;
    ArrayList<Book> bookArrayList= new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {
        selectGenreComboBox.getItems().addAll("Sci-Fi","Romance","Hentai","Mystery","Horror");
        genreForSearchComboBox.getItems().addAll("Sci-Fi","Romance","Hentai","Mystery","Horror");

        bookIdCol.setCellValueFactory(new PropertyValueFactory<Book,Integer>("bookId"));
        genreCol.setCellValueFactory(new PropertyValueFactory<Book,String>("bookGenre"));
        bookTitleCol.setCellValueFactory(new PropertyValueFactory<Book,String>("bookTitle"));
        priceCol.setCellValueFactory(new PropertyValueFactory<Book,Float>("price"));
        totalNoOfBooksCol.setCellValueFactory(new PropertyValueFactory<Book,Integer>("totalBooks"));





    }

    @javafx.fxml.FXML
    public void searchShowOnMouseClick(ActionEvent actionEvent) {
        //Float max = parseFloat(maxPriceTextField.getText());
        //Float min = parseFloat(minPriceTextField.getText());
        for(Book b : bookArrayList) {
            if (selectGenreComboBox.getValue().equals(b.getBookGenre())){
                table.getItems().add(b);

            }




        }
    }

    @javafx.fxml.FXML
    public void addBookToBookListOnMouseClick(ActionEvent actionEvent) {
        Integer bookId = parseInt(bookIdTextField.getText());
        String bookTitle =bookNameTextField.getText();
        Float price=  parseFloat(priceTextFiekd.getText());
        String bookGenre = selectGenreComboBox.getValue();

        Book b = (new Book(bookId,bookTitle,price,bookGenre));
        bookArrayList.add(b);
        bookIdTextField.clear();
        bookNameTextField.clear();
        priceTextFiekd.clear();
        selectGenreComboBox.setValue("Select Genre");

    }

    private void showAlert(String title, String content){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();}


}