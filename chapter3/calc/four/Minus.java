package calc.four;

public class Minus implements CalculationIF{

	@Override
	public int answer(int a, int b) {
		int total=a-b;
		return total;
	}


}
