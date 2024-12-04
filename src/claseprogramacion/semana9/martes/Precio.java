package claseprogramacion.semana9.martes;

public class Precio {
    //Atributos
    String tipodeatencion;
    String tamano;
    double costo;
    
    public Precio(String tipodeatencion, String tamano, double costo){
        this.tipodeatencion = tipodeatencion;
        this.tamano = tamano;
        this.costo = costo;
    }
    
    public boolean coincide(String tipodeatencion, String tamano) {
        return this.tipodeatencion.equalsIgnoreCase(tipodeatencion) && this.tamano.equalsIgnoreCase(tamano);
    }
}
    