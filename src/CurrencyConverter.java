
import java.sql.SQLOutput;
import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {


    public static void main(String[]args){

        double amount, dollar, pound, code, euro, yen, zar, rupee;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Hi, This is a Currency Converter");
        System.out.println("Which currency would you like to Convert ?");

        System.out.println("1: ZAR \t2: Dollar \t3: Pound \t4: Euro \t5: Yen");
        code = sc.nextInt();

        System.out.println("How much money would you like to convert ? ");
        amount = sc.nextFloat();

        // For amounts conversion
        if(code==1){

            dollar = amount / 16.68;
            System.out.println("This amount =  " + amount + "  in South African zar is equivalent to =  " + f.format(dollar) + " $ ");

            pound = amount / 20.55;
            System.out.println("This amount =  " + amount + "  in South African zar is equivalent to =  " + f.format(pound) + " £ ");

            euro = amount / 18.18;
            System.out.println("This amount =  " + amount + "  in South African zar is equivalent to =  " + f.format(euro) + " € ");

            yen = amount / 0.130;
            System.out.println("This amount =  " + amount + "  in South African zar is equivalent to =  " + f.format(yen) + " ¥ ");

            rupee = amount / 0.21;
            System.out.println("This amount =  " + amount + "  in South African zar is equivalent to =  " + f.format(rupee) + " ₹ ");

        } else if (code==2) {
            // For  Dollar conversion

            zar = amount / 0.060;
            System.out.println("This amount =  " + amount + "  in US Dollar is equivalent to =  " + f.format(zar) + " Zar");

            pound = amount / 1.23;
            System.out.println("This amount =  " + amount + "  in US Dollar is equivalent to =  " + f.format(pound) + " £");

            euro = amount / 1.09;
            System.out.println("This amount =  " + amount + "  in US Dollar is equivalent to =  " + f.format(euro) + " €");

            yen = amount / 0.0078;
            System.out.println("This amount =  " + amount + "  in US Dollar is equivalent to =  " + f.format(yen) + " ¥");

            rupee = amount / 0.012;
            System.out.println("Your" + amount + "  in US Dollar is equivalent to =  " + f.format(rupee) + " ₹");

        }else if (code==3) {
            // For Pound conversion

            zar = amount / 0.049;
            System.out.println("This amount =  " + amount + "  in Great British Pound is equivalent to =  " + f.format(zar) + " Zar");

            dollar = amount / 0.81;
            System.out.println("This amount =  " + amount + "  in Great British Pound is equivalent to =  " + f.format(dollar) + " $");

            euro = amount / 0.89;
            System.out.println("This amount =  " + amount + "  in Great British Pound is equivalent to =  " + f.format(euro) + " €");

            yen = amount / 0.0064;
            System.out.println("This amount =  " + amount + "  in Great British Pound is equivalent to =  " + f.format(yen) + " ¥");

            rupee = amount / 0.01;
            System.out.println("This amount =  " + amount + "  in Great British Pound is equivalent to =  " + f.format(rupee) + " ₹");


        }else if (code==4) {
            // For  Euro conversion

            zar = amount / 0.55;
            System.out.println("This amount =  " + amount + "  in Euro is equivalent to =  " + f.format(zar) + " Zar");

            pound = amount / 1.13;
            System.out.println("This amount =  " + amount + "  in Euro is equivalent to =  " + f.format(pound) + " £");

            dollar = amount / 0.92;
            System.out.println("This amount =  " + amount + "  in Euro is equivalent to =  " + f.format(dollar) + " $");

            yen = amount / 0.0072;
            System.out.println("This amount =  " + amount + "  in Euro is equivalent to =  " + f.format(yen) + " ¥");

            rupee = amount / 0.011;
            System.out.println("This amount =  " + amount + "  in Euro is equivalent to =  " + f.format(rupee) + " ₹");


        }else if (code==5) {
            // For  Yen conversion

            zar = amount / 8;
            System.out.println("This amount =  " + amount + "  in Japanese Yen is equivalent to =  " + f.format(zar) + " Zar");

            pound = amount / 157;
            System.out.println("This amount =  " + amount + "  in Japanese Yen is equivalent to =  " + f.format(pound) + " £");

            euro = amount / 139;
            System.out.println("This amount =  " + amount + "  in Japanese Yen is equivalent to =  " + f.format(euro) + " €");

            dollar = amount / 127;
            System.out.println("This amount =  " + amount + "  in Japanese Yen is equivalent to =  " + f.format(dollar) + " $");

            rupee = amount / 2;
            System.out.println("This amount =  " + amount + "  in Japanese Yen is equivalent to =  " + f.format(rupee) + " ₹");


        }else if (code==6) {
            // For Rupee conversion

            zar = amount / 4.86;
            System.out.println("This amount =  " + amount + "  in Indian Rupee is equivalent to =  " + f.format(zar) + " Zar");

            pound = amount / 99.74;
            System.out.println("This amount =  " + amount + "  in Indian Rupee is equivalent to =  " + f.format(pound) + " £");

            euro = amount / 88.31;
            System.out.println("This amount =  " + amount + "  in Indian Rupee is equivalent to =  " + f.format(euro) + " €");

            yen = amount / 0.64;
            System.out.println("This amount =  " + amount + "  in Indian Rupee is equivalent to =  " + f.format(yen) + " ¥");

            dollar = amount/ 81.30;
            System.out.println("This amount =  " + amount + "  in Indian Rupee is equivalent to =  " + f.format(dollar) + " $");


        } else {

            System.out.println("Invalid Input, please try again!");
        }

        System.out.println("\nThank you for using this Forex currency converter");
    }
}
