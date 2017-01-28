package comparators;

import model.Product;

import java.util.Comparator;

/**
 * Created by Lisa on 1/23/2017.
 */
public class SortByTitleComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
