package pl.oop2;

public class Start {

	public static void main(String[] args) {
		Child child = new Child();
		// even in class Child there is no method sayHello, child instance got
		// an access to all public methods from his superclass(Parent)

		child.sayHello();

		Child2 child2 = new Child2();
		// description is not type of void, so it's return a value, in that case
		// we have two ways:
		// 1 - assign result to the vaild value (Strint type in this example)
		// 2 - print the result to the console
		 
		//method description it will be called from Parent class (look on word "super" in Child2 class)
		String output = child2.description("Jaguar", "S-Type");
		System.out.println(output);
	}

}
