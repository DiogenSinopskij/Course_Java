public class Calculator{
  
  private int result;

  public void add(int arg1, int arg2)
  { this.result = arg1 + arg2;}

  public int get_result()
  {return this.result;}	

  public void clear_result()
  {this.result = 0;}
}
