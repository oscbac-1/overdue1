module com.example.overdue1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.overdue1 to javafx.fxml;
    exports com.example.overdue1;
}