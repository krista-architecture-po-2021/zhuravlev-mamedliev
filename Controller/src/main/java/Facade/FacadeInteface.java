package Facade;

import java.util.ArrayList;

public interface FacadeInteface {

    default void addnewnew(String line) {

    }

    default News getnewbyname(String line)
    {
        return null;
    }

    default ArrayList<News> getnewslist(){
        return null;
    }



}
