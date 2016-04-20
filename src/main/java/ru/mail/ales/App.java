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
public class App 
{
    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Product product = (Product) session.get(Product.class, id);
        session.close();
        System.out.println(product);



    }
}
