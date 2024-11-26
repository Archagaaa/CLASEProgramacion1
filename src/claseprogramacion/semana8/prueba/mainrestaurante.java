
package claseprogramacion.semana8.prueba;

import java.util.Scanner;

public class mainrestaurante extends procedimientorestaurante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        procedimientorestaurante procedimiento = new procedimientorestaurante();
        int opcion;
    
        do{
            System.out.println("====MENU PRINCIPAL====");
            System.out.println("1. Procesar nueva compra");
            System.out.println("2. Mostrar Resumen de ventas");
            System.out.println("Seleccione una opcion: ");
            opcion = entrada.nextInt();
        
            switch(opcion){
                case 1:
                    procedimiento.comprar();
                break;
            
                case 2:
                    procedimiento.resumen();
                break;
                
                default:
                    System.out.println("Opcion no valida");
                break;
            }
        }while(opcion != 2);
    }
}
