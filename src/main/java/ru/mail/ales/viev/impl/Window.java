package ru.mail.ales.viev.impl;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import ru.mail.ales.entity.Product;
import ru.mail.ales.viev.Views;


/**
 * Created by USER on 02.05.2016.
 */
public class Window {
    private Views tableView = new ViewsImplProduct();
    private Views newTableView = new ViewsImplOrder();


    public Pane buildPane(final ObservableList<Product> data){
        final VBox vbox = new VBox();




        ChangedButton userView = new ChangedButton(tableView.buildPane(data));
       ChangedButton newUserView = new ChangedButton(newTableView.buildPane(data));

        HBox cont = new HBox();
        cont.getChildren().addAll(userView, newUserView);
        cont.getChildren().addAll(userView);


        userView.setText("User Table");
        userView.setOnAction(
                e -> {
                    vbox.getChildren().clear();
                    vbox.getChildren().addAll(cont, userView.getControl());
                }
        );

//        newUserView.setText("new user Table");

  /*      newUserView.setOnAction(
                e -> {
                    vbox.getChildren().clear();
                    vbox.getChildren().addAll(cont, newUserView.getControl());
                }
        );
*/

        vbox.setFillWidth(true);
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(cont);

        return vbox;
    }
}

