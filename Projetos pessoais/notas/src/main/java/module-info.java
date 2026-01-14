module org.example.notas {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.notas to javafx.fxml;
    exports org.example.notas;
}