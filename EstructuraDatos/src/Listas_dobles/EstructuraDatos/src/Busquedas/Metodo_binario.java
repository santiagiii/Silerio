package Busquedas;

import java.util.Scanner;

public class Metodo_binario 
{

	public static void main(String[] args)
	{
		
	Scanner leer=new Scanner(System.in);
		
		int n;//inc variables
		System.out.println("Ingrese el total de numeros a ordenar:");
		n=leer.nextInt();//captura de datos
		  int numero=n-1;
		int b[]=new int[n];//ar

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
          int inicio=b[0];
          int fina=b[numero];
   int pos = 0;
          while (inicio <= fina)
          {
              pos = (inicio+fina) / 2;
              if ( pos == buscar ){
                  System.out.print("el numero se a encontrado ");
               inicio=fina+1;
             
               }
              else if ( b[pos] < buscar ) {
                  inicio = pos+1;
              }
              else {
                  fina = pos;
              }
             
          }
	}

}
