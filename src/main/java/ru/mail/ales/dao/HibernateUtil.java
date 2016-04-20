package ru.mail.ales.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import ru.mail.ales.entity.OrderOfProducts;
import ru.mail.ales.entity.Product;
import ru.mail.ales.entity.ProductsInOrder;

/**
 * Created by USER on 20.04.2016.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new AnnotationConfiguration().addPackage("ru.mail.ales.entity").addAnnotatedClass(Product.class)
                    .addAnnotatedClass(ProductsInOrder.class)
                    .addAnnotatedClass(OrderOfProducts.class)
                    .configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void close(){
        sessionFactory.close();
    }
}