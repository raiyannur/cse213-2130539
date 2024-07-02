module com.cse213l.practice.demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse213l.practice.demo2 to javafx.fxml;
    exports com.cse213l.practice.demo2;
}