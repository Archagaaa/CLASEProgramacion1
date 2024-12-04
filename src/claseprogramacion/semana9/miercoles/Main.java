package claseprogramacion.semana9.miercoles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBanco cuenta = new CuentaBanco();
        
        //Ingresar datos del usuario
        System.out.println("====SISTEMA DE BANCO====");
        System.out.println("Porfavor ingrese su nombre:");
        cuenta.cliente = sc.next();
        System.out.println("Porfavor ingrese su numero de cuenta:");
        cuenta.numerodecuenta = sc.nextInt();
        System.out.println("Porfavor Ingrese su numero de telefono:");
        cuenta.telefono = sc.next();
        System.out.println("========================");
        
        //Menu
        while(true){
            int opcion;
            System.out.println("=======MENU=======");
            System.out.println("Seleccione una opcion:"+
                            "\n 1 - Depositar"+
                            "\n 2 - Retirar"+
                            "\n 3 - Salir"+
                            "\n===================");
            opcion = sc.nextInt();
        
            switch (opcion){
                case 1:
                    System.out.println("Su saldo inical es: "+cuenta.getsaldo());
                    System.out.println("Ingrese su monto: ");
                    float deposito = sc.nextFloat();
                    cuenta.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Su saldo inical es: "+cuenta.getsaldo());
                    System.out.println("Ingrese su monto: ");
                    float retiro = sc.nextFloat();
                    cuenta.retirar(retiro);
                    break;
                case 3:
                    System.out.println("Ha salido del programa");
                break;
            }
        }
    }
}
