package claseprogramacion.semana4.ejemplos;

public class llamarclases {
    public static void main(String[] args) {
        //llamar a la clase
        operaciones op = new operaciones();
        op.ingresardatos();
        op.suma();
        op.resta();
        op.multiplicacion();
        op.dividicion();
        op.resultados();
    }
}
