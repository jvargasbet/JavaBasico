/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3.Aula.UsoInterface;

/**
 *
 * @author PFR
 */
public class UsoInterface {
    public static void main(String[] args) {
        Capitalizable[] listado = new Capitalizable[3];   
        listado[0] = new Palabra("Programacion en Java");
        listado[1] = new Palabra("Tecsup");
        listado[2] = new Oracion("Curso Java Basico - Tecsup");        

        for (int item=0; item<listado.length;item++){
	        System.out.println( "Texto " + item + ": " + listado[item].cambiaMayuscula());
	}
  
    }
    
}
