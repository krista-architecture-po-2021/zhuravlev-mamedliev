package Modell;

import DAO.CategoryDao;
import DAO.NewsDao;
import DO.CategoryDo;
import DO.NewsDo;

import java.util.ArrayList;

public abstract class ModelFactory {
    private static final int JSON = 1;
    private static final int DB = 2;


    public abstract CategoryDao getCategoryDao();

    public abstract NewsDao getNewsDao();

    private ArrayList<NewsDo> newsDoArrayList;

    private ArrayList<CategoryDo> categoryDoArrayList;

    public static ModelFactory getModel(int value) {
        if (value == JSON) return new Jsonmodel();
        else return new Dbmodel();
    }

}
