public class snippet_13{
		public static void main(String[] args) {
			String str = null;
			System.out.println(str.length());
		}
}

/*Eror:- 

Exception in thread "main" java.lang.NullPointerException
        at snippet_13.main(Snippet_13.java:4)


*/
//answer:- The variable str is assigned the value null. This means it does not reference any //object in memory