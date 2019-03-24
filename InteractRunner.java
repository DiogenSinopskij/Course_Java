import java.util.Scanner;
/*
	Класс для запуска калькулятора и ввода аргументов.
*/
public class InteractRunner{
  public static void main(String[]args){
  	Scanner reader = new Scanner(System.in);
	Calculator calc = new Calculator();
	String str = "No";
  	while(!str.equals("Yes"))
	{           
	   System.out.println("Input arg 1: ");
	   double first = reader.nextInt();
	   System.out.println("Input arg 2: ");
	   double second = reader.nextInt();

	   System.out.println("Select operation +, -, *, /,");
	   char symbol = reader.next().charAt(0);

           calc.calculate(first,second,symbol);
	   System.out.println("Result: " + calc.get_result());
	   calc.clean_result();

	   System.out.println("Exit: Yes/No");
	   str = reader.next();	   	   
	}		
  }
}
