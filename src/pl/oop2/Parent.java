package pl.oop2;

public class Parent {
	
	
	public String description(String name, String type) {
		return "I am " + this.getClass().getName() + " my name is " + name
				+ " and my type is " + type;
	}

	public void sayHello() {
		System.out.println("Hi all from Parent class");
	}
}
