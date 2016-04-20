package main.java.ru.mail.ales_2003.entity;

/**
 * Created by USER on 20.04.2016.
 */
//класс Товары в заказе
public class ProductsInOrder {
    //Id товаров в каказе = ключ
    private Integer id;
    //товар
    private Product product;
    //количество
    private Integer quantityOfProducts;



    //конструкторы

    public ProductsInOrder(Integer productsInOrderId, Product product, Integer quantityOfProducts) {
        this.id = productsInOrderId;
        this.product = product;
        this.quantityOfProducts = quantityOfProducts;
    }

    public ProductsInOrder() {
    }


    //геттеры и сеттеры

    public Integer getProductsInOrderId() {
        return id;
    }

    public void setProductsInOrderId(Integer productsInOrderId) {
        this.id = productsInOrderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantityOfProducts() {
        return quantityOfProducts;
    }

    public void setQuantityOfProducts(Integer quantityOfProducts) {
        this.quantityOfProducts = quantityOfProducts;
    }


}
