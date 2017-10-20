package Busquedas;

import java.util.Scanner;

public class Quicksort2 {
		
	
	public void quick(Alumno[]a, int izqu, int k){
	
		int izq=0;
		int dere=a.length-1;
		
		Alumno pivote = a[izq];
        int i = izq;
        int j = dere;
        Alumno auxIntercambio;
        while (i < j) {
            while (a[i].compareTo(pivote)<=0 && i < j) {
                i++;
            }
            while (a[j].compareTo(pivote) >0) {
                j--;
            }
            if (i < j) {
                auxIntercambio = a[i];
                a[i] = a[j];
                a[j] = auxIntercambio;
            }
        }
        a[izq] = a[j];
        a[j] = pivote;
        if (izq < j - 1) {
            quick(a, izq, j - 1);
        }
        if (j + 1 < dere) {
            quick(a, j + 1, dere);
        
        }
        }

}
