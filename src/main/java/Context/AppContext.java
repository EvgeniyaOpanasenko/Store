package Context;

import controller.TopLevelController;
import dao.IProductDao;
import dao.ProductDao;
import utils.FileSaver;

/**
 * Created by Lisa on 1/21/2017.
 */
public class AppContext {
    private String path = "./src/main/resources/store.txt";
    private FileSaver fileSaver;
    private IProductDao dao;
    private TopLevelController controller;

    private final static AppContext INSTANCE = new AppContext();

    public static AppContext getInstance() {
        return INSTANCE;
    }

    public AppContext() {
        this.fileSaver = new FileSaver(path);
        this.dao = new ProductDao(fileSaver);
        this.controller = new TopLevelController(dao);
    }

    public TopLevelController getController() {
        return controller;
    }
}
