//12. Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.

class Assignment_Operator{
	
	public static void main(String args []){
		
		int a = 10; // initiallization and declaration
		int b = 20;
		System.out.println("Value of a is = " +a);
		System.out.println("Value of b is = " +b);
		
		a += b;
		System.out.println("Value of a is after a += b; = " +a);
		
		
			a -= b;
			System.out.println("Value of a is after a -= b; = " +a);
			
			a *= b;
			System.out.println("Value of a is after a *= b; = " +a);
			
			a /= b;
			System.out.println("Value of a is after a /= b; = " +a);
			
		int a1 = 25;
		System.out.println("New Value of a1 is = " +a1);
			
			a1 %= b;
			System.out.println("Value of a is after a1 %= b; = " +a1);
		
		
	}
}