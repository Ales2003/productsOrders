package ru.mail.ales.service;

import ru.mail.ales.entity.Product;

import java.util.List;

/**
 * Created by USER on 27.04.2016.
 */
public interface ProductService {


        List<Product> getAll();

        void save(List<Product> data);

        List<Product> getByParameter(String key, String value);
    }

