package Busquedas;
//import java.util.Scanner;

public class Burbuja {

	public static void  burbuja (Alumno[]a) {
		Alumno replace;		//inicio de variables
		for(int piv=0;piv<=a.length;piv++){//ciclo 
			for(int pun=piv+1;pun<a.length;pun++){//andc ciclo
				if(a[piv].compareTo(a[pun])>0){
					replace=a[piv];//guardar datos 
					a[piv]=a[pun];
					a[pun]=replace;
				}//fin if#1
				if(pun==a.length){
				}//fin if#2
			}
		}
	}//fin de el public

}
			