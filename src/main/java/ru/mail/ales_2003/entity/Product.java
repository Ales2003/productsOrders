package main.java.ru.mail.ales_2003.entity;

import java.util.List;

/**
 * Created by USER on 20.04.2016.
 */
//класс Товар
public class Product {
    //Id товара = ключ
    private Integer id;
    //название товара
    private String nameOfProduct;
    //цена товара
    private Integer priceOfProduct;
    //опісаніе товара
    private String describtionOfProduct;
    //лист товаров в заказе для внешнего ключа
    private List<ProductsInOrder> productsInOrders;



    //конструкторы

    public Product(Integer productId, String nameOfProduct, Integer priceOfProduct, String describtionOfProduct) {
        this.id = productId;
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
        this.describtionOfProduct = describtionOfProduct;
    }

    public Product() {
    }


    //геттеры и сеттеры

    public Integer getProductId() {
        return id;
    }

    public void setProductId(Integer productId) {
        this.id = productId;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public Integer getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(Integer priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public String getDescribtionOfProduct() {
        return describtionOfProduct;
    }

    public void setDescribtionOfProduct(String describtionOfProduct) {
        this.describtionOfProduct = describtionOfProduct;
    }


}
