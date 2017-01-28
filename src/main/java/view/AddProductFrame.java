package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Lisa on 1/23/2017.
 */
public class AddProductFrame extends JFrame {

    private JLabel titleLabel = new JLabel("Title");
    private JLabel idLabel = new JLabel("Id");
    private JLabel priceLabel = new JLabel("Price");
    private JLabel typelabel = new JLabel("Type");

    private JTextField title = new JTextField(15);
    private JTextField id = new JTextField(15);
    private JTextField price = new JTextField(15);
    private JTextField type = new JTextField(15);

    private final String[] productsStrings = {"<make choice>","CELL_PHONE","NOTEBOOK", "ACCESSORY"};
    private JComboBox<String> productTypeComBox = new JComboBox<>(productsStrings);

    private JButton okButton = new JButton("OK");
    private JButton cancelButton = new JButton("Cancel");

    public AddProductFrame() throws HeadlessException {
        setTitle("Add contact");
        setResizable(false);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(new Dimension(600, 400));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        constraints.fill = GridBagConstraints.BOTH;


        constraints.gridx = 0;
        constraints.gridy = 0;
        add(titleLabel, constraints);

        constraints.gridx = 1;
        add(title, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(priceLabel, constraints);

        constraints.gridx = 1;
        add(price, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        add(idLabel, constraints);

        constraints.gridx = 1;
        add(id, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        add(typelabel, constraints);

        constraints.gridx = 1;
        add(productTypeComBox, constraints);

        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridx = 0;
        constraints.gridy = 11;
        add(okButton, constraints);

        constraints.gridx = 1;
        add(cancelButton, constraints);

        pack();
        setVisible(true);
    }

    public JTextField getProductTitle() {
        return title;
    }

    public JTextField getId() {
        return id;
    }

    public JTextField getPrice() {
        return price;
    }

    public JTextField getProductType() {
        return type;
    }

    public JComboBox<String> getProductTypeComBox() {
        return productTypeComBox;
    }

    public JButton getOkButton() {
        return okButton;
    }

}
