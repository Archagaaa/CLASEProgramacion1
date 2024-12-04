/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseprogramacion.semana9.martes;

/**
 *
 * @author Aaron Archaga
 */
public class ProcesoVeterinaria {
    private Precio[] precios;
    
    public ProcesoVeterinaria(Precio[] precios){
        this.precios = precios;
    }
    
    public double calcularcostos(String tipodeatencion, String tamano, Cliente cliente){
        double costoinicial = 0;
        for (Precio precio : precios){
            if(precio.coincide(tipodeatencion, tamano)){
                costoinicial = precio.costo;
                break;
            }
        }
        
        double descuento = 0;
        if (cliente.edad >= 65){
            descuento = 0.15;
        }
        else if(cliente.clientefrecuente){
            descuento = 0.15;
        }
        
        return costoinicial - (costoinicial * descuento);
    }
}
