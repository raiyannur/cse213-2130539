module com.cse213l.practice.texaschainmassacre {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse213l.practice.texaschainmassacre to javafx.fxml;
    exports com.cse213l.practice.texaschainmassacre;
}