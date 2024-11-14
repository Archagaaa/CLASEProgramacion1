package claseprogramacion.semana4.prueba;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int productos, cantidadproducto;
        double costototal = 0,precio;
        
        System.out.println("----CALCULADORA DE PRECIOS----");
        System.out.println("Ingrese cuantos productos va a registrar: ");
        productos = sc.nextInt();
        
        for (int contador = 1; contador <= productos; contador++){
            System.out.println("Producto "+contador);
            System.out.println("Ingrese el precio del producto "+contador);
            precio = sc.nextDouble();
            System.out.println("Ingrese la cantidad de productos que compra");
            cantidadproducto = sc.nextInt();
            
            costototal += precio * cantidadproducto;
        }
        System.out.println("El costo total de la compra es: "+costototal);
    }
}
