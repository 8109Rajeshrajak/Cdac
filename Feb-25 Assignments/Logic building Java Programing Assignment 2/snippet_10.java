public class snippet_10{
	public void display() {
		System.out.println("No parameters");
	}


	public void display(int num) {
		System.out.println("With parameter: " + num);
	}


	public static void main(String[] args) {
		display();
		display(5);
	}
}

//Question:- What happens when you compile and run this code? Is method overloading allowed?


/*error: non-static method display() cannot be referenced from a static context
                display();
                ^
Snippet_10.java:14: error: non-static method display(int) cannot be referenced from a static context
                display(5);
                ^
2 errors*/

//ans:- Yes, method overloading is allowed in Java. Method overloading enables a class to have multiple methods with the same name but with different parameter lists.
