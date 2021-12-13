package Accounts;

import java.util.Scanner;

public class Writer extends Account {
    String login="1111";
    String password="1111";
    boolean check(String login, String paasword)
    {
        if((this.login==login)&&(this.password==paasword)) return true;
        else return false;
    }

    public  Writer()
    {
        String password, login;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Login:");
            login=scanner.next();
            System.out.print("Password:");
            password=scanner.next();
        } while (!check(login,password));
    }

    void main() {
    System.out.print("Выберите действие:\n1)показать все новости;\n2)показать свои новости;\n3)создать новость;\n0)выйти\n:");
    int choice=new Scanner(System.in).nextInt();
    switch (choice)
    {
        case (1)
    }
    }


}
