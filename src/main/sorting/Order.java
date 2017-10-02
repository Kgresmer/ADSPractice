package main.sorting;

import java.util.Comparator;

public class Order implements Comparable<Order> {

    private final double num;
    private final String str;
    private final int id;

    public Order(int id, double num, String str) {
        this.id = id;
        this.num = num;
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public double getNum() {
        return num;
    }

    @Override
    public int compareTo(Order o) {
        return this.id > o.id ? 1 : (this.id < o.id ? -1 : 0);
    }

    public int getId() {
        return id;
    }

    public static class OrderByNum implements Comparator<Order> {

        @Override
        public int compare(Order o1, Order o2) {
            return o1.num > o2.num ? 1 : (o1.num < o2.num ? -1 : 0);
        }
    }

    public static class OrderByStr implements Comparator<Order> {

        @Override
        public int compare(Order o1, Order o2) {
            return o1.str.compareTo(o2.str);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.id);
    }
}
