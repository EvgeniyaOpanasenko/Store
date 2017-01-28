package dao;

import model.Product;

import java.util.List;

/**
 * Created by Lisa on 1/21/2017.
 */
public interface IProductDao {

    boolean saveProduct(Product product);

    boolean removeProduct(Product product);

    List<Product> getAllProduct();

}
