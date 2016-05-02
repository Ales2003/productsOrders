package ru.mail.ales.viev.impl;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import ru.mail.ales.entity.Product;
import ru.mail.ales.service.ProductService;
import ru.mail.ales.service.impl.ProductServiceImpl;
import ru.mail.ales.viev.Views;

/**
 * Created by USER on 27.04.2016.
 */
public class ViewsImplProduct implements Views<Product> {

    private ProductService service = new ProductServiceImpl();

    private TableView table = new TableView();

    public Pane buildPane(final ObservableList<Product> data){
        table.setEditable(true);

        final TableColumn nameOfProductCol = new TableColumn("Product Name");
        TableColumn describtionOfProductCol = new TableColumn("Describtion");
        TableColumn priceOfProductCol = new TableColumn("Price");



        final TextField addNameOfProduct = new TextField();
        addNameOfProduct.setPromptText("Product Name");
        addNameOfProduct.setMaxWidth(nameOfProductCol.getPrefWidth());

        final TextField addDescribtionOfProduct = new TextField();
        addDescribtionOfProduct.setMaxWidth(describtionOfProductCol.getPrefWidth());
        addDescribtionOfProduct.setPromptText("Describtion");

        final TextField addPriceOfProduct = new TextField();
        addPriceOfProduct.setMaxWidth(priceOfProductCol.getPrefWidth());
        addPriceOfProduct.setPromptText("Price");

        nameOfProductCol.setCellValueFactory(
                new PropertyValueFactory<Product,String>("productName")
        );

        nameOfProductCol.setCellFactory(TextFieldTableCell.forTableColumn());

        nameOfProductCol.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Product, String>>() {
                    public void handle(TableColumn.CellEditEvent<Product, String> t) {
                        ((Product) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setNameOfProduct(t.getNewValue());
                    }
                }
        );





        describtionOfProductCol.setCellValueFactory(
                new PropertyValueFactory<Product,String>("describtion")
        );
        describtionOfProductCol.setCellFactory(TextFieldTableCell.forTableColumn());
        describtionOfProductCol.setOnEditCommit( new EventHandler<TableColumn.CellEditEvent<Product, String>>() {
            public void handle(TableColumn.CellEditEvent<Product, String> t) {
                ((Product) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                ).setDescribtionOfProduct(t.getNewValue());
            }
        });



        priceOfProductCol.setCellValueFactory(
                new PropertyValueFactory<Product,Integer>("price")
        );



        table.getColumns().addAll(nameOfProductCol, describtionOfProductCol, priceOfProductCol);

        table.setItems(data);


        final Button button = new Button("Add");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String productName =  addNameOfProduct.getText();
                String describtion =  addDescribtionOfProduct.getText();

               Integer price = Integer.getInteger(addPriceOfProduct.getText());
                if(productName!=null && !productName.isEmpty()) {
                    data.add(new Product(productName, describtion, price));
                }
                addNameOfProduct.clear();
                addDescribtionOfProduct.clear();
                addPriceOfProduct.clear();
            }
        });

        final Button save = new Button("Save");
        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                service.save(data);
            }
        });

        final Button refresh = new Button("Refresh");
        refresh.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                data.clear();
                data.addAll(service.getAll());
            }
        });

        HBox hBox = new HBox();
        hBox.getChildren().addAll(addNameOfProduct, addDescribtionOfProduct, addPriceOfProduct, button, save, refresh);


        final TextField query = new TextField();
        query.setPromptText("Query");

        final Button s = new Button("Refresh");
        s.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                data.clear();
                data.addAll(service.getByParameter("firstName",query.getText()));
            }
        });

        HBox search = new HBox();
        search.getChildren().addAll(query,s);
        VBox box = new VBox();
        box.getChildren().addAll(table,hBox,search);
        return box;
    }
}
