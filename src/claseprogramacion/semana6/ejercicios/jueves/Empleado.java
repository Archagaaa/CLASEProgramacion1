package claseprogramacion.semana6.ejercicios.jueves;
/*
TRABAJO HECHO con Carlos Mauricio Rodriguez Altamirano 222411261 
*/
 public class Empleado {
    //Atributos
    String nombre;
    double salario;
    String genero;
    int edad;
    int antiguedad;

    //Metodo Constructor
    public Empleado(String nombre, double salario, String genero, int edad, int antiguedad){
    this.nombre = nombre;
    this.salario = salario;
    this.genero = genero;
    this.edad = edad;
    this.antiguedad = antiguedad;
    }
    
    //Getter Y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}

