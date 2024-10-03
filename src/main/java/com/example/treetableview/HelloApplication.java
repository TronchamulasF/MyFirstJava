package com.example.treetableview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crear columnas
        TreeTableColumn<Empleado, String> nombreColumn = new TreeTableColumn<>("nombre");
        nombreColumn.setPrefWidth(200);
        nombreColumn.setCellValueFactory(param -> new javafx.beans.property.SimpleStringProperty(param.getValue().getValue().getName()));

        TreeTableColumn<Empleado, String> puestoColumn = new TreeTableColumn<>("puesto");
        puestoColumn.setPrefWidth(200);
        puestoColumn.setCellValueFactory(param -> new javafx.beans.property.SimpleStringProperty(param.getValue().getValue().getRole()));
        TreeTableView<Empleado> treeTableView = new TreeTableView<>();
        treeTableView.getColumns().addAll(nombreColumn, puestoColumn);

        TreeItem<Empleado> Jefe = new TreeItem<>(new Empleado("Elprimo", "Jefe"));
        TreeItem<Empleado> ceo = new TreeItem<>(new Empleado("Joseluis", "CEO"));
        TreeItem<Empleado> cto = new TreeItem<>(new Empleado("Jussep", "Jefa de desarroladores"));
        TreeItem<Empleado> dev1 = new TreeItem<>(new Empleado("Lupita", "Desarrollador"));
        TreeItem<Empleado> dev2 = new TreeItem<>(new Empleado("Mario", "Desarrollador"));

        Jefe.getChildren().add(ceo);
        ceo.getChildren().addAll(cto, dev1, dev2);



        treeTableView.setRoot(Jefe);
        treeTableView.setShowRoot(false);


        VBox vbox = new VBox(treeTableView);
        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("TreeTableView Ejemplo");
        primaryStage.show();
    }
}




