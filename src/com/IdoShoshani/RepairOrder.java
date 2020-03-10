package com.IdoShoshani;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.*;

public class RepairOrder {
    static int nextOrderNumber = 0;
    public int orderNumber;
    public int customerNumber;
    public LocalDate orderDate;
    public String brand;
    public String level;
    public int repairPrice;
    public String comment;
    public LocalDate promiseDate;
    public LocalDate completionDate;


    public RepairOrder(int customerNumber, String brand, String level, String comment) {
        this.orderNumber = nextOrderNumber;
        nextOrderNumber += 1;
        this.customerNumber = customerNumber;
        this.orderDate = LocalDate.now();
        this.brand = brand;
        this.level = level;
        this.repairPrice = RepairPrice.getRepairPrice(brand,level);
        this.comment = comment;
        this.promiseDate = RepairPrice.getPromiseDate(level);
        this.completionDate = null;
    }
}

