package P_01;
import java.util.Scanner;
public class IDADE_ELEITORAL {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int idade=0;
		
		System.out.println("Entre com sua idade:");
		idade = ler.nextInt();
		
		if (idade>=18 && idade<=65) 
		{
		System.out.println("VOTO OBRIGATÓRIO!");
		}
		else if (idade>=16 && idade<=17 || idade>65)
		{
		System.out.println("VOTO FACULTATIVO!");
		}
		else
		System.out.println("NÃO PODE VOTAR!");

	}

}
