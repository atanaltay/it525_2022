package calculation;

public class CalculatorProgram {

	public static void main(String[] args) {
		
		Calcuator calc = new Calcuator();
		
		//Summation
		System.out.println("Summation");
		System.out.println(calc.makeCalculation(3, 4, (n1,n2)-> n1+n2));
		
		
		System.out.println("Multiplication");
		
		System.out.println(calc.makeCalculation(6, 23, (l1,l2)->l1*l2));
		
		System.out.println("Subtraction");
		Operation op1 = (num1,num2) -> num1-num2;
		System.out.println(calc.makeCalculation(6, 23,op1));
		
		
	}
	
	
	
}
