package ru.mail.ales.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by USER on 20.04.2016.
 */
//класс Товар

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Id товара = ключ
    private Integer id;
    //название товара
    private String nameOfProduct;
    //цена товара
    private Integer priceOfProduct;
    //опісаніе товара
    private String describtionOfProduct;
    //лист товаров в заказе для внешнего ключа

    @OneToMany(mappedBy = "product")
    private List<ProductsInOrder> productsInOrders;



    //конструкторы

    public Product(Integer productId, String nameOfProduct, Integer priceOfProduct, String describtionOfProduct) {
        this.id = productId;
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
        this.describtionOfProduct = describtionOfProduct;
    }

    public Product(String productName, String describtion, Integer price) {
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
