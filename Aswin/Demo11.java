
public class Demo11 {

	public static void main(String[] args)
	{
		// take any number and print it in reverse order.
		// number = 123 --> 321
		// number = 6557 --> 7556
		// number = 7467121033  --> 3301217647
		// number = 70  --> 7
		
		long number = 7467121033l;
		long reverse = 0;
		
		while(number != 0)
		{
			long reminder = number % 10;
			number = number / 10;
			reverse = (reverse * 10) + reminder; 
		}
		
		System.out.println("Reverse Number = "+reverse);
	}

}
