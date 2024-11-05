
package claseprogramacion.semana5ejercicios;

import java.util.Scanner;

public class Ejerciciosasignados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la opcion"+
                           "\n1 - Ventas"+
                           "\n2 - Dias laborares"+
                           "\n3- Numeros Primos");
        
        int opcion = sc.nextInt();
        
        switch(opcion){
            
        case 1:
            System.out.println("----VENTAS----");
            int nventas = 0;
            double venta = 0;
        
            System.out.println("Ingrese el numero de ventas: ");
            nventas = sc.nextInt();
        
            for (int i = 1; i < nventas; i++) {
            System.out.println("Ingrese la venta "+i+": ");
            venta = sc.nextDouble();
            venta += venta;
            }
            System.out.println("El total de ventas es: "+venta);
            break;
        
        case 2:
            System.out.println("----DIA LABORAL O NO----");
            
            break;
            
        case 3:
            
            break;
            
        default:
            System.out.println("Ingrese la opcion");
        }
    }
}
