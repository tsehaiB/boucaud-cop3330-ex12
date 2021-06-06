/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package base;
import java.util.Scanner;
public class App {
    Scanner inp = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        int p = myApp.readP();
        double r = myApp.readR();
        int t = myApp.readT();
        System.out.println("After " + t + " years at " + r + "%, the investment will be worth " + myApp.calcA(p, r, t) + ".");
    }
    private int readP(){
        System.out.print("Enter the principal: ");
        return inp.nextInt();
    }
    private double readR(){
        System.out.print("Enter the rate of interest: ");
        return inp.nextDouble();
    }
    private int readT(){
        System.out.print("Enter the number of years: ");
        return inp.nextInt();
    }
    private double calcA(int p, double r, int t){
        r = r/100.0;
        double a = p*(1 + r*t);
        if(((a * 100) % 1) > 0.5)
            return a + 0.01;
        else
            return a;

    }
}
