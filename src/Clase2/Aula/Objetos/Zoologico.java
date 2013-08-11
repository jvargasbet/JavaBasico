/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2.Aula.Objetos;

public class Zoologico {

    public static void main(String[] args) {
      
      Zoologico.doHerencia();
        
    }
    
    public static void instanciaObjeto() {
        Animal tigre = new Animal();
        tigre.setNombre("Tigrrrr");
        System.out.println(tigre.getNombre());  
    }
    
    public static void doHerencia() {
        Tigre tiger = new Tigre();
        tiger.haceRuido();
        System.out.println(tiger.getNumeroPatas());
        tiger.hacerRuido(true);
        tiger.hacerRuido(true, "Se canso de programar");
        
        Lobo lobo = new Lobo();
        lobo.haceRuido();
        lobo.setNumeroPatas(2);
        System.out.println(lobo.getNumeroPatas());
        
        
    }
    
    
    
    
    
   
}
