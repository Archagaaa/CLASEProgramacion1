package claseprogramacion.semana4;

import java.util.Scanner;


public class funciones {
    public static void suma(){
        Scanner sc = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        System.out.println("Favor ingresar el numero 1: ");
        numero1 = sc.nextInt();
        System.out.println("Favor ingresar el numero 2: ");
        numero2 = sc.nextInt();
        System.out.println("La suma es: "+(numero1 + numero2));
    }
    public static void resta(){
        Scanner sc = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        System.out.println("Favor ingresar el numero 1: ");
        numero1 = sc.nextInt();
        System.out.println("Favor ingresar el numero 2: ");
        numero2 = sc.nextInt();
        System.out.println("La resta es: "+(numero1 -  numero2));
    }
    public static int multiplicar(){
        Scanner sc = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        System.out.println("Favor ingresar el numero 1: ");
        numero1 = sc.nextInt();
        System.out.println("Favor ingresar el numero 2: ");
        numero2 = sc.nextInt();
        
        return numero1*numero2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("----MENU----"+
                    "\n 1- Suma"+
                    "\n 2- Resta"+
                    "\n 3- Multiplicar"+
                    "\n 4- Salir");
            System.out.println("Ingrese una opcion:");
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    suma();
                    break;
                case 2:
                    resta();
                    break;
                case 3:
                    System.out.println("El resultado es: "+multiplicar());
                    break;
                default:
            }
            } while(op !=4);
        }
    }

