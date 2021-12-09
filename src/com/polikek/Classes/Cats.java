package com.polikek.Classes;

import java.util.ArrayList;
import java.util.Comparator;


public class Cats extends Cat {

    private int count;
    private final ArrayList<Cat> catList;

    public Cats() {
        count = 0;
        catList = new ArrayList<>();
    }

    public int getCount() {
        return count;
    }

    public void addCat(Cat cat) {
        catList.add(cat);
        count++;
    }

    public ArrayList<Cat> getCatList() {
        return catList;
    }

    public void loadURLOnNewThread(String url) throws InterruptedException {

        AsyncGetData data = new AsyncGetData();
        data.setUrl(url);
        data.start();
        do {
            Thread.currentThread().join(250);

        }while (data.getObject().getUrl()==null);
        this.addCat(data.getObject());

    }

    public static Comparator<Cat> byIdAsc = Comparator.comparingInt(Cat::getId);
    public static Comparator<Cat> byIdDesc = (o1, o2) -> Integer.compare(o2.getId(), o1.getId());

    @Override
    public String toString() {
        return "Cats{" +
                "catList=" + catList +
                '}';
    }
}
