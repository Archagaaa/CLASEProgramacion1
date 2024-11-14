package claseprogramacion.semana4.prueba;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("-----CALCULADORA DE CONSUMO DE AGUA-----");
        double consumomensual, consumototal = 0, promediomensual;
        int totalmeses = 12, contador = 1;
        
        while (contador <= totalmeses) {
            System.out.println("Ingrese el consumo del mes "+contador+ " de agua en litros: ");
            consumomensual = sc.nextDouble();
            consumototal += consumomensual;
            contador++;
        }
        promediomensual = consumototal / totalmeses;
        System.out.println("El consumo total del anio es: "+consumototal);
        System.out.println("El promedio mensual es: "+String.format( "%.2f", promediomensual));
    }
}
