package DAO;

import DO.NewsDo;

import java.util.ArrayList;

public interface Dao<N> {
    ArrayList<N> getall();

    NewsDo get(int id);

    void change(int id, N n);

    void add(N n);

    void delete(int id);
}
