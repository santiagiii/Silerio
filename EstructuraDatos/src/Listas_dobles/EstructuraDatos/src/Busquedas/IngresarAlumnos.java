package Busquedas;

import java.util.Scanner;

public class IngresarAlumnos {
	
	public boolean ingresar(int n,Alumno[]a) {
		
		Scanner leer=new Scanner(System.in);
		
		
		for(int i=0;i<n;i++)
		{
			a[i]=new Alumno();
			System.out.print("Ingrese el numero de contro "+(i+1)+" ; ");
			a[i].setNumerocontrol(leer.nextLine());
			System.out.print("Ingrese el nombre del alumno "+(i+1)+" ; ");
			a[i].setNombre(leer.nextLine());
			System.out.print("Ingrese la direccion del alumno "+(i+1)+" ; ");
			a[i].setDireccion(leer.nextLine());
			
			
		}
		
		return false;
		
	}
	

}
