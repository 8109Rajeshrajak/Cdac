//Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results.

class Arithmatic_Operations{

		public static void main(String args []){
			
				int num1 = 30;
				int num2 = 20;
				
				int a = num1 + num2;
				int b = num1 - num2;
				int c = num1 * num2;
				int d = num1 / num2;
				int e = num1 % num2;
				
				
			System.out.println("Additon :" + a);
			System.out.println("Subtraction :" + b);
			System.out.println("Multiplication :" + c);
			System.out.println("Division :" + d);
			System.out.println("The result of :" + num1 + " % " + num2 + " = "  + e);
			}

}

/* C:\Users\rajesh rajak\OneDrive\Desktop\Cdac class\Assignments\OOPJ\Assignment 1>java Arithmatic_Operations
Additon :50
Subtraction :10
Multiplication :600
Division :1
The result of :30 % 20 = 10 */