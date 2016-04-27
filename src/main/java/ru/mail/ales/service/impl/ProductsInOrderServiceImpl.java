package ru.mail.ales.service.impl;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import ru.mail.ales.dao.ProductsInOrderDao;
import ru.mail.ales.dao.impl.ProductsInOrderDaoImpl;
import ru.mail.ales.entity.ProductsInOrder;
import ru.mail.ales.service.ProductsInOrderService;

import java.util.List;

/**
 * Created by USER on 27.04.2016.
 */
public class ProductsInOrderServiceImpl implements ProductsInOrderService {
    private ProductsInOrderDao dao = new ProductsInOrderDaoImpl();

    @Override
    public List<ProductsInOrder> getAll() {
        return dao.getAll();
    }

    @Override
    public void save(List<ProductsInOrder> data) {
        dao.save(data);
    }

    @Override
    public List<ProductsInOrder> getByParameter(String key, String value) {
        Criterion criterion = Restrictions.eq(key, value);
        return dao.getByCriteria(criterion);
    }
}
