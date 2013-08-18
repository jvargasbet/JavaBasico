/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3.Aula;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


/**
 *
 * @author PFR
 */
public class Formato {
    
    public static void main(String[] args) {
        
        Formato.getFormatoMoneda();
        Formato.getFormatoFecha();
        try{
            Formato.textoFecha();
        }catch (ParseException e){
            System.out.println("Error");
        }
        //StringToDate("15/05/2013")
        System.out.println(Librerias.Utililes.StringToDate("ss/08/2013"));
        
    }
    
    public static void getFormatoMoneda() {
        // Formato de moneda
        NumberFormat formatGermany = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        formatGermany.setGroupingUsed(false);
        NumberFormat formatus = NumberFormat.getCurrencyInstance(Locale.US);
        formatus.setGroupingUsed(false);
        Locale lp = new Locale("es", "PE");
        NumberFormat nfp = NumberFormat.getCurrencyInstance(lp);
        nfp.setGroupingUsed(false);
        
        double miCuentaBancaria = 1999;
        System.out.println("Moneda Euro  :"+formatGermany.format(150));
        System.out.println("Moneda Dolar :"+formatus.format(150));
        System.out.println("Moneda Soles :"+nfp.format(150));

        
    }
    
    
    public static void getFormatoFecha() {
        GregorianCalendar ahora = new GregorianCalendar();
        
        // Crear una fecha
        //Calendar ahora = new GregorianCalendar(2007,2,2);
               
        System.out.println("Fecha : " + ahora.getTime());
        System.out.println("Año: " + ahora.get(Calendar.YEAR));
        System.out.println("Mes: " + ahora.get(Calendar.MONTH));
        System.out.println("Día del mes: " + ahora.get(Calendar.DAY_OF_MONTH));
        //
        System.out.println("Hora: " + ahora.get(Calendar.HOUR));
        System.out.println("Minuto: " + ahora.get(Calendar.MINUTE));
        System.out.println("Segundo: " + ahora.get(Calendar.SECOND));
        System.out.println("Milisegundo: " + ahora.get(Calendar.MILLISECOND));
        //
        System.out.println("Primer día de la semana : " + ahora.getFirstDayOfWeek());
        System.out.println("Semana del mes: " + ahora.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana del año: " + ahora.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Día del año: " + ahora.get(Calendar.DAY_OF_YEAR));

        
    }
    
    public static void getSimpleDate() {
        Date now = new Date();
        System.out.println(now.getTime());
        
        DateFormat df =  DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        SimpleDateFormat df5 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        //DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        
        String s =  df.format(now);
        String s1 = df1.format(now);
        String s2 = df2.format(now);
        String s3 = df3.format(now);
        String s4 = df4.format(now);
        String s5 = df5.format(now);
        
        System.out.println("(Default) Hoy es " + s);
        System.out.println("(SHORT)   Hoy es " + s1);
        System.out.println("(MEDIUM)  Hoy es " + s2);
        System.out.println("(LONG)    Hoy es " + s3);
        System.out.println("(FULL)    Hoy es " + s4);
        System.out.println("(CUSTOM)  Hoy es " + s5);
    }
    

    public static void compareFechas() {
        Calendar c1 = new GregorianCalendar(2011,9,1);				
        Date d1 = c1.getTime();

        Calendar c2 = new GregorianCalendar(2011,9,3);
        Date d2 = c2.getTime();

        if (d1.after(d2)) {
                System.out.println("d1 es después que d2");
        }
        if (d1.before(d2)) {
                System.out.println("d1 es antes que d2");
        }        
    }
    
    public static void textoFecha() throws ParseException {
        DateFormat dateFormat = DateFormat.getDateInstance();
        Date fecha = dateFormat.parse("18/08/2013");
        System.out.println(fecha);
        
    }

    private static void StringToDate(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}



