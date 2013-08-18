/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3.Aula;

/**
 *
 * @author PFR
 */
public class Matematicas {
    
    public static void main(String[] args) {
        Matematicas.getConstant();
        System.out.println(Matematicas.doOperaciones());
        //Matematicas.wrappers();
    }
   
    public static void getConstant() {
        System.out.println(Math.PI);
        System.out.println(Math.E);        
    }
    
     
    public static double doOperaciones() {
        //System.out.println(Match.sqrt(144));
        return Math.sqrt(144);
                   
    }
            
    public static void wrappers() {
        Integer entero = new Integer(12);
        entero.decode("Hola");
        System.out.println(entero.decode("Hola"));
                
        
                
        
    }
}
