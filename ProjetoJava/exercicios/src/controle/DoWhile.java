package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar as palabras mágicas...");
            System.out.println("Que Sair? ");
            texto = input.nextLine();
        } while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");

        input.close();

    }
}
