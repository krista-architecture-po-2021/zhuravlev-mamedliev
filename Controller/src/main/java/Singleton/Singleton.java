package Singleton;

import BO.BisnesObjectCategory;

import java.util.ArrayList;

public class Singleton {
    private static Singleton singleton;
    private ArrayList<BisnesObjectCategory> categories;
    private Singleton(ArrayList<BisnesObjectCategory> values)
    {
        this.categories=values;
    }
    private Singleton()
    {
        categories=new ArrayList<>();
    }

    public static Singleton getInstance(ArrayList<BisnesObjectCategory> categories)
    {
        if(singleton==null)
            synchronized (Singleton.class)
            {
                if(singleton==null) singleton=new Singleton(categories);
            }
        return singleton;
    }
}
