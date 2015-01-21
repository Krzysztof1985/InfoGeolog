package pl.oop1;

public class Start {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Kate");
		System.out.println(p.getName());
		// p.name = "ABC";
		// we cannot assign directly a value to variable name - because
		// the variable name is deklared private - so we must modify this
		// variable using methods like bellow
		p.setName("Andy");
		System.out.println(p.getName());
	}
}
