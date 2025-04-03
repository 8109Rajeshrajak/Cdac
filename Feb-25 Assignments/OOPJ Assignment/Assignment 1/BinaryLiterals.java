//Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.

class BinaryLiterals{
	public static void main(String args []){
	
	
	byte a = 0b1011100; //(binary to decimal)
	System.out.println(a);
	
	int b = 010; // (octal to decimal)
	System.out.println(b);
	
	
	int c = 0x10; //(octal to decimal)
	System.out.println(c);
	
	float f = 56.77f;
	System.out.println(f);
	
	}


}

/*C:\Users\rajesh rajak\OneDrive\Desktop\Cdac class\Assignments\OOPJ\Assignment 1>java BinaryLiterals
92
8
16
56.77

*/