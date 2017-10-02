package main.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {
        Order ord1 = new Order(1,1110.11, "t");
        Order ord2 = new Order(2, 10000.11, "q");
        Order ord3 = new Order(3, 10.11, "s");

        List<Order> orders = new ArrayList<>();
        orders.add(ord1);
        orders.add(ord2);
        orders.add(ord3);

        Collections.sort(orders);
        System.out.println("natural order " + orders);

        Collections.sort(orders, Collections.reverseOrder());
        System.out.println("reverse order " + orders);

        Collections.sort(orders, new Order.OrderByNum());
        System.out.println("order by number " + orders);

        Collections.sort(orders, new Order.OrderByStr());
        System.out.println("order by string " + orders);

    }
}
