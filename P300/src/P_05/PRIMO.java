package P_05;
import java.util.Scanner;
public class PRIMO {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num = 0, cnt = 0;
	    
	    System.out.println("Digite um número para verificar se é primo: ");
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
	    	System.out.println("O número "+num+" é primo");
	    }
	    else 
	    {
	    	System.out.println("O número "+num+" não é primo");
	    }
	 }
}

