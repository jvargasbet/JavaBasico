/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2.Aula.Objetos;

public class Tigre extends Animal{
 
    void haceRuido() {
          System.out.println("rugir");
    }
    
    void hacerRuido(boolean molestar){
        if(molestar){
            System.out.println("rugir y zarpar");
        }
    }
    void hacerRuido(boolean molestar,String palabra){        
        if(molestar){
            System.out.println("rugir y zarpar");
        }        
        System.out.println("Responder " + palabra);
    } 
    
    
}
