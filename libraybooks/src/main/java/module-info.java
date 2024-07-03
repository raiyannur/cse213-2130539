module com.oop.practice.libraybooks {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.practice.libraybooks to javafx.fxml;
    exports com.oop.practice.libraybooks;
}