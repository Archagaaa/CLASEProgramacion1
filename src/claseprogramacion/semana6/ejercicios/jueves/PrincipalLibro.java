package claseprogramacion.semana6.ejercicios.jueves;
/*
TRABAJO HECHO con Carlos Mauricio Rodriguez Altamirano 222411261 
*/
import java.util.Scanner;

public class PrincipalLibro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INFORMACION DE LIBRO");
        System.out.println("Titulo: ");
        String titulo = sc.next();
        System.out.println("Autor: ");
        String autor = sc.next();
        System.out.println("ISBN: ");
        int ISBN = sc.nextInt();
        System.out.println("Precio: ");
        double precio = sc.nextDouble();
        
        Libro libro = new Libro(titulo, autor, ISBN, precio);
        
        libro.mostrarinfo();
        
        System.out.println("Ingree su edad: ");
        int edad = sc.nextInt();
        
        libro.descuento(edad);
    }
}
