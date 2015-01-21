package pl.oop2.interfaces;

public class CalculatorImpl implements ICalculator {

	public static void main(String[] args) {
		CalculatorImpl calc = new CalculatorImpl();

		int addResult = calc.addTwoInts(5, 4);
		System.out.println(addResult);

		int reduceResult = calc.reduceTwoInts(50, 30);
		System.out.println(reduceResult);

		int multiPlyRes = calc.multiPly(4, 3);
		System.out.println(multiPlyRes);

		int divRes = calc.divide(20, 4);
		System.out.println(divRes);
	}

	@Override
	public int addTwoInts(int a, int b) {
		return a + b;
	}

	@Override
	public int reduceTwoInts(int a, int b) {
		return a - b;
	}

	@Override
	public int multiPly(int a, int b) {
		return a * b;
	}

	@Override
	public int divide(int a, int b) {
		return a / b;
	}
}
