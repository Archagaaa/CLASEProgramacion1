package claseprogramacion.semana4;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class arreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada;
        entrada = Integer.parseInt(JOptionPane.showInputDialog("Favor ingrese un numero"));
        char[] letras = new char[entrada];
        System.out.println("Favor ingresas los datos a guardar");
        for(int i = 0; i < entrada; i++) {
            System.out.println((1 + i)+" Favor ingresar caracter");
            letras[i] = sc.next().charAt(0);
        }
        System.out.println("Los caracteres ingresados son: ");
        for (int i =0; i < entrada; i++){
            System.out.println(letras[i]);
        }
    }
}
