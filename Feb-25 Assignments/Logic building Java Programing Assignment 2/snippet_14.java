public class snippet_14{
	public static void main(String[] args) {
		double num = "Hello";
		System.out.println(num);
	}
}


/*  error: incompatible types: String cannot be converted to double
                double num = "Hello";
                             ^
1 error */

/* ans:- double is a primitive data type meant to store numeric values with decimal points. A String, on the other hand, is a reference type used to store a sequence of characters