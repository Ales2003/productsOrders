package ru.mail.ales.service.impl;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import ru.mail.ales.dao.ProductDao;
import ru.mail.ales.dao.impl.ProductDaoImpl;
import ru.mail.ales.entity.Product;
import ru.mail.ales.service.ProductService;

import java.util.List;

/**
 * Created by USER on 27.04.2016.
 */
public class ProductServiceImpl implements ProductService {
    private ProductDao dao = new ProductDaoImpl();

    @Override
    public List<Product> getAll() {
        return dao.getAll();
    }

    @Override
    public void save(List<Product> data) {
        dao.save(data);
    }

    @Override
    public List<Product> getByParameter(String key, String value) {
        Criterion criterion = Restrictions.eq(key, value);
        return dao.getByCriteria(criterion);
    }

}
