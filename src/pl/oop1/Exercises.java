package pl.oop1;

public class Exercises {

	public static void main(String[] args) {

		// EX1
		// new instance of the object Phone,with default constructor
		Phone p1 = new Phone();
		// we have to set whole members in the class by using set methods
		p1.setMake("Sony");
		p1.setType("Z1");
		p1.setScreenDiagonal(5.0D);

		System.out.println(p1.toString());

		// EX2
		// we pass whole necessary info about object in the constructor, not via
		// methods set
		Phone p2 = new Phone("Samsung", "Galaxy 5", 5.2D);
		System.out.println(p2.toString());

		/**
		 * Remember that Java will create default constructor if you don't do
		 * this, but If you create a default constructor, and you will try to
		 * pass there some parameters compiler will be display an error, because
		 * cannot find a correct constructor. Solution? - try to write
		 * constructor with parameters -remember that from constructor with
		 * parameters you can execute default constructor
		 */

		Phone p3 = new Phone("Sony", "Z1", 5.0D);
		System.out.println(p3.toString());
		/**
		 * check phone equality remember about correct override equals and
		 * hashCode what fileds in class would you comapre it depends on you If
		 * you deciede to compare only name + diagonal, the objects with
		 * parameters like: Sony, Z1, 2.0D and Sony, Compact,2.0D will be equals
		 * becasue you comapre only name + diagonal and in those two cases
		 * Sony.equals(Sony) && 2.0.equals(2.0) --> true so both objects are
		 * "equals"
		 */
		System.out.println("Sony's phonte equality " + p1.equals(p3));
		System.out.println("Sony and Samsung equality" + p1.equals(p2));

		/**
		 * Remember the rule
		 * 
		 * x.equals(y) and x.equals(z) --> y.equals(z); example x=2; y=2; z=2
		 * x.equals(y) --> true x.equals(z) --> true y.equals(z) --> true
		 * 
		 */
	}

}
