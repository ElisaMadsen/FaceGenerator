module com.example.facegeneratoraflevering {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.facegeneratoraflevering to javafx.fxml;
    exports com.example.facegeneratoraflevering;
}