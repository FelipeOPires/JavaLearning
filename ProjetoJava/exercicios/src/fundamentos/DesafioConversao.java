package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        //A Partir do Scanner, capturar 3 strings usando next() nextLine()
        //Essas string receberão valores dos últimos 3 salários de um funcionário e deverá ser demonstrada a média dos valores.
        //Porém o valor do salário pode conter '.' ou ','

        //Converter String em valor numérico e realizar a soma dos 3 para obtenção da média.

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor do seu primeiro salário: ");
        String valor1 = input.next().replace(",", ".");

        System.out.println("Insira o valor do seu segundo salário: ");
        String valor2 = input.next().replace(",", ".");

        System.out.println("Insira o valor do seu terceiro salário: ");
        String valor3 = input.next().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A média dos salários é : R$" + media);

        input.close();



    }
}
