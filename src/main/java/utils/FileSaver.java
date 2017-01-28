package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.Product;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa on 1/21/2017.
 */
public class FileSaver {

    private String path;
    private Gson gson = new Gson();

    public FileSaver(String path) {
        this.path = path;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public List<Product> read() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            List<Product> products = gson.fromJson(br, new TypeToken<List<Product>>() {
            }.getType());
            if (products == null) {
                products = new ArrayList();
            }
            return products;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void save(List <Product> products) {
        String json = gson.toJson(products);
        try {
            FileWriter fr = new FileWriter(path);
            fr.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
