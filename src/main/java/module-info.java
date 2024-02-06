module com.example.topicos24 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.topicos24 to javafx.fxml;
    exports com.example.topicos24;
}