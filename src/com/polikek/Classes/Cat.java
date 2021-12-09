package com.polikek.Classes;

import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Cat implements Serializable, Comparator {

    private int id;
    private String url;
    private String webpurl;
    private double x;
    private double y;
    private final static long serialVersionUID = -4951829092790569081L;

    /**
     * No args constructor for use in serialization
     */
    public Cat() {
    }

    /**
     * @param x
     * @param y
     * @param id
     * @param webpurl
     * @param url
     */
    public Cat(int id, String url, String webpurl, double x, double y) {
        super();
        this.id = id;
        this.url = url;
        this.webpurl = webpurl;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWebpurl() {
        return webpurl;
    }

    public void setWebpurl(String webpurl) {
        this.webpurl = webpurl;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Cat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null) ? "<null>" : this.url));
        sb.append(',');
        sb.append("webpurl");
        sb.append('=');
        sb.append(((this.webpurl == null) ? "<null>" : this.webpurl));
        sb.append(',');
        sb.append("x");
        sb.append('=');
        sb.append(this.x);
        sb.append(',');
        sb.append("y");
        sb.append('=');
        sb.append(this.y);
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}