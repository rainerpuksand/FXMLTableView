module com.example.fxmltableview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxmltableview to javafx.fxml;
    exports com.example.fxmltableview;
}