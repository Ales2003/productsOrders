package ru.mail.ales.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by USER on 20.04.2016.
 */


//класс Заказ товаров
@Entity
public class OrderOfProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //номер заказа =ключ
    private Integer id;
    //дата поступления заказа
    private Date receiptDate;
    //лист товаров в заказе

    //mapping

    @OneToMany(mappedBy = "orderOfProducts")
    private List<ProductsInOrder> productsInOrders;



    //конструкторы
    public OrderOfProducts(Integer orderOfProductsId, Date receiptDate, List<ProductsInOrder> productsInOrders) {
        this.id = orderOfProductsId;
        this.receiptDate = receiptDate;
        this.productsInOrders = productsInOrders;
    }

    public OrderOfProducts() {
    }

    public OrderOfProducts(Object date) {

    }


    //геттеры и сеттеры

    public Integer getOrderOfProductsId() {
        return id;
    }

    public void setOrderOfProductsId(Integer orderOfProductsId) {
        this.id = orderOfProductsId;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public List<ProductsInOrder> getProductsInOrders() {
        return productsInOrders;
    }

    public void setProductsInOrders(List<ProductsInOrder> productsInOrders) {
        this.productsInOrders = productsInOrders;
    }



}
