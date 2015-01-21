package pl.stringAPI;

public class StringExercises {
	/**
	 * introduction how to operate on Strings Remember all the operations on
	 * String creates a new String!!! In that case remember that "Strings" in
	 * Java are immutable!!! Immutable, because If you reassign the variable to
	 * the existing variable, it means that you create a newly String
	 * 
	 */
	public static void main(String[] args) {

		// String concatenation - very uneffective, not recomended to use often
		System.out.println("<--Concatenation-->");
		String name = "Peter";
		name += "son";
		System.out.println(name);

		// String API
		System.out.println("<--String API-->");
		String name2 = "Peter";
		// using API, we must have remember about assign (reasign) an newly
		// created string
		// to some variable (in this case to the same variable named "name2"
		// we must "have" a hadle to this variable(object) - otherwise all data
		// are gone,
		// they "flight to the sky"

		name2 = name2.concat("son");
		System.out.println(name2);

		// StringBuilder && StringBuffer

		System.out.println("<--String builders and buffers-->");

		String name3 = "Peter";

		// Ready built in library in Java, which is more effective to operate on
		// Strings
		// We passed an parameter to constructor
		StringBuffer stb = new StringBuffer(name3);
		// we add another string to the existing name3="Peter" and create a new
		// String ="Peterson"
		stb.append("son");
		// StringBuilder or StringBuffer are type of Object, so we must call on
		// those object method toString - to return a string representation of
		// object
		name3 = stb.toString();
		System.out.println(name3);

		// Exercises
		System.out.println("<--ExerciseS-->");

		final String input = "InfoGeolog at Lodz University";
		// remember that in Java indexes are 0 numerated! so first element has 0
		// index!
		// EX1
		char charElement = input.charAt(0);
		System.out.println(charElement);

		// EX2
		String upperCasedIput = input.toUpperCase();
		System.out.println(upperCasedIput);

		// EX3
		// remember we are operating on chars - single quotes
		String replacedInput = input.replace('o', 'a');
		System.out.println(replacedInput);

		// EX3 - second manner
		// we are using ready build API in String class, now we are operating on
		// Strings (double quotes)
		// we have to assign the result to the variable
		String replacedInput2 = input.replaceAll("o", "a");
		System.out.println(replacedInput2);

		// EX4 - manner 1

		int i = 0;
		// variable input is marked final - so we cannot "modify" and reassign
		// any new value to this variable
		System.out.println("<--loop do while->");

		// Remember that loop do - while will allways execute at least once!
		// Because after fist loop iteration the stop condition is checked.
		String result = input;
		do {
			result = result.concat("T");
			i++;
		} while (i < 3);

		System.out.println(result);

		// EX4 - manner 2
		String result2 = input;
		System.out.println("<--loop while do-->");
		int x = 0;
		while (x < 3) {
			result2 = result2.concat("T");

			// remember about break condition in loop otherwise it will be never
			// ending loop, and Java will "explode" - stackoverflow exception
			x++;
		}
		System.out.println(result2);

		// EX5
		System.out.println("<--Reverse String-->");
		final String given = "ABCD";

		StringBuilder stb1 = new StringBuilder();
		stb1.append(given);
		// reverse the String sequence
		stb1.reverse();
		String reversedString = stb1.toString();
		System.out.println(reversedString);

	}
}
