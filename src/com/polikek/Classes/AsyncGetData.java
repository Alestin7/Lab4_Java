package com.polikek.Classes;

import com.alibaba.fastjson.JSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class AsyncGetData extends Thread {
    private String url = "";
    volatile Cat object = new Cat();

    public void setUrl(String url) {
        this.url = url;
    }

    public Cat getObject() {
        return object;
    }

    public void loadByURL() throws IOException {

        StringBuilder jsonIn = new StringBuilder();
        try (InputStream is = new URL(url).openStream()) {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));

            int cp;
            while ((cp = rd.read()) != -1) {
                jsonIn.append((char) cp);
            }
        }

        object = JSON.parseObject(jsonIn.toString().strip(), Cat.class);
    }

    @Override
    public void run() {

        try {
            loadByURL();
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.run();
    }
}
