import Context.AppContext;
import controller.AddProductController;
import enums.ProductType;
import exceptions.InvalidPriceException;
import exceptions.InvalidProductIdException;
import model.Product;
import view.AddProductFrame;
import view.TopLevelFrame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa on 1/21/2017.
 */
public class Run {
    public static void main(String[] args)
            throws InvalidPriceException, InvalidProductIdException {

        /*List<Product> products = new ArrayList<>();
        Product p = new Product(ProductType.CELL_PHONE,
                "cellPhone",  4 , 1);

        Product p1 = new Product(ProducFtType.ACCESSORY,
                "cellPhone",  4 , 2);


        Product p2 = new Product(ProductType.NOTEBOOK,
                "cellPhone",  4 , 3);

        products.add(p);
        products.add(p1);
        products.add(p2);

        TopLevelFrame tp = new TopLevelFrame(products);
        tp.setVisible(true);*/

        AppContext context = AppContext.getInstance();
        context.getController().run();



    }

}
