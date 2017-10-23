package Busquedas;
import java.util.Scanner;
public class Ordenar_numeros {

	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
		
		int n;//inc varibles
		System.out.println("Ingrese el total de numeros a ordenar:");
		n=leer.nextInt();
		
		int b[]=new int[n];

          for(int i=0;i<n;i++)
          {
        	  System.out.print("Ingrese el numero "+i+":");
        	  b[i]=leer.nextInt();
        	  
          }
          for(int i=0;i<n;i++)
          {
        	  System.out.println("los valores ingresados son:"+b[i]);
        	
          }
          for(int piv=0;piv<n;piv++)
          {
              for(int pun=piv+1;pun<n;pun++)
              {
            	 if (b[piv]>b[pun])
            	 {
            		 int replace = b[piv];
            		 b[piv]=b[pun];
            		 b[pun]=replace;
            	 }
            	  if(pun==b.length)
            	  {
            		  
            	  }
              }

        	
          }
          for(int i=0;i<n;i++){
        	  System.out.println("POS "+i+"VALOR="+b[i]+" |  ");
          }
        
          System.out.print("Numero a buscar");
          int buscar=0;
          buscar=leer.nextInt();
          int i=0, ban=0;
          while(i<b.length){
        	  System.out.println("i="+" "+i);
        	  if(buscar==b[i]){
        		  System.out.println("Numero Encontrado");
        		  ban=1;
        		  i=b.length;
        	  }
        	  else{
        		  if(b[i]>buscar){
        			  i=b.length;
        		  }
        	  }
        	  i++;
        		if(ban==0){
        			System.out.print("Registro no encontrado");
        	}
          }
     }
	
}
