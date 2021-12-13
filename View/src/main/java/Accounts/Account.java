package Accounts;

import BO.BisnesObjectNews;
import Facade.Facade;
import Facade.FacadeInteface;
import InfoOjbects.NewsInfoObject;

import javax.inject.Inject;
import java.util.ArrayList;

public abstract class Account {
    @Inject
    private static FacadeInteface facade;

    ArrayList<NewsInfoObject> news;

    private String fullname;

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }
    public static Account getAccounttype(int num)
    {
        facade=new Facade();
        if(num==1) return new User();
        if(num==2) return new Writer();
        if(num==3) return new Admin();
        return null;
    }

    ArrayList<NewsInfoObject> Getallnews(boolean author)
    {
        ArrayList<BisnesObjectNews> temp;
        news=new ArrayList<>();
        temp=facade.getnewslist();
        for (int i=1; i<temp.size(); i++)
        {
            if(!author)news.add(new NewsInfoObject(temp.get(i).getMessage(),temp.get(i).getAuthor(),i));
            else if(temp.get(i).getAuthor()==fullname) news.add(new NewsInfoObject(temp.get(i).getMessage(),temp.get(i).getAuthor(),i));
        }
        return news;
    }


}
