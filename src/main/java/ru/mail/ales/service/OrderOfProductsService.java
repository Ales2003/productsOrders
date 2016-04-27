package ru.mail.ales.service;

import ru.mail.ales.entity.OrderOfProducts;

import java.util.List;

/**
 * Created by USER on 27.04.2016.
 */
public interface OrderOfProductsService {

        List<OrderOfProducts> getAll();

        void save(List<OrderOfProducts> data);

        List<OrderOfProducts> getByParameter(String key, String value);
    }


