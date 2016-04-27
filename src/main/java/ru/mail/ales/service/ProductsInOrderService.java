package ru.mail.ales.service;

import ru.mail.ales.entity.Product;
import ru.mail.ales.entity.ProductsInOrder;

import java.util.List;

/**
 * Created by USER on 27.04.2016.
 */
public interface ProductsInOrderService {


        List<ProductsInOrder> getAll();

        void save(List<ProductsInOrder> data);

        List<ProductsInOrder> getByParameter(String key, String value);
    }

