package fundamentos.Exerc√≠ciosSobreConceitosBasicos;

import javax.swing.*;

public class ElevarAoQuadradoECubo {
    public static void main(String[] args) {

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor :"));

        double valorAoQuadrado = Math.pow(valor, 2);
        double valorAoCubo = Math.pow(valor, 3);

        JOptionPane.showMessageDialog(null, "O valor elevado ao quadrado √©: " + valorAoQuadrado +
                "\nO valor elevado ao cubo √©: " + valorAoCubo);
    }
}
