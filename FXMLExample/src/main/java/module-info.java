module com.mycompany.fxmlexample {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens com.mycompany.fxmlexample to javafx.fxml;
    exports com.mycompany.fxmlexample;
}
