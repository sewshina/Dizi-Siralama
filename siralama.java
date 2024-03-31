package odev;
import java.util.Random;
public class siralama {

	public static void main(String[] args) {
		 
		        
		int[] dizi = new int[10];
		
		 randomYap(dizi);
		 
		 System.out.println("Dizinin Elemanları: "); 
		 diziYaz(dizi);
	 
		
		 System.out.println("\nDizinin Elemanlarının Küçükten Büyüğe Sıralanmış Hali: ");  
		  diziSirala(dizi);
		  diziYaz(dizi); 

	}			 
		 
	public static void randomYap(int[] dizi1) {
	Random random = new Random();            
	 for (int i = 0; i < dizi1.length; i++){           
	  {
	    dizi1[i] = random.nextInt(100); 
	  }               
	  }
	  }
	
   public static void diziYaz(int[] dizi2) {
   for (int i = 0; i < dizi2.length; i++) {
	  {
	    System.out.println(dizi2[i] );
	  }
	  }
	  }
		 
  static void diziSirala(int[] dizi3){
	int n = dizi3.length;  
	int temp = 0;  	  
	for(int i=0; i < n; i++){	
	for(int j=1; j < (n-i); j++){	
	if(dizi3[j-1] > dizi3[j]){	
	temp = dizi3[j-1];  
	dizi3[j-1] = dizi3[j];  
	dizi3[j] = temp;  		
	}  
    }  
    }  
    } 	
			
}
