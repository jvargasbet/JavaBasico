/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2.Aula.Objetos;

public class Lobo extends Animal{

    
    void hacerRuido() {
        System.out.println("Auuuuu");
    }

     void hacerRuido(boolean estado) {
         if(estado){
             System.out.println("Auuuu");
         }
    }
       
    void hacerRuido(boolean estado, String palabra) {
         if(estado){
             System.out.println("Auuuu");
         }
         System.out.println("Esta diciendo algo" + palabra);
    }

    void hacerRuido(boolean estado, String palabra, String quemas){
        while(estado){
            System.out.println("El estado: " + palabra  );
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("El estado: " + quimas  );
        }
        
        String Palabra[5][2];
        
        
                
             
    }
    

    
    
}
