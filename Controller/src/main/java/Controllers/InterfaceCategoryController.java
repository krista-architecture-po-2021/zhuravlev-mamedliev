package Controllers;

import BO.BisnesObjectCategory;

import java.util.ArrayList;

public interface InterfaceCategoryController {

    default int categoryfindbyname(String name){
        return 0;
    }

    default ArrayList<BisnesObjectCategory> returnallcategories() {
        return null;
    }

    default void addcategory(String category) {

    }

    default void categorychange(int catnum, String category) {

    }

    default void categorydelete(int catnum) {

    }

}
