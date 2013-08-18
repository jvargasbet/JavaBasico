/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clase2.Tarea;

/**
 *
 * @author Administrador
 */
public abstract class Costo {
      private Integer dias;

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }
    public abstract Double Costo();


}
