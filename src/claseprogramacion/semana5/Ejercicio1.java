package claseprogramacion.semana5;

import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        Random random = new Random (50);
        
        int[] aleatorios = new int [10]; //Arreglo de 10 elementos
        
        //Generar los 10 numeros aleatorios
        for (int i = 0; i < aleatorios.length; i++){
            aleatorios[i] = random.nextInt(51); //nextInt genera numeros de 0-50
        }
        
        System.out.println("Los 10 numeros aleatorios del 0-50 son: ");
        for (int aleatorio : aleatorios){
            System.out.println(aleatorio+" ");
        }
    }
}
