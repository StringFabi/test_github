package exceptions;

public class TestCorrection {
	
	private static double divide(double x, double y) {
		if(y==0) {
			throw new ArithmeticException("Darf nicht durch 0 dividieren");
		}
		return x/y;
	}

	public static void main(String[] args) {
		try {
			double ergebnis = divide(2,0);
			System.out.println("Ergebnis : " + ergebnis);
		} catch (ArithmeticException e){
			System.out.println("Darf nicht durch 0 Dividieren");
		}
	}

}
