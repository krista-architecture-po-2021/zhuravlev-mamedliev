package Controllers;

import BO.BisnesObjectCategory;
import DO.CategoryDo;
import Modell.ModelFactory;
import Singleton.Singleton;
import org.apache.maven.model.Model;


import java.util.ArrayList;

public class ControllerCategories implements InterfaceCategoryController {

    private Singleton singleton;

    private ArrayList<BisnesObjectCategory> bocategory;

    private ModelFactory modelFactory;

    public ControllerCategories(ModelFactory ModelF)
    {
        this.modelFactory=ModelFactory.getModel(1);
    }
    @Override
    public int categoryfindbyname(String name) {

       else  return -1;
    }

    @Override
    public ArrayList<BisnesObjectCategory> returnallcategories() {
        return Model.getCategories();
    }
}

