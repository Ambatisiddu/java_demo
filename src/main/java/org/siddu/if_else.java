package org.siddu;

import java.util.Scanner;

public class if_else {
    public static void main(String args[]){
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int x = sc. nextInt();
        if (x >= 18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
