import enums.ProductType;
import exceptions.InvalidPriceException;
import exceptions.InvalidProductIdException;
import model.Product;

/**
 * Created by Lisa on 1/21/2017.
 */
public class Run {
    public static void main(String[] args)
            throws InvalidPriceException, InvalidProductIdException {
        Product p = new Product(ProductType.CELL_PHONE,
                "cellPhone",  4 , 1);

        Product p1 = new Product(ProductType.ACCESSORY,
                "cellPhone",  4 , 2);


        Product p2 = new Product(ProductType.NOTEBOOK,
                "cellPhone",  4 , 3);



    }

}
