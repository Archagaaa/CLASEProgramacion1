package claseprogramacion.semana5;

import javax.swing.JOptionPane;

public class practicas {
    public static void main(String[] args) {
       String texto = JOptionPane.showInputDialog("Introduce un numero");
        int numero = Integer.parseInt(texto);
        
            //Hacemos un casting para que nos devuelva un numero entero
            int raiz = (int) Math.sqrt(numero);
            int contador = 0;
 
            //Contamos el numero de divisibles
            for (int i = raiz; i > 1; i--) {
                if (numero % i == 0) {
                    contador++;
                }
            }
 
            /*Segun el numero de divisibles, sabemos si es primo o no
                 * Si es primo el contador sera 0
             */
            //Mensaje de traza
            System.out.println(">>" + contador);
 
            if (contador < 1) {
                System.out.println("El numero " + numero + " es primo");
            } else {
                System.out.println("El numero " + numero + " no es primo");
            }
    }
}
