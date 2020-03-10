package com.IdoShoshani;

import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Customer {
    public String firstName;
    public String lastName;
    public int customerNumber;
    static int nextCustomerNumber = 0;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        customerNumber = nextCustomerNumber;
        nextCustomerNumber += 1;
    }
}


