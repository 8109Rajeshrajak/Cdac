public class Snippet_5{
	public static void main(String[] args) {
		System.out.println("Main method with String[] args");
	}
		public static void main(int[] args) {
			System.out.println("Overloaded main method with int[] args");
	}
}


//Question :- Can you have multiple main methods? What do you observe?
//Ans :- yes we write multiple main method but while running the code it takes only first main //method.
//i have observed that it print only first main method .Main method with String[] args.