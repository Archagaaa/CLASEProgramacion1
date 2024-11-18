package claseprogramacion.semana6.ejercicios.jueves;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        EmpleadoBonificacion empleado = new EmpleadoBonificacion("",0,"",0,0);
        
        System.out.println("Ingrese el primer nombre: ");
        empleado.setNombre(sc.next());
        
        System.out.println("Ingrese el salario: ");
        empleado.setSalario(sc.nextDouble());
        
        
        System.out.println("Ingrese el genero: ");
        empleado.setGenero(sc.next());
        
        System.out.println("Ingrese la edad: ");
        empleado.setEdad(sc.nextInt());
        
        System.out.println("Ingrese la antiguedad: ");
        empleado.setAntiguedad(sc.nextInt());
        
        //Mostras la info
        System.out.println("La info es:");
        empleado.mostrarinfo();
    }
}
