package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String state=" ";
        double amount;
        double total, tax=1.055;

        System.out.print("What is the order amount? ");
        amount=sc.nextDouble();
        sc.nextLine();
        System.out.print("What is the state? ");
        state=sc.nextLine();

        total=amount;

        if(state.equals("WI")) {
            total = amount * tax;
            System.out.printf("The subtotal is $%.2f.\n", amount);
            System.out.printf("The tax is $%.2f.\n", ((amount*tax)-amount));
        }
        System.out.printf("The total is $%.2f.\n", total);


    }
}
