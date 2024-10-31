
package claseprogramacion.semana3;

import java.util.Random;
import java.util.Scanner;

//JUEGO DE ADIVINANZA
public class cicloejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random x = new Random();
        int aleatorio = x.nextInt(6); //Compu me genera un numero del 1-5
        int numero;
        
        System.out.println("Ingrese un numero del 0-5");
        numero = sc.nextInt();
        
        while(aleatorio != numero){
            System.out.println("Ingrese otro numero");
            numero = sc.nextInt();
            if (aleatorio > numero){
                System.out.println("El numero aleatorio mayor");
            }
            else {
                if(aleatorio == numero){
                    System.out.println("Felicidades, eligio el mismo numero que la computadora");
                    System.out.println("El numero de la computadora era: "+aleatorio);
                }
                else{
                    System.out.println("El numero aleatorio es menor");
                }
            }
        }
    }
    
}
