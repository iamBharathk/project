package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a =scanner.nextInt();
        System.out.println("Enter second number ");
        int b=scanner.nextInt();
        int largest=a>b?a:b;
        System.out.println("The larget number is "+largest);

        }
    }