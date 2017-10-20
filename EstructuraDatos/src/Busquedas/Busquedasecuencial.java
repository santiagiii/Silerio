package Busquedas;

public class Busquedasecuencial {

	public boolean buscar(String nc,Alumno[]a){
		boolean res=false;//inc variables
		
		for(int i=0;i<a.length;i++){//clc para untoin
			if(a[i].getNumerocontrol().equals(nc)){
				res=true;
				
				
			}
			
		}
		return res;//retornando valr
		
	}//fin publica

	
	
}
