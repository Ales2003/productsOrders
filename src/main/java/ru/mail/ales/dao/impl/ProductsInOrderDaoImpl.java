package ru.mail.ales.dao.impl;

import ru.mail.ales.dao.AbstractHibernateDao;
import ru.mail.ales.dao.ProductsInOrderDao;
import ru.mail.ales.entity.ProductsInOrder;

import java.util.List;

/**
 * Created by USER on 27.04.2016.
 */
public class ProductsInOrderDaoImpl extends AbstractHibernateDao<ProductsInOrder, Integer> implements ProductsInOrderDao{

    @Override
    public void save(List<ProductsInOrder> data) {

    }
}
