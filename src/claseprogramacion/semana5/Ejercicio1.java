package claseprogramacion.semana5;

import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        Random random = new Random (51);
        
        int[] aleatorio = new int [10]; //Arreglo de 10 elementos
        
        //Generar los 10 numeros aleatorios
        for (int i = 0; i < aleatorio.length; i++){
            aleatorio[i] = random.nextInt(51); //nextInt genera numeros de 0-50
        }
        
        //Mostrar los numeros generados
        System.out.println("Los 10 numeros aleatorios del 0-50 son: ");
        for (int aleatorios : aleatorio){
            System.out.println(aleatorios+" ");
        }
    }
}
