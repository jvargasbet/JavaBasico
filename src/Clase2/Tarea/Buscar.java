/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase2.Tarea;

import Clase2.Tarea.Interfaces.FormasBusqueda;

/**
 *
 * @author jvargas
 */
public class Buscar extends Material implements FormasBusqueda{

    @Override
    public void BuscarAutor() {
        String autor;
        autor = this.getAutor();
        System.out.println("Se busco por el nombre del autor: " + autor);
        
    }

    @Override
    public void BuscarDirector() {
        String director;
        director = this.getDirector();
        System.out.println("Se busco por el nombre del director: " + director);
    }

    @Override
    public void BuscarActores() {
        String actores;
        actores = this.getActores();
        System.out.println("Se busco por actores: " + actores);
    }

    @Override
    public void BuscarTitulo() {
        String titulo;
        titulo = this.getTitulo();
        System.out.println("Se busco el titulo: " + titulo);
    }

    @Override
    public void BuscarLugar() {
        String lugar;
        lugar = this.getLugar();
        System.out.println("Se busco por el lugar: " + lugar);
    }

    @Override
    public void BuscarNumPaginas() {
        Integer numpag;
        numpag = this.getNumPaginas();
        System.out.println("Se busco por número de paginas: " + numpag);
    }
    
    
}
