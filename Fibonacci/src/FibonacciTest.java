
public class FibonacciTest {

	public static int SerieFibonacci(int posicion){
		
		int num1 = 0;
		int num2 = 1;
		
		for (int i = 0; i < posicion; i++)
		{
		    int temp = num1;
		    num1 = num2;
		    num2 = temp + num2;
		}
		return num1;
		
	}
}
