package DAO;

import DO.NewsDo;
import Provider.IProvider;

import java.util.ArrayList;

public class NewsDao implements Dao<NewsDo> {

    private String entityName= "news";
    private IProvider provider;
    public NewsDo update(NewsDo newsDo)
    {
        return provider.;
    }

    @Override
    public ArrayList<NewsDo> getall() {
        return null;
    }

    @Override
    public NewsDo get(int id) {
        return null;
    }

    @Override
    public void change(int id, NewsDo newsDo) {

    }

    @Override
    public void add(NewsDo newsDo) {

    }

    @Override
    public void delete(int id) {

    }
}

