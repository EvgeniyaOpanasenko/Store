package dao;

import model.Product;
import utils.FileSaver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa on 1/21/2017.
 */
public class ProductDao implements IProductDao {

    private FileSaver fileSaver;

    public ProductDao(FileSaver fileSaver) {
        this.fileSaver = fileSaver;
    }

    public boolean saveProduct(Product product) {
        List<Product> products;
        products = fileSaver.read();
        if (!products.contains(product)) {
            products.add(product);
            fileSaver.save(products);
            return true;
        }
        return false;
    }

    public boolean removeProduct(Product product) {
        List<Product> products;
        products = fileSaver.read();
        if (products.contains(product)) {
            products.remove(product);
            fileSaver.save(products);
            return true;
        }
        return false;
    }

    public List<Product> getAllProduct() {
        return fileSaver.read();
    }
}
