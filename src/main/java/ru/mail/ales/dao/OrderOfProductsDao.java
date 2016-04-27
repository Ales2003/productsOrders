package ru.mail.ales.dao;

import ru.mail.ales.entity.OrderOfProducts;
import ru.mail.ales.entity.Product;

import java.util.List;

/**
 * Created by USER on 27.04.2016.
 */
public interface OrderOfProductsDao extends GenericDao<OrderOfProducts, Integer> {

    void save(List<OrderOfProducts> data);
}

