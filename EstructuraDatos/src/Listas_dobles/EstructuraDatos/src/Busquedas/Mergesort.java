package Busquedas;

import java.util.*; 
public class Mergesort{ 

public static void ordenacionMergeSort(Alumno[]AR){//
        if(AR.length<=1) return;//inc de variables
        int mitad= AR.length/2;
        Alumno[] izq=Arrays.copyOfRange(AR, 0, mitad);
        Alumno[] der=Arrays.copyOfRange(AR, mitad, AR.length);
        ordenacionMergeSort(izq);
        ordenacionMergeSort(der);       
        combinarVector(AR, izq, der);
}

public static void combinarVector(Alumno[] a, Alumno[] izq,Alumno[] der){
        int i=0;
        int j=0;
        for(int k=0;k<a.length;k++){
                if(i>=izq.length){
                        a[k]=der[j];
                        j++;
                        continue;
                }
                if(j>=der.length){
                        a[k]=izq[i];
                        i++;
                        continue;
                }
                if(izq[i].compareTo(der[j])<0){
                        a[k]=izq[i];
                        i++;
                }else{
                        a[k]=der[j];
                        j++;
                }
        }
}

}