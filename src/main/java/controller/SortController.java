package controller;

import comparators.SortByIdComparator;
import comparators.SortByPriceComparator;
import comparators.SortByTitleComparator;
import comparators.SortByTypeComparator;
import dao.IProductDao;
import model.Product;
import view.JTableModel;
import view.TopLevelFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.List;

/**
 * Created by Lisa on 1/23/2017.
 */
public class SortController {
    public SortController(IProductDao dao, TopLevelFrame startFrame) {
        List<Product> products = dao.getAllProduct();

        switch ((String) startFrame.getProductSortType().getSelectedItem()) {
            case "Type":
                Collections.sort(products, new SortByTypeComparator());
            case "Id":
                Collections.sort(products, new SortByIdComparator());
            case "Title":
                Collections.sort(products, new SortByTitleComparator());
            case "Price":
                Collections.sort(products, new SortByPriceComparator());
        }

        JTableModel tableModel = new JTableModel(products);
        JTable jTableProducts = new JTable(tableModel);
        jTableProducts.setPreferredScrollableViewportSize(new Dimension(850, 300));
        JScrollPane scrollPaneTable = new JScrollPane(jTableProducts);
        startFrame.getContentPane().remove(startFrame.getContentPane().getComponent(0));
        startFrame.getContentPane().add(scrollPaneTable, 0);
        startFrame.revalidate();
    }
}


