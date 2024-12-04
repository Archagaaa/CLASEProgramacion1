package claseprogramacion.semana9.miercoles;

/**
 *
 * @author Aaron Archaga
 */
public class CuentaBanco {
    //Atributos
    public String cliente;
    public int numerodecuenta;
    public String telefono;
    public float limite;
    private float saldo;
    
    //Constructor sin parametros
    public CuentaBanco(){
        this.cliente = cliente;
        this.numerodecuenta = numerodecuenta;
        this.telefono = telefono;
        this.limite = 999999;
        this.saldo = 0;
    }
    
   //Metodo para obtener el saldo
   public float getsaldo(){
       return saldo;
   }
   
   public void depositar(float monto){
       if (monto < 0) {
           System.out.println("El monto de deposito no puede ser negativo");
           return;
       }
       if(saldo + monto > limite){
           System.out.println("El saldo no puede exceder el limite de 999,999");
           return;
       }
       saldo += monto;
       System.out.println("Ha depositado: "+monto+" su nuevo saldo es: "+saldo);
   }
   
   public void retirar(float monto){
       if (monto < 0){
           System.out.println("El monto de retiro no puede ser negativo");
           return;
       }
       if (saldo - monto < 0) {
           System.out.println("Tiene saldo insuficiente, esta retirando mas de lo que tiene en la cuenta");
           return;
       }
       saldo -= monto;
       System.out.println("Ha retirado: "+monto+" su nuevo saldo es: "+saldo);
   }
}
