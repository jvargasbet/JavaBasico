
package Clase3.Aula;

import java.util.Date;


public class ClaseObject {

    public static void main(String[] args) {
        ClaseObject.doEquals();
        ClaseObject.doToString();
        ClaseObject object = new ClaseObject();
        System.out.println(object.toString());
        ClaseObject.overrideToString();
        ClaseObject.rareCompare();
    }
    
    public static void doEquals(){
        Date fechaNacimiento = new Date();
        //Date fechaCumpleaños = fechaNacimiento;
        Date fechaCumpleaños = new Date();
        if (fechaNacimiento ==fechaCumpleaños){
            System.out.println("iguales");
        }else {
            System.out.println("no son iguales");
        }   
        if (fechaNacimiento.equals(fechaCumpleaños)){
            System.out.println("Iguales");
        }  
    }
    
    public static void doToString(){
        Date fechaNacimiento = new Date();
        System.out.println("Fecha" + fechaNacimiento.toString());
    }
    
    public static void overrideToString() {
        ClaseObject object = new ClaseObject();
        System.out.println(object.toString());
    }
    
    @Override
    public String toString(){
        return "EXPLICANDO CLASE OBJECT";
    }
    
    public static void rareCompare() {
        Integer numero1 = 12;
        Integer numero2 = 12;
        
        Integer numeroX = new Integer(12);
        Integer numeroY = new Integer(12);
        
        if (numero1 == numero2){
            System.out.println("numeros iguales");
            
        }
        if (numeroX == numeroY){
            System.out.println("Iguales");
        }
        if (numeroX.intValue() ==numeroY){
            System.out.println("iguales x e Y by operadores iguales ");
        }
        if (numeroX.equals(numeroY)){
            System.out.println("Iguales x i y");
        }
        
    }
}
