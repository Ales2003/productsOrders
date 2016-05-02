package ru.mail.ales.dao.impl;

import ru.mail.ales.dao.AbstractHibernateDao;
import ru.mail.ales.dao.OrderOfProductsDao;
import ru.mail.ales.entity.OrderOfProducts;

import java.util.List;

/**
 * Created by USER on 27.04.2016.
 */
public class OrderOfProductsDaoImpl extends AbstractHibernateDao<OrderOfProducts, Integer> implements OrderOfProductsDao{


    @Override
    public void save(List<OrderOfProducts> data) {

    }
}
