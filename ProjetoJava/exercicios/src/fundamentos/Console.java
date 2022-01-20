package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);  //n ou %n também quebra uma linha
        System.out.printf("Salário: %.1f%n", 1234.5678);
        System.out.printf("Nome: %s%n", "João");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();  //Leitura de teclas inputadas

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine(); //Leitura de teclas inputadas

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt(); //Leitura de números inseridos

        System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade); //Forma mais fácil do que concatenar os dados usando + String + String, ao invés, usar %s %s e informar os valores

        entrada.close();


    }
}
