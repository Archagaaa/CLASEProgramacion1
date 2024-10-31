package claseprogramacion.semana2;

import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        //Variables
        int numero;
        double raiz;    
    
        //Ingresa el usuario
        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();
        
        //Desarollo
        raiz = Math.sqrt(numero);  //Math. son para las funciones de matematicas
        System.out.println("La raiz cuadrada es: "+String.format("%.2f",raiz));
        //String.format("%.2f",variable) para 2 decimales de float
    }
}
