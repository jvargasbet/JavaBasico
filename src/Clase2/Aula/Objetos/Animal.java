/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2.Aula.Objetos;

/**
 *
 * @author PFR
 */
public class Animal {

    private int numeroPatas;
    private String especie;
    private String nombre;
    private double  tamaño;
    private String hacerRuido;
    

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public String getHacerRuido() {
        return hacerRuido;
    }

    public void setHacerRuido(String hacerRuido) {
        this.hacerRuido = hacerRuido;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    void haceRuido(){
        System.out.println("rugir");
    }
                
            
  


}
