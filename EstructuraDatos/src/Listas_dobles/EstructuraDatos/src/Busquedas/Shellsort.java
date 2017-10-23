package Busquedas;

public class Shellsort {

	public static void shell(Alumno []a){
		   int salto, i;//inicialiaczacion de variables
		Alumno aux;
		   boolean cambios;
		   for(salto=a.length/2; salto!=0; salto/=2){//ciclo de incicion
		           cambios=true;
		           while(cambios){ // Mientras se intercambie algún elemento
		                       cambios=false;
		                       for(i=salto; i< a.length; i++) // se da una pasada
		                               if(a[i-salto].compareTo(a[i])>0){ // y si están desordenados
		                                     aux=a[i]; // se reordenan
		                                     a[i]=a[i-salto];
		                                     a[i-salto]=aux;
		                                     cambios=true; // y se marca como cambio.
		                               }
		                        }
		            }
		}
}//fin de llave de la clasw
