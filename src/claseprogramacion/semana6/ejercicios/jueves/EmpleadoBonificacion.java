package claseprogramacion.semana6.ejercicios.jueves;
/*
TRABAJO HECHO Carlos Mauricio Rodriguez Altamirano 222411261 
*/
public class EmpleadoBonificacion extends Empleado{
    double bonificacion;
    double salariofinal;
    
    //Metodo Constructor
    public EmpleadoBonificacion(String nombre, double salario, String genero, int edad, int antiguedad){
        /*
        Super agarra todas las variables inicializadas del construcor de empleado
        */
        super(nombre, salario, genero, edad, antiguedad);
        calcularbonificacion();
        
    }
    
    public void calcularbonificacion(){
        //Calcular la bonificacion
        if (salario <= 18900 && antiguedad >= 5){
            bonificacion = salario * 0.10;
        }
        else if(salario >= 25000 && salario <= 45000 && antiguedad >= 7) {
            bonificacion = salario * 0.15;
        }
        else if(salario >= 45000){
            bonificacion = salario * 0.20;
        }
        else {
            bonificacion = 0;
        }
        
        //Calcular el salario final
        salariofinal = salario + bonificacion;
    }
    
    public void mostrarinfo(){
        System.out.println("=====INFORMACION=====");
        System.out.println("Nombre: "+nombre);
        System.out.println("Genero: "+genero);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+salario);
        System.out.println("Antiguedad: "+antiguedad+" anios");
        System.out.println("Bonificacion: " + bonificacion);
        System.out.println("Salario final con Bonificacion: " + salariofinal);
    }
}
