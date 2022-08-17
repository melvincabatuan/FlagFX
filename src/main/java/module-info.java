module com.example.flagfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.flagfx to javafx.fxml;
    exports com.example.flagfx;
}