package dao;

import model.Product;

import java.util.List;

/**
 * Created by Lisa on 1/21/2017.
 */
public interface IProductDao {
    public boolean addProduct(Product product);

    public boolean removeProduct(Product product);

    // must return only one Product
    //public Product getProduct (Product product);
    public List<Product> getAllProduct();

}
