package claseprogramacion.semana3;

import java.util.Scanner;

public class accesos {
    
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ccorrecta = "churro98";
        String cclave;
        int intentos = 0, maxintentos = 4 ;

        do {
            System.out.println("ingrese su clave");
            cclave = sc.nextLine();
            intentos++;

            if (!ccorrecta.equals(cclave)){
                System.out.println("La clave es incorrecta, ha utilizado: "+intentos+" intento de: "+maxintentos);
            }
        } while(!ccorrecta.equals(cclave) && (intentos<maxintentos));

        if(ccorrecta.equals(cclave)){
            System.out.println(ANSI_GREEN+"Clave correcta");
        }
        else{
            System.out.println(ANSI_RED+"No tiene mas intentos");
        }
    }
}
