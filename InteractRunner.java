import java.util.Scanner;
/*
	Класс для ввода пользователя.
*/
public class InteractRunner{
  public static void main(String[]args){
  	Scanner reader = new Scanner(System.in);
	Calculator calc = new Calculate();	
	while(true)
	{
	   System.out.println("Input arg 1: ");
	   int first = reader.nextInt();
	   System.out.println("Input arg 2: ");
	   int second = reader.nextInt();
	   calc.add(first,second);
	   System.out.println("Result: " + calc.get_result());
	   calc.clear_result();
	}
  }
}
