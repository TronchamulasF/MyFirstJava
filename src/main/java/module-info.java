module com.example.treetableview {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.treetableview to javafx.fxml;
    exports com.example.treetableview;
}