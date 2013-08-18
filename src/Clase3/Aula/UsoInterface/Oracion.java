/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3.Aula.UsoInterface;

/**
 *
 * @author PFR
 */
public class Oracion implements Capitalizable{
    private String texto;
    
    Oracion(String n){
    texto=n;
    }
    
    public String agregaPalabra(String t) {
    texto=texto.concat(" "+t);
     return texto;
    }
    
    //metodos de Interfase
    @Override
    public String cambiaMayuscula(){
        return texto.toUpperCase();
    }  
    @Override
    public String cambiaMinuscula(){
        return texto.toLowerCase();
    }


    
}
