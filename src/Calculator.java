import java.util.Scanner;
/*
	Класс для обработки введеных данных.
	В методе calculate используется исключение ArithmeticException, которое сработет в случае
	деления на ноль.	
*/

public class Calculator{
 
private double result;
  
InputArguments inpt = null;

public Calculator(){inpt = new InputArguments();}

private void calculate(double arg1, double arg2, char c){
	
 if(c == '+'){this.result = arg1 + arg2;}
 if(c == '-'){this.result = arg1 - arg2;}
 if(c == '*'){this.result = arg1 * arg2;}
 if(c == '/')
 {
	if(arg1 == 0 || arg2 == 0)
	{throw new ArithmeticException();}
	else
	{this.result = arg1 / arg2;}
 }
}

private double get_result(){return this.result;}	

private void clean_result(){this.result = 0;}

public void programm()
{
	ConsoleInfo.message();

	inpt.input_args();
	
	double first = inpt.get_value();
	
	ConsoleInfo.show_arg(first);

	inpt.input_args();
	
	double second = inpt.get_value();

	ConsoleInfo.show_arg(second);
	
	char symbol = inpt.get_operation();

	ConsoleInfo.show_operation(symbol);
	
	calculate(first,second,symbol);
	
	ConsoleInfo.show_result(get_result());

	clean_result();
}

}
