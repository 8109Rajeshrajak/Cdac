public class Snippet_7{
	public static void main(String[] args) {
		int x = "Hello";
		System.out.println(x);
	}
}


//error: incompatible types: String cannot be converted to int
  //              int x = "Hello";
                        ^
//1 error
//Why does Java enforce type safety?
//ans:- There is a large category of bugs that can be detected by enforcing type safety. Those //bugs are often very difficult to find and fix if there is no type safety mechanism (or if the //programmer turns off the type safety warnings/errors).