import java.util.Scanner;
/*
Класс для обработки введеных данных.
*/
public class InputArguments{
	
Scanner reader = null;
	
public InputArguments(){reader = new Scanner(System.in);}
	
private double value = 0;

private char symbol = ' ';	
	
public void input_args(){value = reader.nextDouble();}

public char get_operation(){return this.symbol = reader.next().charAt(0);}	

public double get_value(){return this.value;}
}
