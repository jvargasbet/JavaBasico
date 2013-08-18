/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3.Aula;

/**
 *
 * @author PFR
 */
public class Caracteres {
    
    public static void main(String[] args) {
        Caracteres.doContact();
        Caracteres.doReplace();
        Caracteres.doSubString();
    }
    
    public static void doContact() {
        String nombre = "James";
        String apellido = "Gosling";

        if(nombre.equals("James")) {
            System.out.println(nombre+" "+apellido);
        }

        String completo = nombre.concat(" "+apellido);

        if(nombre.equals("James")) {
            System.out.println(completo);
        }

    }
    public static void doSubString() {
        String texto = "Tecsup";		

        System.out.println("Número de Caracteres: "+texto.length()+"\n");		
        for (int i=0; i<texto.length(); i++) {			
           System.out.println(texto.substring(i,i+1)+"\n");
        } 

    }
    public static void doReplace() {
        String texto = "java permite crear java applets, javabeans y java servlets";
        System.out.println(texto.replaceAll("java","JAVA"));
    }
    
    public static void useStringBuffer() {
        StringBuffer sb = new StringBuffer("Java Basico Tecsup Lima");
        sb.insert(11, " en");
        sb.delete(21, sb.length());
        System.out.println(sb);
        System.out.println(sb.indexOf("en"));
    }
    
}
