package com.IdoShoshani;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.*;

public class UI {
    protected String[] line;
    protected String command;

    protected Customer[] customers;
    protected RepairOrder[] orders;
    protected Payment[] payments;


    public UI() {
        this.command = "START";
    }

    public void help() {

    }

    public void addrp(String brand, String level, int price, int days) {
        //RepairPrice.addrp(brand,level,price,days);
    }

    public void addc(String firstName, String lastName) {

    }

    public void addO(int customerNumber, LocalDate date, String brand, String level, String comment) {

    }

    public void addp(int customerNumber, LocalDate date, int amount) {

    }

    public void comp(int orderNumber, LocalDate completionDate) {

    }

    public void printrp() {

    }

    public void printcnum() {

    }

    public void printcname() {

    }

    public void printo() {

    }

    public void printp() {

    }

    public void printt() {

    }

    public void printr() {

    }

    public void prints() {

    }



    public void run() throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\n\n\n\nWelcome to Wheels Within Wheels User Interface!");
        System.out.println("Type 'help' to get started\n");

        while(!command.equals("quit")) {
            System.out.print("Command... ");
            command = console.readLine();
            line = Support.splitStringIntoParts(command);

            if (!command.equals("quit")) {
                switch (line[0]) {

                }
            }
        }


    }

}

