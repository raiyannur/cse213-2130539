module com.cse213l.practice.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse213l.practice.demo1 to javafx.fxml;
    exports com.cse213l.practice.demo1;
}