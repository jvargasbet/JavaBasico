/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2.Tarea;

/**
 *
 * @author jvargas
 */
public class Mediateca {


    
    public static void main(String[] args) {
        Mediateca.doCastingmat(new CintaAudio(), "Los 100 años de soledad");
        Acceso acceso = new Acceso();
        acceso.setPrestamo(3);
        if (acceso.SolicitoAcceso()) {
            System.out.println("Se realizo la transaccion");
        }else{
            System.out.println("La cantidad solicita sobrepasa la cantidada permitida");
        }
        Cotizacion cotizacion =  new Cotizacion();

        if (acceso.SolicitoDaysAcceso(new CintaAudio(), 5)){
            cotizacion.setDays(5);
            cotizacion.SeTrata(new CintaAudio());
        }
    }
    
  
    
    public  static void doCastingmat(Material material, String palabra){
        
        Buscar buscar = new Buscar();
        
        if (material instanceof Libro){
            Libro libro = new Libro();
            libro.Lectura();
            buscar.setActores(palabra);
            buscar.BuscarActores();
        }else if((material instanceof CintaAudio)){
            CintaAudio cintaauido = new CintaAudio();
            cintaauido.Audio();
            buscar.setTitulo(palabra);
            buscar.BuscarTitulo();
        }else if((material instanceof CintaVideo)){
            CintaVideo cintavideo = new CintaVideo();
            cintavideo.Video();
            buscar.setDirector(palabra);
            buscar.BuscarDirector();
        }
        
    }
    
    
}
