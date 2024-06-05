module com.cse213l.practice.matrixoperationsec6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse213l.practice.matrixoperationsec6 to javafx.fxml;
    exports com.cse213l.practice.matrixoperationsec6;
}