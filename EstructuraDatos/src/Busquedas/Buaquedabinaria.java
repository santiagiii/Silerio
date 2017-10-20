package Busquedas; 
public class Buaquedabinaria {
 
    public static boolean buscar(Alumno[]a, String nc) {
      	
        String valorBuscar = nc;
        int inicio = 0;
        int fin = a.length - 1;
        int posicion;
 
        while (inicio <= fin) {
            posicion = (inicio + fin) / 2;
 
            if (a[posicion].getNumerocontrol().compareTo(valorBuscar)==0) {
                return true;
            } else if (valorBuscar.compareTo(a[posicion].getNumerocontrol())>0) {
                inicio = posicion + 1;
            } else {
                fin = posicion - 1;
            }
        }
        return false;
    }
 
   
}
