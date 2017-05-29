/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springseedproject.controllers;

import java.util.List;

/**
 *
 * @author JairA
 */
public class verificacion {
	public int existeVariable (List<String[]> verificarID ,String id){
		for(int i=0; i<verificarID.size(); i++){
                    String var[] = verificarID.get(i);
			if(id.equals(var[0])){
				return i;	
			}
		}
		return -1;
	}
 public String verificarIndices(List<int[]> IndiceVectores, String[] vector ,String nombre,int indice1, int indice2){
     int pos = -1;
     String mensaje = "";
     for(int i =0; i< vector.length; i++){
         if(vector[i] == nombre){
             pos = i;
         }
     }
     if(pos >0){
        int [] ind = IndiceVectores.get(pos);
            if((indice1<0) || (indice1 > ind[0]) || (indice2<0) || (indice2 > ind[1])){
                mensaje = "Los indices exceden el tamaño de la matriz en la linea: ";
            }
     }
 
 
 return mensaje;
 }
        
 public String verificarAsignacionVariable (List<String[]> verificarID, String tipo, String nombre){
          String respuesta="";
          verificacion v = new verificacion();
          int pos = v.existeVariable(verificarID, nombre);
          if(pos>=0){
              String valor[] = verificarID.get(pos);
              if(valor[1]!= tipo){
                  respuesta = "Tipos incompatibles, se espera un " + valor[1];
            }
          }
          
        return respuesta;
      }
        
public String getTipo(List<String[]>Id, String nombre){
    String respuesta="";
          verificacion v = new verificacion();
          int pos = v.existeVariable(Id,nombre);
          if(pos>=0){
              String valor[] = Id.get(pos);
              respuesta = valor[1];
            }else{
              respuesta = "Esa vaina no existe mi vale";
          }
        return respuesta;
}
       
public int existeVector(List<String[]> vector,String nombre){
    for(int i=0; i<vector.size();i++){
        String search[] = vector.get(i);
            if(nombre.equals(search[0])){
		return i;
            }	//}
    }
    return -1;
}
 

// verifi
public String verificarAsignacionVector(List<String[]> vector,String nombre, String tipo){
         String respuesta="";
          verificacion v = new verificacion();
          int pos = v.existeVariable(vector, nombre);
          if(pos>=0){
              String valor[] = vector.get(pos);
              if(valor[1]!= tipo){
                  respuesta = "Tipos incompatibles, se espera un " + valor[1];
                }
          }
          
        return respuesta;

}

	public String verificarTipo(String tipo1,String signo, String tipo2){
		String resultado="";
			if(signo.equalsIgnoreCase("+") || signo.equalsIgnoreCase("-")){
				if(tipo1.equals(tipo2)){
					resultado = tipo1;
				}else if ((tipo1.equals("entero") && tipo2.equals("real"))||(tipo1.equals("real") && tipo2.equals("entero"))){
					resultado = "real";
				}else if(signo.equalsIgnoreCase("+") && tipo1.equals("texto") && tipo2.equals("texto")){
					resultado = "texto";
				}else{
					resultado = "No se puede convertir implicitamente: " + tipo1 + "a" + tipo2;
				}
			}else if(signo.equalsIgnoreCase("*") || signo.equalsIgnoreCase("/")|| signo.equalsIgnoreCase("$")){
				if(tipo1.equals(tipo2) || !(tipo1.equals("texto"))){
					resultado = tipo1;
				}else if((tipo1.equals("entero") && tipo2.equals("real"))||(tipo1.equals("real") && tipo2.equals("entero"))){
					resultado = "real";
				}else{
					resultado = "No se puede convertir implicitamente: " + tipo1 + "a" + tipo2;
				}
			}else{
				resultado = "No se puede convertir implicitamente: " + tipo1 + "a" + tipo2;
			}
		return resultado;
	}


     
     
}
