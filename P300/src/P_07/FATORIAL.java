package P_07;
public class FATORIAL {

	public static void main(String[] args) {
		
		int fat = 1;
		int val = 3;

		for( int i = 2; i <= val; i++ )
			{
			fat *= i;
			}

		System.out.println(fat +"!");
	}	
}

