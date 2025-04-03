public class snippet_9{
	public static void main(String[] args) {
		int class = 10;
		System.out.println(class);
		}
	}

/*error: not a statement
                int class = 10;
                ^
Snippet_9.java:3: error: ';' expected
                int class = 10;
                   ^
Snippet_9.java:3: error: <identifier> expected
                int class = 10;
                         ^
Snippet_9.java:4: error: <identifier> expected
                System.out.println(class);
                                  ^
Snippet_9.java:4: error: illegal start of type
                System.out.println(class);
                                   ^
Snippet_9.java:4: error: <identifier> expected
                System.out.println(class);
                                        ^
Snippet_9.java:6: error: reached end of file while parsing
        }
         ^
7 errors*/

/*ans:- Reserved keywords in programming languages cannot be used as identifiers because they have a predefined meaning within the language, which is necessary for the compiler to understand the code's structure and functionality; using them as variable names would create confusion and prevent the compiler from interpreting the code correctly. */


