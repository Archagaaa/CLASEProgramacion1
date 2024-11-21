package claseprogramacion.semana7.ejerciciojueves;

import java.util.Scanner;

public class procedimientocafe {
    //Atributos con los precios
    int preciocafepequeno = 45;
    int preciocafemediano = 56;
    int preciocafegrande = 65;
    
    int precioleche = 5;
    int preciocremora = 8;
    int preciosencillo = 0;
    
    int totalclientes = 0;
    int totalpequenos = 0;
    int totalmedianos = 0;
    int totalgrandes = 0;
    double totalcaja = 0;
    double preciofinal = 0;
    
    //Metodo del procedimiento de la compra
    public void compra(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione el tamano del cafe: 1 - Pequeno, 2 - Mediano, 3 - Grande");
        int tamanocafe = sc.nextInt();
        int precioinicial = 0;
        
        switch(tamanocafe){
            case 1:
                precioinicial = preciocafepequeno;
                totalpequenos++;
            break;
            
            case 2:
                precioinicial = preciocafemediano;
                totalmedianos++;
            break;
            
            case 3:
                precioinicial = preciocafegrande;
                totalgrandes++;
            break;
            
            default:
                System.out.println("Seleccion no valida, seleccione un numero de los mostrados");
            break;
        }
        
        System.out.println("Seleccione el agregado del cafe: 1 - Leche, 2 - Cremora, 3 - Sencillo");
        int agregadocafe = sc.nextInt();
        int precioagregado = 0;
        
        switch(agregadocafe){
            case 1:
                precioagregado = precioleche;
            break;
            
            case 2:
                precioagregado = precioleche;
            break;
            
            case 3:
                precioagregado = precioleche;
            break;
            
            default:
                System.out.println("Seleccion no valida, seleccione un numero de los mostrados");
            break;
        }
        
        //Usuario ingresa su edad
        System.out.println("Ingrese la edad del cliente: ");
        int edad = sc.nextInt();
        
        //Calcular el precio final
        preciofinal = precioinicial + precioagregado;
        if(edad >= 65){
            //Descuento de 25% para mayores de edad
            preciofinal = preciofinal * 0.25;
        }
        
        //Cada ves que se vende se agrega al total de clientes
        totalclientes++;
        totalcaja += preciofinal;
        
        System.out.println("El precio a pagar es: "+preciofinal);
    }
    
    public void cerrarcaja(){
        System.out.println("----RESUMEN DEL DIA----");
        System.out.println("Clientes atendidos: " + totalclientes);
        System.out.println("Cafes pequenos vendidos: " + totalpequenos);
        System.out.println("Cafes medianos vendidos: " + totalmedianos);
        System.out.println("Cafes grandes vendidos: " + totalgrandes);
        System.out.printf("Total en caja del dia:", totalcaja);
    }
}