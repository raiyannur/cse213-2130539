module com.cse213l.practice.midpracticeproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse213l.practice.midpracticeproject to javafx.fxml;
    exports com.cse213l.practice.midpracticeproject;
}