package Controllers;

import BO.BisnesObjectNews;
import DO.NewsDo;

import java.util.ArrayList;

public interface InterfaceNewsController {

    void addnewnew(BisnesObjectNews bo);

    default BisnesObjectNews getnewbytext(String text) {
        return null;
    }

    default ArrayList<BisnesObjectNews> getnewslist() {
        return null;
    }

    default void newschange(int newsnum, String text) {

    }

    default void deletenew(int num) {

    }

}
