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
    private String type;
    private String name;
    private int price;
    // starts from 1
    private int idProduct;

    public Product(String type, String name, int price, int idProduct)
            throws InvalidPriceException, InvalidProductIdException {
        this.type = type;
        this.name = name;
        this.price = price;
        this.idProduct = idProduct;

        validatePrice(price);
        validateProductId(idProduct);
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        if (idProduct != product.idProduct) return false;
        if (!type.equals(product.type)) return false;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + price;
        result = 31 * result + idProduct;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("type=").append(type);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", idProduct=").append(idProduct);
        sb.append('}');
        return sb.toString();
    }
}
