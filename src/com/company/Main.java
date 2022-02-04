package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int a=5;
    int b=10;
        System.out.println("Value of a is "+a +" and value of b is "+b +"." );
        a+=b;
        System.out.println("Value of a after addition b is  "+a+".");
        a-=b;
        System.out.println("Value of a after subtraction b is  "+a+".");
        a*=b;
        System.out.println("Value of a after multiplication with b is  "+a+".");
        a/=b;
        System.out.println("Value of a after division with  b is  "+a+".");
        a%=b;
        System.out.println("Value of a after using modulo is "+a+".");
        String first="one";
        String second= "two";
        String third= first+ " "+second;
        int value=third.length();
        System.out.println("Value of string before  addition is "+value +".");
        value+=5;
        if (a<=b){
            System.out.println("first is bigger.");}
        else {
            System.out.println("second is bigger." );};




    }
}