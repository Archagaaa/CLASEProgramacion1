package claseprogramacion.semana6.ejercicios.jueves;
/*
TRABAJO HECHO con Carlos Mauricio Rodriguez Altamirano 222411261 
*/
public class Libro {
    //Atributos
    String titulo;
    String autor;
    int ISBN;
    double precio;
    
    public Libro(String titulo, String autor, int ISBN, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
    }
    
    public void mostrarinfo(){
    System.out.println("Titulo: "+titulo+
                       "\n Autor: "+autor+
                       "\n ISBN: "+ISBN+
                       "\n Precio: "+precio);
    }
    
    public void descuento(int edad){
        double descuento;
        if (edad >= 18){
            descuento = precio * 0.25;
        }
        else{
            descuento = precio * 0.10;
        }
        
        double precionuevo = precio - descuento;
        System.out.println("El precio nuevo es: "+precionuevo);
    }
}
