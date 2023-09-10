module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.s to javafx.fxml;
    exports com.example.s;
}