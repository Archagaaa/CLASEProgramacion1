package claseprogramacion.semana7.ejerciciojueves;

import java.util.Scanner;

public class maincafe extends procedimientocafe{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        procedimientocafe procedimiento = new procedimientocafe();
        int opcion;
        
        do{
            System.out.println("----MENU PRINCIPAL----");
            System.out.println("1. Procesar nueva compra");
            System.out.println("2. Cerrar caja y salir");
            System.out.println("Seleccion una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    procedimiento.compra();
                break;
                
                case 2:
                    procedimiento.cerrarcaja();
                break;
                
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                break;
            }
        } while(opcion != 2);
    }
}
