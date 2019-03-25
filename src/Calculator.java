import java.util.Scanner;

public class Calculator{
  /*
	Класс для обработки аргументов.
  */
  private double result;
  
  InputArguments inpt = null;

  public Calculator(){inpt = new InputArguments();}

  private void calculate(double arg1, double arg2, char c){
	
	if(c == '+'){this.result = arg1 + arg2;}
	if(c == '-'){this.result = arg1 - arg2;}
	if(c == '*'){this.result = arg1 * arg2;}
	if(c == '/')
	{
	 if(arg1 == 0 || arg2 == 0){throw new ArithmeticException("Attempt to divide by zero");}
	 
	 else{this.result = arg1 / arg2;}
	}
  }

  private double get_result(){return this.result;}	

  private void clean_result(){this.result = 0;}

  public void programm()
  {
	inpt.input_args();
	
	double first = inpt.get_value();
	
	inpt.input_args();
	
	double second = inpt.get_value();
	
	char symbol = inpt.get_operation();
	
	calculate(first,second,symbol);

	System.out.println(first + " " + symbol + " " + second + " = " + get_result());
	
	clean_result();
  }

}
