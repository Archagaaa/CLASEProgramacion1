package claseprogramacion.semana2;

import java.util.Scanner;

public class ActividadesSemana2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        
        /*
        //-----EJERCICIO 1-----------------------
        float celcius, fahrenheit;
        
        System.out.print("Ingrese los grados fahrenheit que desea convertir: ");
        fahrenheit = entrada.nextFloat();
        celcius = (fahrenheit - 32) * 5/9;
        System.out.println("Los grados convertidos a celcius son: "+celcius);
        */
        
        /*
        //-----EJERCICIO 2-----------------------
        float nota1, nota2, nota3, notaexamen, notatrabajo, promedionota, promedioexamen, promediotrabajo, calificacion;
       
        System.out.print("Ingrese la nota del primer parcial: ");
        nota1 = entrada.nextFloat();
        System.out.print("Ingrese la nota del segundo parcial: ");
        nota2 = entrada.nextFloat();
        System.out.print("Ingrese la nota del tercer parcial: ");
        nota3 = entrada.nextFloat();
        System.out.print("Ingrese la nota del examen: ");
        notaexamen = entrada.nextFloat();
        System.out.print("Ingrese la nota del trabajo final: ");
        notatrabajo = entrada.nextFloat();
        promedionota = (float) ((nota1 + nota2 + nota3) / 3 * 0.55);
        promedioexamen = (float) (notaexamen * 0.30);
        promediotrabajo = (float) (notatrabajo * 0.15);
        calificacion = promedionota + promedioexamen + promediotrabajo;
        System.out.println("Su calificacion final de la clase es: "+calificacion);
        */
        
        /*
        //-----EJERCICIO 3-----------------------
        float base, altura, area, perimetro;
        int opcion;
        
        System.out.println("Seleccione una la accion que desea realizar:\n"+
                           "1- Calcular Area\n"+
                           "2- Calcular Perimetro\n");
        opcion = entrada.nextInt();
        
        switch (opcion){
            case 1:
                System.out.print("Ingrese la base del rectangulo: ");
                base = entrada.nextFloat();
                System.out.print("Ingrese la altura del rectangulo: ");
                altura = entrada.nextFloat();
                area = base * altura;
                System.out.println("El area del rectangulo es: "+area+" unidades al cuadrado");
            break;
            
            case 2:
                System.out.print("Ingrese la base del rectangulo: ");
                base = entrada.nextFloat();
                System.out.print("Ingrese la altura del rectangulo: ");
                altura = entrada.nextFloat();
                perimetro = base*2 + altura*2;
                System.out.println("El perimetro del rectangulo es: "+perimetro);
            break;
            
            default: System.out.println("Porfavor eliga un numero de la lista");
        }
        */
        
        /*
        //-----EJERCICIO 4-----------------------
        int puntajetotal, partidosg, partidosp, partidose;
        
        System.out.print("Ingrese la cantidad de partidos ganados: ");
        partidosg = entrada.nextInt();
        System.out.print("Ingrese la cantidad de partidos empatados: ");
        partidose = entrada.nextInt();
        System.out.print("Ingrese la cantidad de partidos perdidos: ");
        partidosp = entrada.nextInt();
        puntajetotal = (partidosg * 3) + (partidose * 1) + (partidosp * 0);
        System.out.println("El puntaje total del equipo es: "+puntajetotal);
        */
    }
    
}
