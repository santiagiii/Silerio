package Busquedas;

import java.util.Scanner;

public class Principal {
	
	Alumno[]a;//inicializacion de varibles
	private IngresarAlumnos ING= new IngresarAlumnos();
	private Busquedasecuencial BUS=new Busquedasecuencial();
	private static Quicksort2 qu=new Quicksort2();

	static int n;
	private static int opc;
	private String nc;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Principal p=new Principal();//llamando a la clase
		System.out.print("Número de elementos:");
		Scanner sc= new Scanner (System.in);
		p.n=sc.nextInt();
		
		p.a=new Alumno[Principal.n];
		
		p.ING.ingresar(Principal.n,p.a);
		
		Principal.opc=0;//opcion a evaluar en el menu
		
		while(Principal.opc!=8){//menu
		System.out.println("\n****Menu de opciones:****");
		System.out.println("1.- Busqueda secuecial");
		System.out.println("2.- Busqueda binaria");
		System.out.println("3.- Ordenamiento de la burbuja");
		System.out.println("4.- Ordenamiento Quicksort");
		System.out.println("5.- Ordenamiento Mergesort");
		System.out.println("6.- Ordenamiento Shellsort");
		System.out.println("7.- Imprimir Base de Datos");
		System.out.println("8.- Terminar");
		System.out.print("9.- Selecciona la opcion:");
		Principal.opc=sc.nextInt();
		//sc.next();
		
		switch(Principal.opc){//segun los casos
		case 1: 
			System.out.println("\\nIngresa el numero de control a buscar");
			p.nc=sc.next();
			if(p.BUS.buscar(p.nc, p.a)){
				System.out.println("\\nSe encontro el alumno");
			}
			else{
				System.out.println("Nose se encontro el alumno");
			}
			
			break; 
		case 2:
			String valor="";
			System.out.println("\\nIngresa el numero de control a buscar");
			valor=sc.next();
			if(Buaquedabinaria.buscar(p.a, valor)){
				System.out.println("\\nSe encontro el alumno");
			}
			else{
				System.out.println("Nose se encontro el alumno");
			}
			break;
		case 3: 
			System.out.println("***Arreglo de orden de Burbuja;***");
			Burbuja.burbuja(p.a);
			
			for(int i=0; i<Principal.n; i++){
				System.out.println(p.a[i]);
			}
			
			break;
		case 4:
			System.out.println("***Arreglo de orden de Quicksort;***");
			qu.quick(p.a, n, n);
			
			for(int i=0; i<p.n; i++){
				System.out.println(p.a[i]);
			}
			break;
		case 5:
			System.out.println("***Arreglo de orden de Mergesort;***");
			Mergesort.ordenacionMergeSort(p.a);
			
			for(int i=0; i<Principal.n; i++){
				System.out.println(p.a[i]);
			}
			
			break;
		case 6:
			System.out.println("***Arreglo de orden de Shell sort;***");
			Shellsort.shell(p.a);
			
			for(int i=0; i<Principal.n; i++){
				System.out.println(p.a[i]);
			}
			//////////////////////////
			break;
		case 7:
			 
			System.out.println("***Informacion de la Base de Datos ;***");

			for(int i=0; i<p.n; i++){
				System.out.println(p.a[i]);
			}
			
			break;
		case 8: System.out.println("bye"+"GRACIAS!"); break;
		default:System.out.print("Selecciona una opcion correccta"); break;
		}
		
		}
	}

}
