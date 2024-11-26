
package claseprogramacion.semana8.prueba;

import java.util.Scanner;

public class procedimientorestaurante {
    Scanner sc = new Scanner(System.in);
    //Atributos de comidas
    double precioeconomica, precioregular, preciopremium;
    //Atributos de extras
    double precioextra;
    //Contadores
    int contadoreconomica, contadorregular, contadorpremium, contadorclientes;
    double totalventa;
    
    //PROCEDIMIENTO PARA LA VENTA
    public void comprar(){
        
        //INFORMACION SOBRE EL CLIENTE
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la direccion del cliente: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese la edad del cliente: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese el numero de telefono del cliente sin -");
        int telefono = sc.nextInt();
        System.out.println("El cliente es frecuente? 1- si, 2- no");
        int frecuente = sc.nextInt();
        
        //INFORMACION SOBRE LOS PRECIOS
        System.out.println("Ingrese el precio de comida ecomonica: ");
        precioeconomica = sc.nextDouble();
        System.out.println("Ingrese el precio de comida regular: ");
        precioregular = sc.nextDouble();
        System.out.println("Ingrese el precio de comida premium: ");
        preciopremium = sc.nextDouble();
        System.out.println("Ingrese el precio de los extras: ");
        precioextra = sc.nextDouble();
        
        //PROCEDIMIENTO DE VENTA
        System.out.println("Seleccione el numero del tipo de plato: 1- economico, 2- regular, 3- premium");
        int tipodeplato = sc.nextInt();
        double precioinicial = 0;
        double preciofinal;
        
        switch(tipodeplato){
            case 1:
                precioinicial = precioeconomica;
                contadoreconomica++;
            break;
            
            case 2:
                precioinicial = precioregular;
                contadorregular++;
            break;
            
            case 3:
                precioinicial = preciopremium;
                contadorpremium++;
            break;
            
            default:
                System.out.println("Seleccion no valida");
            break;
        }
        
        //EXTRAS SI O NO
        System.out.println("Desea agregar el extra? (ingrese el numero)  1- si, 2- no");
        int opcionextra = sc.nextInt();
        
        if(opcionextra == 1){
            preciofinal = precioinicial;
        }
        else{
            preciofinal = precioinicial + precioextra;
        }
        
        //MAYOR DE EDAD O NO Y FRECUENET SI O NO
        if(edad >= 65 && frecuente == 1){  //frecuente 1 siginifica si y 2 no
            preciofinal = preciofinal * 0.40;
        }
        else if(edad >= 65 && frecuente == 2){
            preciofinal = preciofinal * 0.25;
        }
        else if(edad <= 65 && frecuente == 1){
            preciofinal = preciofinal * 0.15;
        }
        else if(edad <= 65 && frecuente == 2){
            preciofinal = preciofinal;
        }
        
        contadorclientes++;
        totalventa += preciofinal;
        
        //MOSTRAR LA INFO
        System.out.println("====FACTURA====");
        System.out.println("Nombre: "+nombre);
        System.out.println("Direccion: "+direccion);
        System.out.println("Telefono: "+telefono);
        System.out.println("Edad: "+edad);
        System.out.println("Frecuente (1-si, 2-no): "+frecuente);
        System.out.println("El total a pagar es: "+preciofinal);
        System.out.println("=========================");
    }
    
    //METODO PARA MOSTRAR EL RESUMEN
    public void resumen(){
        System.out.println("====RESUMEN DEL DIA====");
        System.out.println("Clientes atendidos: " + contadorclientes);
        System.out.println("Comida economica vendida: " + contadoreconomica);
        System.out.println("Comida regular vendida: " + contadorregular);
        System.out.println("Comida premium vendida: " + contadorpremium);
        System.out.printf("Total en caja del dia:"+ totalventa);
        System.out.println("=========================");
    }
}
