package claseprogramacion.semana5.ejemplos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class practicas {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
       /*
       //Leer 5 numeros y mostrarlos en el mismo orden
       
       int[] numeros = new int[5];
       
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Los numeros son: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        */
       
        /*
        //Pedir 6 numeros enteros y decir si es par o no
        
        int[] numeros = new int[6];
        
        System.out.println("Ingrese 6 numeros");
        for (int i = 1; i < numeros.length; i++) {
            System.out.println("Ingrese el numero "+i+": ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0){
                System.out.println(numeros[i]+" El numero es par");
            }
            else{
                System.out.println(numeros[i]+" El numero es impar");
            }
        }
        */
        
        //Invertir el arreglo de 8 elementos
        
        /*
        int[] arreglo = new int[8];
        
        System.out.println("Ingrese ");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = sc.nextInt();
        }
        
        System.out.println("Arreglo invertido");
        for (int i = 7; i >= 0 ; i--){ //se toma el valor ultimo y empieza a leer desde el ultimo valor al primero
            System.out.println(arreglo[i]);
        }
        */
        
        //Calcular el promedio, nota menor y mayor
        int numeronotas;
        double suma = 0, promedio;
        System.out.println("Ingrese la cantidad de notas");
        numeronotas = sc.nextInt();
        
        double [] notas = new double[numeronotas];
        double notamayor = notas[0];
        double notamenor = notas[0];
        
        //Ingresas las notas
        for (int contador = 0; contador < notas.length; contador++) {
            System.out.println("Ingrese la nota "+(contador + 1)+": ");
            notas[contador] = sc.nextInt(); 
        }
        //calcular
        for (double nota : notas){
            suma += nota;
            
            if (nota > notamayor){
                notamayor = nota;
            }
            if (nota < notamenor){
                notamenor = nota;
            }
        }
        //promedio
        promedio = suma / numeronotas;
        
        System.out.println("La suma de todas las notas es: "+suma);
        System.out.println("El promedio es: "+promedio);
        System.out.println("nota mayor"+notamayor);
        System.out.println("nota menor"+notamenor);
    }
}
