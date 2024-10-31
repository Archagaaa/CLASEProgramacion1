package claseprogramacion.semana2;

import javax.swing.JOptionPane;

public class cajero {
    public static void main(String[] args){
        //Variables
        final int saldoinicial = 2000;
        int opcion;
        float deposito, saldoactual, retiro;
        
        //Desarollo
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion:\n" //Panel de opciones
        +"1 - Deposito\n"
        +"2 - Retiro\n"
        +"3 - Salir"));
        
        switch (opcion){
            case 1:
                deposito = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su cantidad a depositar: "));
                if (deposito >= 1){
                    saldoactual = deposito + saldoinicial;
                    JOptionPane.showMessageDialog(null, "Su saldo es: "+saldoactual);
                }
                else {
                    JOptionPane.showMessageDialog(null, "No esta permitido ingresas valores negativos");
                }
            break;
            
            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su cantidad a retirar: "));
                if (retiro > saldoinicial){
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }
                else {
                    if (retiro >= 1){
                        saldoactual = saldoinicial - retiro;
                        JOptionPane.showMessageDialog(null,"Usted acaba de retirar: "+retiro+
                                                    "\nSu saldo actual es: "+saldoactual);    
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "No esta permitido valores negativos");
                    }
                }
            break;
            
            case 3:
                //Para salir dejarlo vacio
            break;
            
            default: JOptionPane.showMessageDialog(null, "Opcion Invalida");
        }
    }
}