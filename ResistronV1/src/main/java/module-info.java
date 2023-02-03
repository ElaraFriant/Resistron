module fr.simplon.resistronv1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.simplon.resistronv1 to javafx.fxml;
    exports fr.simplon.resistronv1;
}