package ru.mail.ales.service.impl;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import ru.mail.ales.dao.OrderOfProductsDao;
import ru.mail.ales.dao.impl.OrderOfProductsDaoImpl;
import ru.mail.ales.dao.impl.ProductDaoImpl;
import ru.mail.ales.entity.OrderOfProducts;
import ru.mail.ales.entity.Product;
import ru.mail.ales.service.OrderOfProductsService;

import java.util.List;

/**
 * Created by USER on 27.04.2016.
 */
public class OrderOfProductsServiceImpl implements OrderOfProductsService{
    private OrderOfProductsDao dao = new OrderOfProductsDaoImpl();

    @Override
    public List<OrderOfProducts> getAll() {
        return dao.getAll();
    }

      @Override
    public void save(List<OrderOfProducts> data) {
        dao.save(data);
    }

    @Override
    public List<OrderOfProducts> getByParameter(String key, String value) {
        Criterion criterion = Restrictions.eq(key, value);
        return dao.getByCriteria(criterion);
    }

}
