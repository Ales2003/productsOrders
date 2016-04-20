package main.java.ru.mail.ales_2003.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by USER on 20.04.2016.
 */
//класс Заказ товаров
public class OrderOfProducts {
    //номер заказа =ключ
    private Integer id;
    //дата поступления заказа
    private Date receiptDate;
    //лист товаров в заказе
    private List<ProductsInOrder> productsInOrders;

    //конструкторы
    public OrderOfProducts(Integer orderOfProductsId, Date receiptDate, List<ProductsInOrder> productsInOrders) {
        this.id = orderOfProductsId;
        this.receiptDate = receiptDate;
        this.productsInOrders = productsInOrders;
    }

    public OrderOfProducts() {
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
