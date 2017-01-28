package controller;

import dao.IProductDao;
import exceptions.InvalidPriceException;
import exceptions.InvalidProductIdException;
import model.Product;
import view.AddProductFrame;
import view.JTableModel;
import view.TopLevelFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Lisa on 1/23/2017.
 */
public class AddProductController {
    public AddProductController(IProductDao dao, TopLevelFrame startFrame) {
        AddProductFrame addProductFrame = new AddProductFrame();

        addProductFrame.getOkButton().addActionListener(e -> {
                String type = (String) addProductFrame.getProductTypeComBox().getSelectedItem();
                String name = addProductFrame.getProductTitle().getText();
                int price = Integer.parseInt(addProductFrame.getPrice().getText());
                int idProduct = Integer.parseInt(addProductFrame.getId().getText());

            try {
                Product product = new Product(type, name, price, idProduct);
                boolean result = dao.saveProduct(product);

                if (!result) {
                    JOptionPane.showMessageDialog(addProductFrame,
                            "Such contact is already in the list",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    JOptionPane.showMessageDialog(addProductFrame,
                            "Perfect",
                            "Well done",
                            JOptionPane.INFORMATION_MESSAGE);

                    JTableModel tableModel = new JTableModel(dao.getAllProduct());
                    JTable jTableProduct = new JTable(tableModel);
                    jTableProduct.setPreferredScrollableViewportSize(new Dimension(850, 300));
                    JScrollPane scrollPaneTable = new JScrollPane(jTableProduct);
                    startFrame.getContentPane().remove(startFrame.getContentPane().getComponent(0));
                    startFrame.getContentPane().add(scrollPaneTable, 0);
                    startFrame.revalidate();
                    addProductFrame.dispose();
                }
            } catch (InvalidPriceException e1) {
                e1.printStackTrace();
            } catch (InvalidProductIdException e1) {
                e1.printStackTrace();
            }

        });
    }
}
