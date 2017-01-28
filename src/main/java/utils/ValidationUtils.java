package utils;

import exceptions.InvalidPriceException;
import exceptions.InvalidProductIdException;

/**
 * Created by Lisa on 1/21/2017.
 */
public class ValidationUtils {

    public static void validateProductId(int id) throws InvalidProductIdException {

        if (id <= 0 ) {
            throw new InvalidProductIdException("Invalid product id");
        }
    }


    public static void validatePrice(int price) throws InvalidPriceException {

        if ( price < 0) {
            throw new InvalidPriceException("Invalid product id");
        }
    }

}
