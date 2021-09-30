package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        final int constantName = 24; //constant//
        Scanner input = new Scanner (System.in);
        System.out.println("choose a number to find out if odd or even ?");
        int usernumber = input.nextInt();
        if (usernumber%2==0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        System.out.println("choose two numbers , number one?");
        int firstnumber = input.nextInt();
        System.out.println("number two?");
        int numbertwo = input.nextInt();
        int divided= firstnumber/numbertwo ;
        int remain = firstnumber%numbertwo;
        System.out.println("number one divided by number two is "+ divided + " remainder is " + remain);
    }
}
