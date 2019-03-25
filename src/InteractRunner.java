import java.util.Scanner;
/*
	Класс для запуска калькулятора и ввода аргументов.
*/
public class InteractRunner{
  public static void main(String[]args){
   Calculator calc = new Calculator();
    Scanner in = new Scanner(System.in);
     String exit = "No";
	while(!exit.equals("Yes"))
	{
		try
		{
			calc.programm();
			System.out.println("Exit: Yes/No");
			exit = in.next();
				
		}
		catch(ArithmeticException e)
		{
			System.err.println("Attempt to divide by zero");		
		}			
	}
 }
}
