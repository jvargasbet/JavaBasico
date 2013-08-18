/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clase2.Tarea;

public class Acceso {
   private final Integer CantPrestamos = 3;
   private final Integer DaysLibros = 15;
   private final Integer DaysVideo = 3;
   private final Integer DaysAudio = 5;

   private Integer prestamo;

    public Integer getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Integer prestamo) {
        this.prestamo = prestamo;
    }

    public boolean  SolicitoAcceso(){
        Integer cantpres;
        boolean flat;
        cantpres = this.getPrestamo();
         if (cantpres > CantPrestamos){
             flat= false;
         }else{
            flat = true;
         }
        return flat;
    }

    public boolean  SolicitoDaysAcceso(Material material, int days){
        Integer cantdays;
        boolean flat = true;
        cantdays =days;

        if (material instanceof CintaAudio){
            if (cantdays >  DaysAudio){
                flat = false;
                System.out.println("No se puede generar el prestamo, días aceptables es de: " + DaysAudio);
            }else{
                flat= true;
            }
        }else if (material instanceof CintaVideo){
            if (cantdays >  DaysVideo){
                flat = false;
                System.out.println("No se puede generar el prestamo, días aceptables es de: " + DaysVideo);
            }else{
                flat= true;
            }
        }else if (material instanceof Libro){
          if (cantdays >  DaysLibros){
                flat = false;
                System.out.println("No se puede generar el prestamo, días aceptables es de: " + DaysLibros);
            }else{
                flat= true;
            }
        }

        return flat;
    }



}
