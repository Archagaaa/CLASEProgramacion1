package claseprogramacion.semana2;

import java.util.Scanner;

 class entradas {

public static void main(String[] args) {
        //System.out.println("Hola mundo");
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        double salario;
        
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        //entrada.next agarra lo primero sin espacio y next.line agarra todo incluido espacios
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.print("Ingrese su salario: ");
        salario = entrada.nextDouble();
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su edad es: "+edad);
        System.out.println("Su salario es: "+salario);
    }   
}
