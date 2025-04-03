//11. Write a program to check if a number is positive and even using logical operators (&&, ||, !).

import java.util.Scanner;

class Logical_Operators{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if the number is positive and even using logical operators
        if (num > 0 && num % 2 == 0) {
            System.out.println(num + " is positive and even.");
        } else if (num > 0 && num % 2 != 0) {
            System.out.println(num + " is positive but odd.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        scanner.close();
    }
}

