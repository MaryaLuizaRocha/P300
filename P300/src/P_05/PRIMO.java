package P_05;
import java.util.Scanner;
public class PRIMO {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num = 0, cnt = 0;
	    
	    System.out.println("Digite um n�mero para verificar se � primo: ");
	    num = ler.nextInt();
	    
	    for(int i = 1; i <= num; i++)
	    {
	    	if(num % i == 0)
	    	{
	    		cnt++;
	    	}
	    }
	    if(cnt == 2)
	    {
	    	System.out.println("O n�mero "+num+" � primo");
	    }
	    else 
	    {
	    	System.out.println("O n�mero "+num+" n�o � primo");
	    }
	 }
}

