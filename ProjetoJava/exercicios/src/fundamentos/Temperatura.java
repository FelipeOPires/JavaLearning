package fundamentos;

import javax.swing.*;

public class Temperatura {
    public static void main(String[] args) {

        final int ajuste = 32;
        final double fator = 5/9.0; //Divisão de números inteiros, sempre será um resultado inteiro. Neste caso, seria 0.
                                    // Então utilizamos 9.0 para que deixe de ser lido como inteiro.

        double Farenheit = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em Fahenreit : "));
        double Celsius = (Farenheit - ajuste) * fator; //Fórmula para conversão

        JOptionPane.showMessageDialog(null," O valor convertido para graus Celsius é : " + Celsius + "ºC.");
    }
}
