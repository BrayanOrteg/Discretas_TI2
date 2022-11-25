module com.example.integradora_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.integradora_2 to javafx.fxml;
    exports com.example.integradora_2;
}