package ru.mail.ales;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import ru.mail.ales.dao.HibernateUtil;
import ru.mail.ales.entity.Product;

import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    private final ObservableList<Product> products= FXCollections.observableArrayList();
private final ObservableList<OrderOfProducts> orderOfProducts= FXCollections.observableArrayList();
 private final ObservableList<ProductsInOrder> productsInOrder= FXCollections.observableArrayList();
	
	    public static void main( String[] args )
	    {
       launch(args);
	    }
        public void start(Stage stage) throws Exception {
	        Scene scene = new Scene(new Group());
             stage.setTitle("Table View Sample");
	        stage.setWidth(500);
	        stage.setHeight(500);
	
	        final Label label = new Label("OdersOProduct");
	        label.setFont(new Font("Arial", 20));
	
	        ((Group) scene.getRoot()).getChildren().addAll(initLayout(),initLayout());
	
	        stage.setScene(scene);
	        stage.show();
	    }
	
	    private Pane initLayout(){
	        Views views = new Window();
	        return views.buildPane(products);
	    }


   /** public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Product product = (Product) session.get(Product.class, 1);
        session.close();
        System.out.println(product);
}
    */
    


}
