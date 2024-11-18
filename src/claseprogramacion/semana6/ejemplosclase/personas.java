package claseprogramacion.semana6.ejemplosclase;

public class personas {
    //Atributos
    String nombre;
    int edad;
    
    //Metodo Constructor para la clase de personas
    public personas(String nombre, int edad){ //Se le asigna el mismo nombre que la clase de arriba
        this.nombre = nombre; //o se puede usar this.nombre = nombre 
        this.edad = edad;
    }
    
    //Metodo para demostrar
    public void mostrar(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
