package claseprogramacion.semana2;

import java.util.Scanner;

public class exponentes {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        
        //VARIABLES
        int base, exponente;
        double resultado;
        
        //DESAROLLO
        System.out.println("Ingrese un numero: ");
        base = entrada.nextInt();
        System.out.println("Ingrese un exponente: ");
        exponente = entrada.nextInt();
        resultado = Math.pow(base, exponente);
        System.out.println("La respuesta es: "+resultado);
    }
}
