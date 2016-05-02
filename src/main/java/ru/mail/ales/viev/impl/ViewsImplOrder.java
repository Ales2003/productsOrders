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
import ru.mail.ales.entity.OrderOfProducts;
import ru.mail.ales.entity.Product;
import ru.mail.ales.service.OrderOfProductsService;
import ru.mail.ales.service.ProductService;
import ru.mail.ales.service.impl.OrderOfProductsServiceImpl;
import ru.mail.ales.service.impl.ProductServiceImpl;
import ru.mail.ales.viev.Views;

import java.util.Date;

/**
 * Created by USER on 02.05.2016.
 */
public class ViewsImplOrder implements Views<OrderOfProducts> {

    private OrderOfProductsService service = new OrderOfProductsServiceImpl();

    private TableView table = new TableView();

    public Pane buildPane(final ObservableList<OrderOfProducts> data){
        table.setEditable(true);

        final TableColumn dateOfOrderCol = new TableColumn("Date of order");
        TableColumn go = new TableColumn("go");


        final TextField addDateOfOrder = new TextField();
        addDateOfOrder.setPromptText("Date of order");
        addDateOfOrder.setMaxWidth(dateOfOrderCol.getPrefWidth());


        dateOfOrderCol.setCellValueFactory(
                new PropertyValueFactory<Product,Date>("dateOfOrder")
        );

        dateOfOrderCol.setCellFactory(TextFieldTableCell.forTableColumn());

        dateOfOrderCol.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<OrderOfProducts, Date>>() {
                    public void handle(TableColumn.CellEditEvent<OrderOfProducts, Date> t) {
                        ((OrderOfProducts) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setReceiptDate(t.getNewValue());
                    }
                }
        );

        go.setCellFactory(TextFieldTableCell.forTableColumn());
        go.setEditable(false);
        table.setOnMouseClicked(e -> {
            System.out.println(e);
        });







        table.getColumns().addAll(addDateOfOrder, go);

        table.setItems(data);


        final Button button = new Button("Add");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Date date = null;
                try {
                    date =  new Date(addDateOfOrder.getText());
                }catch (IllegalArgumentException ex){

                }



                if(date!=null) {
                    data.add(new OrderOfProducts(date));
                }
                addDateOfOrder.clear();

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
        hBox.getChildren().addAll(addDateOfOrder, button, save, refresh);


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
