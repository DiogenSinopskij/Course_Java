/*
Калькулятор со статическими аргументами.
*/
public class ArgRunner{
  	public static void main(String[] args){
		System.out.println("Calculate...");
		int first = 2;
		int second = 3;
		Calculator calc = new Calculator();

		calc.calculate(first,second,'+');
		System.out.println(first + " + " + second + " = " + calc.get_result());
		calc.clean_result();
		
		calc.calculate(first,second,'-');
		System.out.println(first + " - " + second + " = " + calc.get_result());
		calc.clean_result();

		calc.calculate(first,second,'*');
		System.out.println(first + " * " + second + " = " + calc.get_result());
		calc.clean_result();		

		calc.calculate(first,second,'/');
		System.out.println(first + " / " + second + " = " + calc.get_result());
		calc.clean_result();
	}
}
