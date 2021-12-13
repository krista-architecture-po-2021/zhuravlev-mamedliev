package InfoOjbects;

import Facade.Facade;

import java.util.ArrayList;

public class NewsInfoObject {
    private Facade facade;

    public class New{
        String author;
        String title;
        String message;
        int id;
    }

    public ArrayList<New> news;
}
