package Modell;

import DAO.CategoryDao;
import DAO.NewsDao;

public class Dbmodel extends ModelFactory {
    @Override
    public CategoryDao getCategoryDao() {
        return null;
    }

    @Override
    public NewsDao getNewsDao() {
        return null;
    }
}
