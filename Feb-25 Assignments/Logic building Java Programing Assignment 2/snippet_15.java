public class snippet_15{
	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 5.5;
		int result = num1 + num2;
		System.out.println(result);
	}
}

/*

error: incompatible types: possible lossy conversion from double to int
                int result = num1 + num2;
                                  ^
1 error  */