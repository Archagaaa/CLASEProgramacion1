package claseprogramacion.semana4prueba;

import java.util.Scanner;


public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Número de empleados: ");
        int numempleados = sc.nextInt();
        
         for (int i = 1; i <= numempleados; i++) {
            int totalhoras = 0;

            System.out.println("Empleado " + i + ":");
            for (int contador = 1; contador <= 7; contador++) {
                System.out.print("Horas trabajadas en día " + contador + ": ");
                totalhoras += sc.nextInt();
            }
         double promedio = totalhoras / 7.0;

        //Mostrar
        System.out.println("Total de horas: " + totalhoras);
        System.out.println("Promedio diario:" +promedio);
    }
    }      
}

