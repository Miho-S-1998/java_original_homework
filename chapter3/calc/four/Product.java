package calc.four;

public class Product implements CalculationIF{

	@Override
	public int answer(int a, int b) {
		int total=a*b;
		return total;
	}


}
