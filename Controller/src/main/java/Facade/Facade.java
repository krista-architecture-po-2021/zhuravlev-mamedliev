package Facade;

import DO.CategoryDo;
import DO.NewsDo;
import Controllers.ControllerCategories;
import Controllers.ControllerNews;
import Controllers.InterfaceCategoryController;
import Controllers.InterfaceNewsController;
import Modell.ModelFactory;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Facade implements  FacadeInteface{

    @Inject
    private InterfaceNewsController controllerNews;

    @Inject
    private InterfaceCategoryController controllercategories;

    @Inject
    private ModelFactory modelFactory;
    String Words[]={"Стол","Скатерть"};
    String selectedAuthors[]={"Хлебушек"};


    private Date remove7Days()
    {
        Calendar c=Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH,-7);
        Date d=new Date();
        d.setTime(c.getTime().getTime());
        return d;
    };
    public void getNewsController()
    {

    }
    Date publicationdate=remove7Days();
    public Facade()
    {
        controllerNews=new ControllerNews(modelFactory);
        controllercategories=new ControllerCategories(modelFactory);
    }



}
