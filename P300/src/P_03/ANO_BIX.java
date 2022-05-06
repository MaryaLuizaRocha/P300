package P_03;
import java.util.Scanner;
public class ANO_BIX {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	    
	    System.out.printf("Informe um ano para verificar: ");
	    
	    int ano;
	    ano = ler.nextInt();
	    
	    if (ano % 4 == 0 || ano % 400 == 0 || ano % 100 == 0) 
		    {	        
	        System.out.println("O ano "+ ano +" é bissexto!");     
		    }
	    
	    else 
	    	{
	    	System.out.println("O ano "+ ano +" não é bissexto!");
	    	}
	}
}
