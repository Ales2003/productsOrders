package ru.mail.ales.dao.impl;

import ru.mail.ales.dao.AbstractHibernateDao;
import ru.mail.ales.dao.ProductDao;
import ru.mail.ales.entity.Product;

import java.util.List;

/**
 * Created by USER on 27.04.2016.
 */
public class ProductDaoImpl extends AbstractHibernateDao<Product, Integer> implements ProductDao{

    @Override
    public void save(List<Product> data) {

    }
}
