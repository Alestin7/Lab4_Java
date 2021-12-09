package com.polikek;

import com.polikek.Classes.Cat;
import com.polikek.Classes.Cats;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;


public class Main {

    public static void main(String[] args) throws IOException {
        Cats cats = new Cats();
        for (Cat obj : run(5)) {
            cats.addCat(obj);
        }
        System.out.println("list before comparing:" + System.lineSeparator() + cats);
        cats.getCatList().sort(Cats.byIdAsc);
        System.out.println("list after byIdAsc:" + System.lineSeparator() + cats);
        cats.getCatList().sort(Cats.byIdDesc);
        System.out.println("list after byIdDesc:" + System.lineSeparator() + cats);
    }

    public static ArrayList<Cat> run(int number) throws IOException {
        Cats cats = new Cats();
        if (number <= 0)
            return cats.getCatList();

        try {
            for (int i = 0; i < number; i++)
                cats.loadURLOnNewThread("https://thatcopy.pw/catapi/rest/");

        } catch (Exception exception) {
            FileWriter fw = new FileWriter(String.valueOf((new Date().getTime() / 1000)), true);
            fw.write(exception.getMessage());

        }
        return cats.getCatList();
    }
}
