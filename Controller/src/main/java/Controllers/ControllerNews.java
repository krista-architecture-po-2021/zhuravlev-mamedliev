package Controllers;

import BO.BisnesObjectNews;
import DO.NewsDo;
import Modell.ModelFactory;

import java.util.ArrayList;

public class ControllerNews implements InterfaceNewsController {
    private ArrayList<BisnesObjectNews> bonews;

    ArrayList<BisnesObjectNews> getBonews()
    {
        return bonews;
    }

    private ModelFactory modelFactory;

    public ControllerNews(ModelFactory modelFactory)
    {
        this.modelFactory=modelFactory;
    }



    @Override
    public void addnewnew(BisnesObjectNews bo)
    {
        modelFactory.getNewsDao().getall().add(new NewsDo(modelFactory.getNewsDao().getall().size(),bo.getAuthor(),bo.getTitle(),bo.getMessage(),bo.getPublucationdate()));
    }

    @Override
    public BisnesObjectNews getnewbytext(String text)
    {
        for(NewsDo donews:modelFactory.getNewsDao().getall())
        {
            if(donews.getMessage().contains(text)) return new BisnesObjectNews(donews.getAuthor(),donews.getTitle(),donews.getMessage(),donews.getPublucationdate());
        }
        return null;
    }

    @Override
    public ArrayList<BisnesObjectNews> getnewslist()
    {
        for(NewsDo newsDo:modelFactory.getNewsDao().getall())
        {
            bonews.add(new BisnesObjectNews(newsDo.getAuthor(),newsDo.getTitle(),newsDo.getMessage(),newsDo.getPublucationdate()));
        }
        return bonews;
    }

    @Override
    public void newschange(int id, String text)
    {
        modelFactory.getNewsDao().get(id).setMessage(text);
    }

    @Override
    public void deletenew(int num)
    {
        modelFactory.getNewsDao().getall().remove(num);
    }
}

