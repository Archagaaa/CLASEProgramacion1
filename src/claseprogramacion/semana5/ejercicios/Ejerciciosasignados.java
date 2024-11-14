//Aaron Esteban Archaga Rostran 22451016
//Carlos Mauricio Rodriguez Altamirano 222411261

package claseprogramacion.semana5.ejercicios;

import java.util.Scanner;

public class Ejerciciosasignados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la opcion"+
                           "\n1 - Ventas"+
                           "\n2 - Dias laborares"+
                           "\n3 - Numeros Primos");
        
        int opcion = sc.nextInt();
        
        switch(opcion){
            
        case 1:
            System.out.println("----VENTAS----");
            int nventas = 0;
            double venta = 0;
        
            //Usuario ingresa el numero de ventas
            System.out.println("Ingrese el numero de ventas: ");
            nventas = sc.nextInt();
            
            //Ciclo donde el usuario ingresa el total de cada venta y se suman
            for (int i = 1; i < nventas; i++) {
            System.out.println("Ingrese la venta "+i+": ");
            venta = sc.nextDouble();
            venta += venta;
            }
            System.out.println("El total de ventas es: "+venta);
            break;
        
        case 2:
            System.out.println("----DIA LABORAL O NO----");
            String dia;
            
            System.out.println("Ingrese un dia: ");
            dia = sc.next();
            
            switch (dia){
                case "lunes":
                case "martes":
                case "miercoles":
                case "jueves":
                case "viernes":
                    System.out.println(dia+" Es un dia laboral");
                    break;
                case "sabado":
                case "domingo":
                    System.out.println(dia+" No es un dia laboral");
                    break;
                default:
                    System.out.println("Dia no valido");
            }
            break;
            
        case 3:
            System.out.println("----NUMEROS PRIMOS----");
            
            for (int numero = 2; numero <= 100; numero++) {
            int contadordivisor = 0;
                for (int i = 0; i < 10; i++) {
                    if (numero % 1 == 0){
                        contadordivisor++;
                    }
                }
                if (contadordivisor == 2){
                System.out.print(numero + " ");
                }
            }
            break;
            
        default:
            System.out.println("Ingrese otra opcion");
        }
    }
}
