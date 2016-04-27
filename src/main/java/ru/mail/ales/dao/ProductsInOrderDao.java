package ru.mail.ales.dao;



import ru.mail.ales.entity.ProductsInOrder;

import java.util.List;

/**
 * Created by USER on 27.04.2016.
 */
public interface ProductsInOrderDao extends GenericDao<ProductsInOrder, Integer> {
    void save(List<ProductsInOrder> data);

}
