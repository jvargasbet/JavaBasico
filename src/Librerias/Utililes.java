/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Librerias;

import Clase3.Aula.Formato;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author PFR
 */
public class Utililes {
    public static Date StringToDate(String fecha) {
        DateFormat dateFormat =  DateFormat.getDateInstance();
        Date date = null;
        try{
            date = dateFormat.parse(fecha);
        }catch (ParseException e){
            System.out.println("ERROR: Formato de fecha incorrecta");
        }
        return date;
    }
    
}
