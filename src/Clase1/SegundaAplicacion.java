package Clase1;

public class SegundaAplicacion {

    public static void main(String[] args) {

        SegundaAplicacion.ejercio1();
        SegundaAplicacion.ejercio2();
        SegundaAplicacion.ejercio3();
        SegundaAplicacion.ejercio4();
        SegundaAplicacion.ejercio5();
        SegundaAplicacion.ejercio6();
        SegundaAplicacion.EjercioSwitch();
        SegundaAplicacion.EjercioFor();
        SegundaAplicacion.Ejercicio_7();
        SegundaAplicacion.EjercicioMatriz();
        SegundaAplicacion.EjercicioMatriz2();
        SegundaAplicacion.Ejercio_Fechas(1);
       // SegundaAplicacion.EjercioWhile();
    }

    public static void ejercio1() {
        int solucion = 0;

        solucion = 7 * (15 + 1) * 2 % 2;
        System.out.println(solucion);
    }

    public static void ejercio2() {
        boolean Flat = false;

        Flat = (0.0 / 0.0) == (0.0) / (0.0);
        System.out.println(Flat);
    }

    public static void ejercio3() {
        boolean Flat = false;
        Flat = (!true && false);
        System.out.println(Flat);

    }

    public static void ejercio4() {
        boolean Flat = false;
        Flat = ((3 * 4 >= 12) && (3.5 > 1 + 2f)) || (4 < 8);
        System.out.println(Flat);
    }

    public static void ejercio5() {
        boolean Flat = false;
        Flat = !(true == false);
        System.out.println(Flat);
    }

    public static void ejercio6() {
        boolean Flat = false;
        Flat = (!true == false);
        System.out.println(Flat);
    }
 
    public static void ejercio7() {
        int cont = 8;
        double total = 0;
        if (cont < 5){
            total = cont *10;
        }else if (cont < 10){
            total = cont *5;
        }else{
            System.out.println("mayor a 5");
        }
    }
    
    public static void EjercioSwitch() {
        int diaSemana = 5;
        String textoSemana = "";
        switch(diaSemana){
            case 1 :
                textoSemana = "Domingo";
                break;
            case 6 :
                textoSemana = "Viernes";
                break;
            default:
                textoSemana = "Otros";
                break;
        }
        System.out.println(textoSemana);
    }
    public static void EjercioWhile() {
        
        int contador = 9;
        //while(contador < 10){
            //System.out.println(contador);
            //++contador; // contador = contador +1
        //}
        
        do{
            System.out.println(contador);
            ++contador; // contador = contador +1
        }while(contador < 10);
        
    }
    
    public static void EjercioFor() {
        for (int i = 0; i < 10; i++) {
            if (i==6){
                break;
            }
            System.out.println("Finalizo");
        }
    }
    
    public static void Ejercicio_7() {
        int EdadJoven = 18, EdadMedia = 25, edadMayor = 60;
        int Cliente = 25;
        double Porcentaje = 0;
        if (Cliente < EdadJoven){
            Porcentaje =15;
        } else if(Cliente > edadMayor){
            Porcentaje = 30;
        } else {
            Porcentaje = 0;
        }
        
        System.out.println("Descuento de " + Porcentaje + "%");
        
        
    }
    public static void EjercicioMatriz() {
        int[] matrizNumeros = new int[5];
        matrizNumeros[0]= 648;
        matrizNumeros[1]= 342;
        matrizNumeros[2]= 1250;
        matrizNumeros[3]= 642;
        for (int i = 0; i < matrizNumeros.length; i++) {
            System.out.println(matrizNumeros[i]);
        }
    }
        public static void EjercicioMatriz2() {
        int[] matrizNumeros = new int[5];
        matrizNumeros[0]= 648;
        matrizNumeros[1]= 342;
        matrizNumeros[2]= 1250;
        matrizNumeros[3]= 642;
        for (int i = 0; i < matrizNumeros.length; i++) {
            System.out.println(matrizNumeros[i]);
        }
        
        int[][] matrizBidimensional = new int[5][2];
        matrizBidimensional[0][0]= 648;
        matrizBidimensional[0][1]= 648;
        
        matrizBidimensional[1][0]= 648;
        matrizBidimensional[1][1]= 648;
        
        matrizBidimensional[2][0]= 648;
        matrizBidimensional[2][1]= 648;
        
            for (int i = 0; i < matrizBidimensional.length; i++) {
                for (int j = 0; j < matrizBidimensional[i].length; j++) {
                    System.out.println(matrizBidimensional[i][j]);   
                }
                
            }
        
    }
    
    
    public static void Ejercio_Fechas(int mes){
        int[]meses = {30,28,31,30,31,30,31,30,31,30};
        System.out.println(meses[mes + 1]);
                
    }
}
