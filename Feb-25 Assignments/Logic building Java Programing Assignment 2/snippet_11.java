public class Snippet_11{
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(arr[5]);
	}
}



//question :- What runtime exception do you encounter? Why does it occur?


/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Snippet_11.main(Snippet_11.java:4)*/

//Answer:- because in arrey system counts starts from 0,1,2,3,4...
//and in printing command area it written 5, in arry we have only 3 spaces thats why it gives //error