package com.IdoShoshani;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

class Main {
    public static void main(String[] args) throws IOException {
        Customer a = new Customer("A", "B");
        Customer b = new Customer("A", "B");
        System.out.println(a.customerNumber);
        System.out.println(b.customerNumber);

        RepairOrder order = new RepairOrder(b.customerNumber,"bianchi","gold","comment");
        System.out.println(order.orderDate);
        System.out.println(order.promiseDate);
        System.out.println(order.repairPrice);
        UI userInterface = new UI();
        userInterface.run();
    }
}

