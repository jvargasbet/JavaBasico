/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clase2.Tarea;

/**
 *
 * @author Administrador
 */
public class Cotizacion extends  Costo{
    private final double precDayLib = 5d;
    private final double precDayCinVid = 10d;
    private final double precCinAud = 20d;
    private double precio;
    private double days;

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }
    @Override
    public Double Costo() {
        System.out.println("Se tiene que efecuar el pago: S/." + precio*days );
        return precio*days;

    }

    public void SeTrata(Material material){
        //Material[] materiales = {new CintaAudio(),new CintaVideo(),new Libro()};
        //for (Material material: materiales){
            if (material instanceof CintaAudio){
                precio = precCinAud;
                System.out.println("Se tiene que efecuar el pago único: S/." + precio );


            }else if (material instanceof CintaVideo){
                precio = precDayCinVid;
                Costo();
            }else if (material instanceof Libro){
                precio = precDayLib;
                Costo();
            }

        //}

    }


}
