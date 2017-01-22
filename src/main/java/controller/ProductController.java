package controller;

import dao.IProductDao;
import model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa on 1/21/2017.
 */
public class ProductController implements IProductDao {
    private IProductDao dao;

    public ProductController(IProductDao dao) {
        List<Product> products = new ArrayList<Product>(dao.getAllProduct());
    }

    public void run() {

    }

    public boolean addProduct(Product product) {
        return false;
    }

    public boolean removeProduct(Product product) {
        return false;
    }

    public List<Product> getAllProduct() {
        return null;
    }
}
