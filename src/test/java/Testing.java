
import Facade.Facade;
import Controllers.ControllerNews;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Testing {
    @Test
     void addingnew()
    {
        Facade facade=new Facade();
        String line="Test";
        facade.addnewnew(line);
        System.out.println("Test 1 (adding): "+facade.getnewbyname(line).getMaintext());
    }
   @Test
    void  gettingnew()
    {
        Facade facade=new Facade();
        facade.addnewnew("Test");
        facade.addnewnew("Mark");
        facade.addnewnew("Vova");
        News news=facade.getnewbyname("Mark");
        ControllerNews cn=null;
        try {
            Field field=facade.getClass().getDeclaredField("controllerNews");
            field.setAccessible(true);
            cn = (ControllerNews) field.get(facade);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Test 2 (getting new): "+news.getMaintext()+" "+cn.getnewslist().indexOf(news));
    }

    @Test
    void getnewslist()
    {
        Facade facade=new Facade();
        facade.addnewnew("Mark");
        facade.addnewnew("Vova");
        System.out.println("Test 3: ");
        for(News i:facade.getnewslist())
        System.out.println(i.getMaintext());
//        ArrayList<News> example=facade.getnewslist();
//        ArrayList<News> temp=null;
//        try {
//        Field field= facade.getClass().getDeclaredField("controllerNews");
//        field.setAccessible(true);
//        ControllerNews controllerNews= (ControllerNews) field.get(facade);
//        field=controllerNews.getModell().getClass().getDeclaredField("news");
//        field.setAccessible(true);
//        temp= (ArrayList<News>) field.get(controllerNews);
//    } catch (NoSuchFieldException e) {
//        e.printStackTrace();
//    } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        assertEquals(temp,example);
    }
//    @Test
//    void newschanging(){
//        Facade facade=new Facade();
//        facade.addnewnew("Mark");
//        facade.
//        assertEquals(facade.getcurrentnew().getMaintext(),"Changed");
//    }
//    @Test
//    void deletingnew()
//    {
//        Facade facade=new Facade();
//        facade.addnewnew("Mark");
//        facade.addnewnew("Vova");
//        facade.setCurrentnew(0);
//        facade.deletenews();
//        assertEquals(facade.getcurrentnew().getMaintext(),"Vova");
//    }
//    @Test
//    void gettingcategories()
//    {
//        Facade facade=new Facade();
//        facade.getCategories().addcategory("1");
//        facade.getCategories().addcategory("2");
//        ArrayList<String> temp=null;
//        try {
//            Field field=facade.getCategories().getClass().getDeclaredField("categories");
//            field.setAccessible(true);
//            temp=(ArrayList<String>) field.get(facade.getCategories());
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        assertEquals(facade.getCategories().getCategories(),temp);
//    }
//    @Test
//    void addingcategory()
//    {
//        Facade facade=new Facade();
//        facade.getCategories().addcategory("1");
//        facade.getCategories().setCurrentcategory(0);
//        assertEquals(facade.getCategories().getcategory(),"1");
//    }
//    @Test
//    void changingcategories()
//    {
//        Facade facade=new Facade();
//        facade.getCategories().addcategory("1");
//        facade.getCategories().setCurrentcategory(0);
//        facade.getCategories().categorychange("Changed");
//        assertEquals(facade.getCategories().getcategory(),"Changed");
//    }
//    @Test
//    void delitingingcategories()
//    {
//        Facade facade=new Facade();
//        facade.getCategories().addcategory("1");
//        facade.getCategories().addcategory("2");
//        facade.getCategories().setCurrentcategory(0);
//        facade.getCategories().categorydelete();
//        assertEquals(facade.getCategories().getcategory(),"2");
//    }
}
