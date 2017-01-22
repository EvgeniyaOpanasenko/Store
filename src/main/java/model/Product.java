package model;


import enums.ProductType;
import exceptions.InvalidPriceException;
import exceptions.InvalidProductIdException;

import static utils.ValidationUtils.validatePrice;
import static utils.ValidationUtils.validateProductId;

/**
 * Created by Lisa on 1/21/2017.
 */
public class Product {
    private ProductType type;
    private String name;
    private int price;
    // starts from 1
    private int idProduct;

    public Product(ProductType type, String name, int price, int idProduct)
            throws InvalidPriceException, InvalidProductIdException {
        this.type = type;
        this.name = name;
        this.price = price;
        this.idProduct = idProduct;

        validatePrice(price);
        validateProductId(idProduct);
    }

    public ProductType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
