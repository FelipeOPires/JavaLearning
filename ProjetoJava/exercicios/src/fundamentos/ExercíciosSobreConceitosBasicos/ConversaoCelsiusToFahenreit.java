package fundamentos.ExercíciosSobreConceitosBasicos;

import javax.swing.*;

public class ConversaoCelsiusToFahenreit {
    public static void main(String[] args) {

        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor em graus Celsius : ").replace(",", "."));

        double fahenreit = (celsius * 1.8) + 32;

        JOptionPane.showMessageDialog(null," O valor convertido para Gray Fahenreit é : " + fahenreit + " ºF");
    }
}
