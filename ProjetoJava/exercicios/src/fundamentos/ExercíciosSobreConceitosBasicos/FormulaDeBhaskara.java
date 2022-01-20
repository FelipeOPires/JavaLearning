package fundamentos.ExercíciosSobreConceitosBasicos;

import javax.swing.JOptionPane;

public class FormulaDeBhaskara {
    public static void main(String[] args) {

        int a = 1;
        int b = 12;
        int c = -13;

        //Calculando o valor de Delta
        int delta = (int) Math.pow(b, 2) + ((-4 * a) * c);

        double valorDeX1 = (-b + Math.sqrt(delta) ) / 2;
        double valorDeX2 = (-b - Math.sqrt(delta) ) / 2;

        double validacaoX1 = (a * (Math.pow(valorDeX1, 2))) + (b * valorDeX1) + c;
        double validacaoX2 = (a * (Math.pow(valorDeX2, 2)))+ (b * valorDeX2) + c;

        String resultadoFinal1 = validacaoX1 >= 0 ? "O valor de x1: " + String.format("%.2f", validacaoX1)
                + ", satisfaz a equação." : "O valor de " + String.format("%.2f", validacaoX1) + ", não satisfaz a equação.";
        String resultadoFinal2 = validacaoX2 >= 0 ? "O valor de x2: " + String.format("%.2f", validacaoX2)
                + ", satisfaz a equação." : "O valor de " + String.format("%.2f", validacaoX2) + ", não satisfaz a equação.";

        JOptionPane.showMessageDialog(null, "-----------------------------------------------"
                + "\nPara a equação: " + a + "x^2" + " + " + b + "x" + c + " = 0"
                + "\n-----------------------------------------------"
                + "\nO valor de delta é: " + delta
                + "\nO valor de x1 é: " + (int) valorDeX1 + "\nO valor de x2 é: " + (int) valorDeX2
                +"\n-----------------------------------------------"
                +"\nResultado final"
                +"\n-----------------------------------------------"
                + "\n" + resultadoFinal1  + "\n" + resultadoFinal2);
    }
}