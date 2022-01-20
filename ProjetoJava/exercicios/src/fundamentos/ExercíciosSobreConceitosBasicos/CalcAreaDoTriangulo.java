package fundamentos.ExercíciosSobreConceitosBasicos;

import javax.swing.*;

public class CalcAreaDoTriangulo {
    public static void main(String[] args) {

        double valorBase = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base do triângulo : ")
                .replace(",", "."));

        double valorAltura = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura do triângulo : ")
                .replace(",", "."));

        double areaTriangulo = (valorBase * valorAltura) / 2;

        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + areaTriangulo);

    }
}
