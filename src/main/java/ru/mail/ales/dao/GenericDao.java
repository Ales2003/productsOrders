package ru.mail.ales.dao;

import org.hibernate.criterion.Criterion;

import java.io.Serializable;
import java.util.List;

/**
 * Created by USER on 20.04.2016.
 */
public interface GenericDao<T, PK extends Serializable> {

    PK save(final T obj);

    void update(final T obj);

    List<T> getAll();

    Long getLength();

    Long getLength(Criterion criterion);

    List<T> getByCriteria(Criterion criterion, int begin, int count);

    List<T> getByCriteria(Criterion criterion);

    T getById(final PK id);

    void delete(final PK id);

    void delete(final T persistentObject);
}