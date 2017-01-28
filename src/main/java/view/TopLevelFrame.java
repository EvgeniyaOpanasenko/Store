package view;

import model.Product;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by Lisa on 1/23/2017.
 */
public class TopLevelFrame extends JFrame{

    private JTableModel tableModel;
    private JScrollPane scrollPaneTable;
    private JTable jTableProducts;

    private JButton addProductButton = new JButton("Add product");
    private JButton deleteProductButton = new JButton("Delete product");
    private JButton sortProductButton = new JButton("Sort");

    private final String[] productSortStrings = {"<make choice>","Type","Id", "Title","Price"};

    private JComboBox<String> productSortType = new JComboBox<>(productSortStrings);

    public TopLevelFrame(List<Product> products) {

        setTitle("Store");
        setResizable(false);
        getContentPane().setLayout(new GridBagLayout());
        setSize(new Dimension(900, 450));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        tableModel = new JTableModel(products);
        jTableProducts = new JTable(tableModel);
        jTableProducts.setPreferredScrollableViewportSize(new Dimension(850, 300));
        scrollPaneTable = new JScrollPane(jTableProducts);
        getContentPane().add(scrollPaneTable);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(15, 15, 15, 15);

        constraints.fill = GridBagConstraints.BOTH;

        productSortType = new JComboBox<>(productSortStrings);

        JPanel buttonPanel = new JPanel();
        constraints.gridx = 0;
        constraints.gridy = 0;
        buttonPanel.add(addProductButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        buttonPanel.add(deleteProductButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        buttonPanel.add(sortProductButton, constraints);
        constraints.gridx = 1;
        buttonPanel.add(productSortType, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(buttonPanel, constraints);
        pack();
    }

    public JComboBox<String> getProductSortType() {
        return productSortType;
    }

    public JButton getAddProductButton() {
        return addProductButton;
    }

    public JButton getSortProductButton() {
        return sortProductButton;
    }

}
