module com.cse213l.practice.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse213l.practice.demo to javafx.fxml;
    exports com.cse213l.practice.demo;
}