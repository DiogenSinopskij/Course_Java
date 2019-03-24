/*
Класс для установки рандомного значения.
*/
public class RandomRunner{
	private int random_value;

	public void set_value()
	{
		random_value = 0 + (int)(Math.random() * 100);
	}

	public int get_value()
	{
		return this.random_value;		
	}

	public void clean_value()
	{
		random_value = 0;
	}
}
