module com.mycompany.projeto_michel {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.projeto_michel to javafx.fxml;
    exports com.mycompany.projeto_michel;
}
