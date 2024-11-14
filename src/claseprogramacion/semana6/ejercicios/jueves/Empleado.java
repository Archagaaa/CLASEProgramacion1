package claseprogramacion.semana6.ejercicios.jueves;

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
    
    //Metodo para mostrar la info
    public void mostrarinfo(){
        System.out.println("=====INFORMACION=====");
        System.out.println("Nombre: "+nombre);
        System.out.println("Genero: "+genero);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+salario);
        System.out.println("Antiguedad: "+antiguedad+" anios");
    }
}


