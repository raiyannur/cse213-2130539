module com.cse213l.practice.interns {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse213l.practice.interns to javafx.fxml;
    exports com.cse213l.practice.interns;
}