package claseprogramacion.semana6ejercicio;

public class persona {
    String nombre;
    int edad;
    
    public persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarpersona(){
        System.out.println("=======================");
        System.out.println("El nombre es: "+nombre+ " y la edad "+edad);
    }
}
