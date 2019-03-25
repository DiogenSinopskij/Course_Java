abstract class ConsoleInfo{
	
	public static void message()
	{
		System.out.println("Input arg:");
	}

	public static void show_arg(double value)
	{
		System.out.println("Argument: " + value);	
	}
	
	public static void show_operation(char symbol)
	{
		System.out.println("Operation: " + symbol);	
	}	
	
	public static void show_result(double result)
	{
		System.out.println("Result: " + result);
	}
}
