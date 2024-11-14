//Crear un programama que solicite el nombre y la edad de 6 personas y luego las ordene por edades
package claseprogramacion.semana6ejercicio;

import java.util.Scanner;

public class Persona_por_edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        persona[] personas = new persona[6]; 
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            String nombre = sc.next();

            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            int edad = sc.nextInt();

            // Crear un objeto Persona y agregarlo al arreglo
            personas[i] = new persona(nombre, edad);
        }
        
        // Ordenar las personas por edad usando el método burbuja
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - 1 - i; j++) {
                if (personas[j].edad > personas[j + 1].edad) {
                    persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
        
        //Mostrar
        System.out.println("Personas ordenadas por edad:");
        for (persona persona : personas) {
            persona.mostrarpersona();
        }

    }
}
