package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        //Calcular a média das notas de uma turma, não se sabe a quantidade de alunos
        //Receber valores de notas válidas de 0 a 10
        //Quando o valor da nota for válida (apenas), será adicionada a variável total (+=)
        //Notas inválidas não serão aceitas e deve ser pedido para que um valor válido seja inserido
        //Deverá ter uma variável para contar quantas notas foram válidas
        //Para terminar o software, deve ser digitado "-1" pelo usuário

        Scanner input = new Scanner(System.in);

        int contador = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1){
            System.out.println("Insira uma nota de 0 a 10 (ou -1 p/ sair)");
            nota = input.nextDouble();

            if (nota >= 0 && nota <=10){
                total += nota;
                contador++;
            } else if(nota != -1) {
                System.out.println("Por favor, insira uma nota válida.");
            }
        }

        //Cálculo da média
        double media = total / contador;

        System.out.println("A média da turma foi de : " + media
        + "\nCom " + contador + " notas válidas");

        input.close();
    }
}
