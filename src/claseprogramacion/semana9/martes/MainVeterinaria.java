package claseprogramacion.semana9.martes;

import java.util.Scanner;

import java.util.Scanner;

public class MainVeterinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inicializar el arreglo de precios
        Precio[] precios = new Precio[6];

        // Solicitar los precios para atencion medica
        System.out.println("Ingrese los precios para atencion medica:");
        System.out.print("Pequeno: ");
        precios[0] = new Precio("medica", "pequeño", sc.nextDouble());
        System.out.print("Mediano: ");
        precios[1] = new Precio("medica", "mediano", sc.nextDouble());
        System.out.print("Grande: ");
        precios[2] = new Precio("medica", "grande", sc.nextDouble());

        // Solicitar los precios para atencion estetica
        System.out.println("Ingrese los precios para atencion estetica:");
        System.out.print("Pequeno: ");
        precios[3] = new Precio("estetica", "pequeño", sc.nextDouble());
        System.out.print("Mediano: ");
        precios[4] = new Precio("estetica", "mediano", sc.nextDouble());
        System.out.print("Grande: ");
        precios[5] = new Precio("estetica", "grande", sc.nextDouble());

        ProcesoVeterinaria veterinaria = new ProcesoVeterinaria(precios);

        // Solicitar datos del cliente
        sc.nextLine(); // Limpiar buffer
        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.print("Direccion del cliente: ");
        String direccion = sc.nextLine();
        System.out.print("Edad del cliente: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        System.out.print("Telefono del cliente: ");
        String telefono = sc.nextLine();
        System.out.print("Es cliente frecuente? (true/false): ");
        boolean clienteFrecuente = sc.nextBoolean();

        Cliente cliente = new Cliente(nombre, direccion, edad, telefono, clienteFrecuente);

        // Solicitar datos de la atención
        sc.nextLine(); // Limpiar buffer
        System.out.print("Tipo de atencion (medica/estetica): ");
        String tipoAtencion = sc.nextLine();
        System.out.print("Tamano del animal (pequeno/mediano/grande): ");
        String tamano = sc.nextLine();

        // Calcular costo final
        double costoFinal = veterinaria.calcularcostos(tipoAtencion, tamano, cliente);

        // Mostrar resultado
        System.out.println("\n--- Detalles del Cliente ---");
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Direccion: " + cliente.direccion);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Cliente frecuente: " + (cliente.clientefrecuente ? "Si" : "No"));

        System.out.println("\n--- Detalles del Servicio ---");
        System.out.println("Tipo de atencion: " + tipoAtencion);
        System.out.println("Tamano del animal: " + tamano);
        System.out.printf("Costo final: %.2f\n", costoFinal);
    }
}

