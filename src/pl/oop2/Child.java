package pl.oop2;

public class Child extends Parent {
	
	@Override
	public String description(String name, String type) {
		return "I am " + this.getClass().getName() + " my name is "
				+ name.toUpperCase() + " and my type is " + type.toUpperCase();
	}
}
