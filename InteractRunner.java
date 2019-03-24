import java.util.Scanner;
/*
	Класс для запуска калькулятора и ввода аргументов.
*/
public class InteractRunner{
  public static void main(String[]args){
  	Scanner reader = new Scanner(System.in);
	Calculator calc = new Calculator();
	RandomRunner rand = new RandomRunner();
	RandomRunner rand2 = new RandomRunner();
	String str = "No";
	String str2 = "Yes";
	double first = 0;
	double second = 0;
  	while(!str.equals("Yes"))
	{
	   System.out.println("Input args: Yes/No");
	   str2 = reader.next();
	   if(!str2.equals("No"))
	   {           
		   System.out.println("Input arg 1: ");
		   first = reader.nextInt();
		   System.out.println("Input arg 2: ");
		   second = reader.nextInt();

		   System.out.println("Select operation +, -, *, /,");
		   char symbol = reader.next().charAt(0);

		   calc.calculate(first,second,symbol);
		   System.out.println("Result: " + calc.get_result());
		   calc.clean_result();
	   }

	   else
	   {
	  	   rand.set_value();
		   rand2.set_value();
	   	   first = rand.get_value();
		   second = rand2.get_value();
		   System.out.println(first + "/"+second);
		   System.out.println("Select operation +, -, *, /,");
		   char symbol = reader.next().charAt(0);
		   calc.calculate(first,second,symbol);
		   rand.clean_value();
		   rand2.clean_value();
		   System.out.println("Result: " + calc.get_result());
		   calc.clean_result();
  	   }

	   System.out.println("Exit: Yes/No");
	   str = reader.next();	   	   
	}		
  }
}
