package Electricity;

import java.io.*;

public class ElectricityBill {

    String name;
    int units;
    String type;
    double bill;

    ElectricityBill(String name, int units, String type) {
        this.name = name;
        this.units = units;
        this.type = type;
    }

    void calculateBill() {
        if (type.equalsIgnoreCase("household")) {
            if(units<100){
                bill = units * 4;}
            else if(units>=100 && units <= 200)
                bill = units*7;
            else{
                bill = units*9;
            }
        } else if (type.equalsIgnoreCase("commercial")) {
            if(units<100){
                bill = units * 7.5;}
            else if(units>=100 && units <= 500)
                bill = units*9;
            else{
                bill = units*11.5;
            }
        } else {
            bill = 0;
        }
    }

    void displayBill() {
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Consumer Name : " + name);
        System.out.println("Connection Type : " + type);
        System.out.println("Units Consumed : " + units);
        System.out.println("Bill Amount : Rs " + bill);
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter Consumer Name: ");
            String name = br.readLine();

            System.out.print("Enter Units Consumed: ");
            int units = Integer.parseInt(br.readLine());

            System.out.print("Enter Connection Type (Household/Commercial): ");
            String type = br.readLine();

            ElectricityBill eb = new ElectricityBill(name, units, type);
            eb.calculateBill();
            eb.displayBill();

        } catch (Exception e) {
            System.out.println("Invalid Input!");
        }
    }
}
