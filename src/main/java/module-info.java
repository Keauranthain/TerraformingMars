module com.example.terraformingmars {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.terraformingmars to javafx.fxml;
    exports com.example.terraformingmars;
}