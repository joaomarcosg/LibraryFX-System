package com.joao.libraryfx;

import com.joao.libraryfx.products.Product;
import com.joao.libraryfx.repository.ProductsRepository;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

@SuppressWarnings({"unchecked", "rawtypes"})
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Group group = new Group();
        Scene scene = new Scene(group, 690, 510);

        ObservableList<Product> products = new ProductsRepository().list();

        TableView tableView = new TableView<>(products);

        TableColumn nameColumn = new TableColumn("Name");
        nameColumn.setMinWidth(180);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));


        TableColumn descColumn = new TableColumn("Description");
        descColumn.setMinWidth(230);
        descColumn.setCellValueFactory(new PropertyValueFactory<>("description"));

        TableColumn priceColumn =  new TableColumn("Price");
        priceColumn.setMinWidth(60);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn isbnColumn = new TableColumn("ISBN");
        isbnColumn.setMinWidth(180);
        isbnColumn.setCellValueFactory(new PropertyValueFactory<>("isbn"));

        tableView.getColumns().addAll(nameColumn,descColumn,priceColumn,isbnColumn);

        final VBox vbox =  new VBox(tableView);
        vbox.setPadding(new Insets(70, 0, 0, 10));

        Label label = new Label("List of books");
        label.setFont(Font.font("Lucida Grande", FontPosture.REGULAR, 30));
        label.setPadding(new Insets(20, 0, 10, 10));

        group.getChildren().addAll(label, vbox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Library System with JavaFX");
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
