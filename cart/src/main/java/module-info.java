module com.cse213l.practice.cart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cse213l.practice.cart to javafx.fxml;
    exports com.cse213l.practice.cart;
}