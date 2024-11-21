//recursividad es llamar a la misma funcion otra vez
package claseprogramacion.semana4.ejemplos;

public class recursividad {
 
    public static int funcion(int a){
        if(a <= 0){
            return 0;
        }
        System.out.println(a);
        return funcion(a-1);
    }
    public static void main(String[] args) {
        System.out.println(funcion(10));
    }
}
