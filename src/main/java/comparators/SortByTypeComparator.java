package comparators;

import model.Product;

import java.util.Comparator;

/**
 * Created by Lisa on 1/23/2017.
 */
public class SortByTypeComparator implements Comparator<Product> {
    @Override
    public int compare(Product product, Product product2) {
        return product.getType().compareTo(product2.getType());
    }
}
