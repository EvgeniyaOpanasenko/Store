package comparators;

import model.Product;

import java.util.Comparator;

/**
 * Created by Lisa on 1/23/2017.
 */
public class SortByIdComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getIdProduct()-product2.getIdProduct();
    }
}
