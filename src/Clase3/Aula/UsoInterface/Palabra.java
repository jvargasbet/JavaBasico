/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3.Aula.UsoInterface;

/**
 *
 * @author PFR
 */
public class Palabra implements Capitalizable{
    
    String texto;
    
    Palabra(String n){
    texto=n.replaceAll(" ","");
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
