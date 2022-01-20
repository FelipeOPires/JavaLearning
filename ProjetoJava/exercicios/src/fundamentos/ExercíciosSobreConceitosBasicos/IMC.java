package fundamentos.ExercíciosSobreConceitosBasicos;

import javax.swing.*;
import java.text.DecimalFormat;

public class IMC {
    public static void main(String[] args) {

        double pessoaPeso = Double.parseDouble(JOptionPane.showInputDialog("Insira o seu peso: "));
        double pessoAltura = Double.parseDouble(JOptionPane.showInputDialog("Insira a sua altura: "));

        double imc = pessoaPeso / (Math.pow(pessoAltura, 2));

        DecimalFormat df = new DecimalFormat("###.##");

        JOptionPane.showMessageDialog(null, "O IMC é : " + df.format(imc));

    }
}
