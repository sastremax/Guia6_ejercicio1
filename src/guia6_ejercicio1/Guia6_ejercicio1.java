/*
 Demuestre como provocar intencionalmente una excepción del tipo
NullPointerException, luego agregue las sentencias try/catch para mostrar el mensaje de
error.
 */
package guia6_ejercicio1;

import java.util.Arrays;


public class Guia6_ejercicio1 {

 
    public static void main(String[] args) {
       
        try {
          
            String[] array = new String[3];
            
            String cadena = array[0].toUpperCase(); 
            
            System.out.println("Cadena en mayúsculas: " + cadena);
        
        } catch (NullPointerException e) {
           
            System.out.println("Se produjo una excepción: NullPointerException");
            
            System.out.println("Mensaje de error: " + e.getMessage());
        }
    }
}
        
        
        
        
        
        
        
  