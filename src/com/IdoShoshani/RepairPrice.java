package com.IdoShoshani;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.*;

public class RepairPrice {

    static Map<String,Integer> days = new HashMap<String,Integer>();

    static {
        days.put("silver",4);
        days.put("gold",7);
        days.put("platinum",10);
    }

    static Map<String,Integer> brandsInt = new HashMap<String,Integer>();
    static Map<String,Integer> levelsInt = new HashMap<String,Integer>();

    static int[][] prices = new int[10][20];

    static {
        //Trek
        prices[0][0] = 40;
        prices[1][0] = 60;
        prices[2][0] = 100;

        //Cannondale
        prices[0][1] = 40;
        prices[1][1] = 60;
        prices[2][1] = 100;

        //Salsa
        prices[0][2] = 50;
        prices[1][2] = 70;
        prices[2][2] = 115;

        //Jamis
        prices[0][3] = 60;
        prices[1][3] = 75;
        prices[2][3] = 120;

        //Specialized
        prices[0][4] = 50;
        prices[1][4] = 70;
        prices[2][4] = 120;

        //Surly
        prices[0][5] = 45;
        prices[1][5] = 60;
        prices[2][5] = 105;

        //Giant
        prices[0][6] = 40;
        prices[1][6] = 60;
        prices[2][6] = 105;

        //Bianchi
        prices[0][7] = 65;
        prices[1][7] = 85;
        prices[2][7] = 135;

        //Soma
        prices[0][8] = 65;
        prices[1][8] = 80;
        prices[2][8] = 135;

        //Cervelo
        prices[0][9] = 60;
        prices[1][9] = 75;
        prices[2][9] = 120;
    }

    static {
        levelsInt.put("silver",0);
        levelsInt.put("gold",1);
        levelsInt.put("platinum",2);

        brandsInt.put("trek",0);
        brandsInt.put("cannondale",1);
        brandsInt.put("salsa",2);
        brandsInt.put("jamis",3);
        brandsInt.put("specialized",4);
        brandsInt.put("surly",5);
        brandsInt.put("giant",6);
        brandsInt.put("bianchi",7);
        brandsInt.put("soma",8);
        brandsInt.put("cervelo",9);
    }

    /*public static void addrp(String brand, String level, int price, int days) {
        if (brandsInt.containsKey(brand)) {
            int brandInt = brandsInt.get(brand);
            int levelInt = levelsInt.get(level);
            prices[levelInt][brandInt] = price;
        }
    }*/

    public static int getRepairPrice(String brand, String level) {
        System.out.println(brandsInt.get(brand));
        System.out.println(levelsInt.get(level));
        System.out.println(prices[1][7]);
        return prices[brandsInt.get(brand)][levelsInt.get(level)];
    }

    public static LocalDate getPromiseDate(String level) {
        return LocalDate.now().plusDays(days.get(level));
    }

}

