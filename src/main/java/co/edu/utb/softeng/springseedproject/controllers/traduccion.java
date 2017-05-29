/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springseedproject.controllers;

/**
 *
 * @author JairA
 */
public class traduccion {


    //datos primitivos
    public String declaracion_datos_primitivos(String id, String tipo, String valor_inicial) {
        String vars ="";
        switch (tipo) {
            case "entero":
                String valor = valor_inicial;
                    if (valor == null) {
                        valor = "0";
                    }
                vars = vars + id + ": .word " + valor + "\r\n";
                break;
            
            case "real":
                String valor1 = valor_inicial;
                    if (valor1 == null) {
                        valor1 = "0.0";
                    }
                vars = vars + id + ": .double " + valor1 + "\r\n";
                break;
            
            case "booleano":
                String valor2 = valor_inicial;
                    if (valor2 == null) {
                        valor = "0";
                    }
                vars = vars + id + ": .byte " + valor2 + "\r\n";
                break;
            
            case "texto":
                String valor3 = valor_inicial;
                    if (valor3 == null) {
                        valor = "0.0";
                    }
                vars = vars + id + ": .asciiz " + valor3 + "\r\n";
                break;
            
            default:
                break;

        }
        return vars;
    }

    //listas

    public String declaracion_listas(String nombre, String tipo) {
       String vars ="";
      
        switch (tipo) {
            case "entero":
                vars = vars + nombre + ": .space " + 200 + "\r\n";
                break;
            case "real":
                vars = vars + nombre + ": .space " + 3200 + "\r\n";
                break;
            case "booleano":
                vars = vars + nombre + ": .space " + 400 + "\r\n";
                break;
            case "texto":
                vars = vars + nombre + ": .space " + 800 + "\r\n";
                break;
            default:
                break;

        }
         return vars;
    }

    public String agregar_a_lista(String id, String tipo, String valor) {
        String fluj = "";
        switch (tipo) {
            case "entero":
                fluj = fluj + "addi ¬t0,¬zero,0  \r\n addi ¬s0,¬zero," + valor + "\r\n sw ¬s0," + id + "(¬t0) \r\n" + " addi ¬t0,¬t0,4 \r\n";
                break;
            case "real":

                fluj = fluj + "addi ¬t1,¬zero,0  \r\n addi ¬s1,¬zero," + valor + "\r\n sw ¬s1," + id + "(¬t1) \r\n" + " addi ¬t1,¬t1,64 \r\n";

                break;
            case "booleano":
                int bool;
                if (valor.equals("falso")) {
                    bool = 0;
                } else {
                    bool = 1;
                }
                fluj = fluj + "addi ¬t2,¬zero,0  \r\n addi ¬s2,¬zero," + bool + "\r\n sw ¬s2," + id + "(¬t2) \r\n" + " addi ¬t2,¬t2,8 \r\n";

                break;
            case "texto":

                fluj = fluj + "addi ¬t3,¬zero,0  \r\n li ¬a3," + valor + "\r\n sw ¬s3," + id + "(¬t3) \r\n" + " addi ¬t3,¬t3,16 \r\n";
                break;
            default:
                break;
        }
         return fluj;
    }

    public String modificar_lista(String id, String tipo, int valor1, String valor2) {

    String fluj = "";
        switch (tipo) {
            case "entero":
                fluj = fluj + "addi ¬t0,¬zero," + (valor1 * 4) + "\r\n addi ¬s0,¬zero," + valor2 + "\r\n sw ¬s0," + id + "(¬t0) \r\n";
                break;
            case "real":
                fluj = fluj + "addi ¬t1,¬zero," + (valor1 * 64) + "\r\n addi ¬s1,¬zero," + valor2 + "\r\n sw ¬s1," + id + "(¬t1) \r\n";

                break;
            case "booleano":
                int bool;
                if (valor2.equals("falso")) {
                    bool = 0;
                } else {
                    bool = 1;
                }
                fluj = fluj + "addi ¬t2,¬zero," + (valor1 * 8) + "\r\n addi ¬s2,¬zero," + bool + "\r\n sw ¬s2," + id + "(¬t2) \r\n";

                break;
            case "texto":

                fluj = fluj + "addi ¬t3,¬zero," + (valor1 * 16) + "\r\n li ¬a3," + valor2+ "\r\n sw ¬s3," + id+ "(¬t3) \r\n";
                break;
            default:
                break;
        }
         return fluj;
    }

    //matrices

    public String declaracion_matrices(String id,String tipo, int indices_vector) {
        String vars ="";
   
        switch (tipo) {
            case "entero":
                vars = vars + id + ": .space " + (4 * indices_vector) + "\r\n";
                break;
            case "real":
                vars = vars + id + ": .space " + (64 * indices_vector) + "\r\n";
                break;
            case "booleano":
                vars = vars + id + ": .space " + (8 * indices_vector) + "\r\n";
                break;
            case "texto":
                vars = vars + id + ": .space " + (16 * indices_vector) + "\r\n";
                break;
            default:
                break;
        }
         return vars;
    }

    /*
    public void modificar_matriz(String id, String tipo, int indice1, int indice2, String valor) {
        
        switch (tipo) {
            case "entero":
                fluj = fluj + "addi ¬t0,¬zero," + (valor1 * 4) + "\r\n addi ¬s0,¬zero," + valor + "\r\n sw ¬s0," + id + "(¬t0) \r\n";
                break;
            case "real":
                fluj = fluj + "addi ¬t1,¬zero," + (valor1 * 64) + "\r\n addi ¬s1,¬zero," + valor + "\r\n sw ¬s1," + id + "(¬t1) \r\n";

                break;
            case "booleano":
                int bool;
                if (valor.equals("falso")) {
                    bool = 0;
                } else {
                    bool = 1;
                }
                fluj = fluj + "addi ¬t2,¬zero," + (valor1 * 8) + "\r\n addi ¬s2,¬zero," + bool + "\r\n sw ¬s2," + id + "(¬t2) \r\n";

                break;
            case "texto":

                fluj = fluj + "addi ¬t3,¬zero," + (valor1 * 16) + "\r\n li ¬a3," + valor+ "\r\n sw ¬s3," + id+ "(¬t3) \r\n";
                break;
            default:
                break;
        }
    }
*/
    //Imprimir

    public String mostrar_en_pantalla_decla(String valor, String tipo) {
      String vars ="";
        switch(tipo){
			case "entero": 
				vars = vars + "entero"+valor+ ": .word "+valor +"\r\n";
				
			break;
			case "real":
			
				vars = vars + "real"+valor+ ": .float "+valor +"\r\n";
				
			break;
			case "texto":
				
				vars = vars + "texto"+valor+ ": .asciiz"+valor +"\r\n";
				
			break;
			case "booleano":
				vars = vars + "booleano:"+valor+ ": .byte "+valor +"\r\n";
				
			break;
			
			default: break;
		
		}
        return vars;
    }

    public String mostrar_en_pantalla_flu(String valor, String tipo) {

       String fluj = "";
        switch(tipo){
			case "entero": 
				fluj = fluj + "li ¬v0,1 \n la ¬a0, "+  "entero"+valor +"\n syscall \r\n";
			break;
			case "real":
				fluj = fluj + "li ¬v0,2 \n lwc1 ¬f12, "+  "real"+valor +"\n syscall \r\n";
			break;
			case "texto":
				fluj = fluj + "li ¬v0,4 \n la ¬a0, "+  "texto"+valor +"\n syscall \r\n";
			break;
			case "booleano":
				fluj = fluj + "li ¬v0,4 \n la ¬a0, "+  "booleano"+valor +" \n syscall \r\n";
			break;
			
			default: break;
		
		}
        return fluj;
    }
    
    
    
    public String mostrar_en_pantalla_id(String id, String tipo){
String fluj = "";
        switch (tipo) {
            case "entero":
                fluj = fluj + "li ¬v0,1 \n lw ¬a0, " + id + "\n syscall \r\n";
                break;
            case "real":
                fluj = fluj + "li ¬v0,2 \n lwc1 ¬f12," + id + "\n syscall \r\n";
                break;
            case "texto":
                fluj = fluj + "li ¬v0,4 \n la ¬a0," + id + "\n syscall \r\n";
                break;
            case "booleano":
                fluj = fluj + "li ¬v0,4 \n lw ¬a0," + id + " \n syscall \r\n";
                break;

            default:
                break;

        }
        return fluj;
    }
    //leer

    public String escribir(String id, String tipo) {
String fluj = "";
        switch (tipo) {
            case "entero":
                fluj = fluj + "li ¬v0,5 \r\nsyscall" + "\r\nmove " + id + ",¬v0 \r\n";
                break;
            case "real":
                fluj = fluj + "li ¬v0,7 \r\nsyscall" + "\r\nmove " + id + ",¬v0 \r\n";
                break;
            case "booleano":
                fluj = fluj + "li ¬v0,5 \r\nsyscall" + "\r\nmove " + id + ",¬v0 \r\n";
                break;
            case "texto":
                fluj = fluj + "li ¬v0,8 \r\nsyscall" + "\r\nmove" + id + ",¬v0 \r\n";
                break;
            default:
                break;
        }

        return fluj;
    }
}
