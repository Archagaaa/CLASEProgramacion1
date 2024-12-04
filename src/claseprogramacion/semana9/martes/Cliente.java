package claseprogramacion.semana9.martes;

public class Cliente {
    //Atributos
    String nombre;
    String direccion;
    int edad;
    String telefono;
    boolean clientefrecuente;
    
    //Metodo constructor
    public Cliente (String nombre, String direccion, int edad, String telefono, boolean clientefrecuente){
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
        this.clientefrecuente = clientefrecuente;
    }
}
