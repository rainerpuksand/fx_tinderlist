module com.example.fx_tinderlist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fx_tinderlist to javafx.fxml;
    exports com.example.fx_tinderlist;
}