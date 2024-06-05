module com.cse213l.practice.complexnoprojectsec6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse213l.practice.complexnoprojectsec6 to javafx.fxml;
    exports com.cse213l.practice.complexnoprojectsec6;
}