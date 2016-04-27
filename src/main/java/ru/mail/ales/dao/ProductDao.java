package ru.mail.ales.dao;

import ru.mail.ales.entity.Product;

import java.util.List;

/**
 * Created by USER on 27.04.2016.
 */
public interface ProductDao extends GenericDao<Product, Integer> {

    void save(List<Product> data);
}
