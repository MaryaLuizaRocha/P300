package P_08;
public class TRIANGULO {

	public static void main(String[] args) {
		int ladoA=6, ladoB=6, ladoC=6, x, area;	    
	    
	    x = (ladoA + ladoB + ladoC)/2;
	    area = x * (x-ladoA)*(x-ladoB)*(x-ladoC);
	    
	    if (area > 0) 
	    	System.out.println("� um tri�ngulo!");
	    else
	        System.out.println("N�o � tri�ngulo!");
	}
}
