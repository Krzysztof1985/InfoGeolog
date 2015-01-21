package pl.oop2.interfaces;

public interface ICalculator {
	// in interfaces we declare only contract - the method signature and return
	// type (it could be void or String or Object like Person etc)
	// body of the method is not allowed*
	// * in Java 8 there is, but it's a special case

	public int addTwoInts(int a, int b);

	public int reduceTwoInts(int a, int b);

	public int multiPly(int a, int b);

	// let's assume that b cannot be grather than a
	public int divide(int a, int b);

}
