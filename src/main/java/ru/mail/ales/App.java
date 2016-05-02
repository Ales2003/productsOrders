package ru.mail.ales;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import ru.mail.ales.dao.HibernateUtil;
import ru.mail.ales.entity.Product;
import ru.mail.ales.viev.Views;
import ru.mail.ales.viev.impl.Window;

import java.util.Properties;


public class App extends Application {



    private final ObservableList<Product> data = FXCollections.observableArrayList();

    public static void main( String[] args )
    {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new Group());
        stage.setTitle("Table View Sample");
        stage.setWidth(500);
        stage.setHeight(500);

        final Label label = new Label("Orders of products");
        label.setFont(new Font("Arial", 20));

        ((Group) scene.getRoot()).getChildren().addAll(initLayout(),initLayout());

        stage.setScene(scene);
        stage.show();
    }

    private Pane initLayout(){
        Window views = new Window();
        return views.buildPane(data);
    }















    /*{
        public static void main( String[] args )

        Session session = HibernateUtil.getSessionFactory().openSession();
        Product product = (Product) session.get(Product.class, 1);
        session.close();
        System.out.println(product);
    }
    */
}
