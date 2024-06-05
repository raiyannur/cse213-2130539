module com.cse213l.practice.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse213l.practice.test to javafx.fxml;
    exports com.cse213l.practice.test;
}