package calc.four;

public class Javacalc {
	public static void main(String[]args) {

    CalculationIF sum= new Sum();
    CalculationIF minus=new Minus();
    CalculationIF round=new Round();
    CalculationIF product=new Product();

    System.out.println(sum.answer(5,5));
    System.out.println(minus.answer(5, 10));
    System.out.println(round.answer(15,3));
    System.out.println(product.answer(10, 3));
	}

}
