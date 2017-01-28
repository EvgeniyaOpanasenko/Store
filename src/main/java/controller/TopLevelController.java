package controller;


import dao.IProductDao;
import model.Product;
import view.TopLevelFrame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa on 1/21/2017.
 */
public class TopLevelController {
    private TopLevelFrame startFrame;

    public TopLevelController(IProductDao dao) {

        List<Product> products = new ArrayList<Product>(dao.getAllProduct());
        this.startFrame = new TopLevelFrame(products);

        startFrame.getSortProductButton().addActionListener(e -> {
            new SortController(dao, startFrame);
        });
        startFrame.getAddProductButton().addActionListener(e -> {
            new AddProductController(dao, startFrame);
        });
    }

    public void run() {
        startFrame.setVisible(true);
    }

}
