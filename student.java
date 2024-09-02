/*package com.pratiksha;*/
import java.util.Scanner;
public class student {
    public static void main(String[] args){
        System.out.println("Tax Calculator App");
        System.out.println("------WELCOME------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total person count:");
        int n = scanner.nextInt();
        String[] name = new String[n];
        Long[] income = new Long[n];
        for(int i=0 ; i<n ; i++){
            System.out.println("Enter name " + (i+1) +" :");
            name[i] = scanner.next();
            System.out.println("Enter " + name[i] + "'s annual income:");
            income[i] = scanner.nextLong();
        }
        scanner.close();
        System.out.println("Names with liable taxes");
        System.out.println("------------------------");
        for(int i=0 ;i<n;i++){
            calculateTax( name[i] , income[i]);
        }
    }

    public static void calculateTax(String name , Long income){
        Long tax;
        if(income >= 300000){
            tax = income*20/100;
        }else if(income >= 100000){
            tax =income*10/100;
        }else{
            tax=0l;
        }
        System.out.println(name + " : " + " \u20B9 " + tax);
    }

}
