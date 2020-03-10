package com.IdoShoshani;

import java.util.*;
import java.time.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Payment {
    public int customerNumber;
    public int amount;
    public LocalDate paymentDate;

    public Payment(int customerNumber, int amount, LocalDate paymentDate){
        this.customerNumber = customerNumber;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }
}

