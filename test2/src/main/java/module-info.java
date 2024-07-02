module com.cse213l.practice.test2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse213l.practice.test2 to javafx.fxml;
    exports com.cse213l.practice.test2;
}