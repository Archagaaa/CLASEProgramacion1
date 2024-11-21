package claseprogramacion.semana4.ejemplos;

import javax.swing.JOptionPane;

public class operaciones {
    //atributos para ejemplo carro ecolor, marca, tipo, velocidad, año
    int num1, num2, suma, resta, multiplicar, dividir;
    
    //metodos
    public void ingresardatos(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
    }
    public void suma(){
        suma = num1 + num2;
    }
    public void resta(){
        resta = num1 - num2;
    }
    public void multiplicacion(){
        multiplicar = num1 * num2;
    }
    public void dividicion(){
        dividir = num1 / num2;
    }
    public void resultados(){
        JOptionPane.showMessageDialog(null, "La suma es: "+suma);
        JOptionPane.showMessageDialog(null, "La resta es: "+resta);
        JOptionPane.showMessageDialog(null, "La multiplicacion es: "+multiplicar);
        JOptionPane.showMessageDialog(null, "La divicion es: "+dividir);
    }
}
