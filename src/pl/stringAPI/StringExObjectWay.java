package pl.stringAPI;

public class StringExObjectWay {

	public static void main(String[] args) throws Exception {

		StringExObjectWay exercise = new StringExObjectWay();

		final String name = "Peter";
		final String suffix = "son";

		String concatenationWay = exercise.concatenationString(name, suffix);
		System.out.println(concatenationWay);

		String stringApiResult = exercise.stringAPIContact(name, suffix);
		System.out.println(stringApiResult);

		String stringBuilded = exercise.stringBuilders(name, suffix);
		System.out.println(stringBuilded);

		/**
		 * Exercises in more object way solution
		 */
		// this in in our Exercises all the time an input, so I marked it
		// "final"
		final String input = "InfoGeolog at Lodz University";
		char ex1solution = exercise.charElement(input, 4);
		System.out.println(ex1solution);

		String ex2 = exercise.stringUpperCased(input);
		System.out.println(ex2);

		String ex3 = exercise.replaceChars(input, 'o', 'a');
		System.out.println(ex3);

		String ex4 = exercise.loopString(input, 3, "T");
		System.out.println(ex4);

		String ex5 = exercise.reverseString("ABCD");
		System.out.println(ex5);
	}

	public String concatenationString(String firstElement, String secondElement) {
		System.out.println("<--Concatenation-->");
		return firstElement + secondElement;
	}

	public String stringAPIContact(String firstElement, String secondElement) {
		System.out.println("<--String API-->");
		return firstElement.concat(secondElement);
	}

	public String stringBuilders(String firstElement, String secondElement) {
		System.out.println("<--StringBuilder & StringBuffer manner-->");
		StringBuffer stb = new StringBuffer();

		stb.append(firstElement);
		stb.append(secondElement);
		return stb.toString();
	}

	// EX1
	public char charElement(String paramToGetElement, int indexAt)
			throws Exception {
		// we must prevent that we got parameter "ABC" and we cannot get element
		// at index 3 (in 4th element) because we got an Exception-
		// IndexArrayOutOfBounds
		System.out.println("Exercise 1 result");
		if ((indexAt - 1) > paramToGetElement.length())
			throw new Exception("Not valid index");
		return paramToGetElement.charAt(indexAt);
	}

	// EX2
	public String stringUpperCased(String param) {
		System.out.println("Exercise 2 result");
		return param.toUpperCase();
	}

	// EX3
	public String replaceChars(String param, char whichToReplace,
			char onWichToBeReplaced) {
		System.out.println("Exercise 3 result");
		return param.replace(whichToReplace, onWichToBeReplaced);
	}

	// EX4 - we pass a string(param) which we will append many times, and suffix
	// which will be sticked at the end of the param
	public String loopString(String param, int howManyTimes, String suffix) {
		// String temp = param;

		System.out.println("Exercise 4 result");
		for (int i = 0; i < howManyTimes; i++) {
			param = param.concat(suffix);
		}
		return param;
	}

	// EX5
	public String reverseString(String param) {
		System.out.println("Exercise 5 result");
		StringBuffer stb = new StringBuffer(param);
		stb.reverse();
		return stb.toString();
	}
}
