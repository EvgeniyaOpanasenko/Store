package view;

import model.Product;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * Created by Lisa on 1/23/2017.
 */
public class JTableModel extends AbstractTableModel {
    private List<Product> products;

    public JTableModel(List<Product> products) {
        super();
        this.products = products;
    }

    @Override
    public int getRowCount() {
        return products.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return products.get(rowIndex).getName();
            case 1:
                return products.get(rowIndex).getType();
            case 2:
                return products.get(rowIndex).getPrice();
            case 3:
                return products.get(rowIndex).getIdProduct();

            default:
                return "";

        }
    }

    @Override
    public String getColumnName(int column) {
        String res = "";

        switch (column) {
            case 0:
                res = "Title";
                break;
            case 1:
                res = "Type";
                break;
            case 2:
                res = "Price";
                break;
            case 3:
                res = "Id";
                break;
        }
        return res;
    }
}
