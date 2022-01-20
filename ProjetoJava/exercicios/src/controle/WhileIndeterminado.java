package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String var = "";

        while(!var.equalsIgnoreCase("sair")){
            System.out.println("Você diz: ");
            var = input.nextLine();
        }

        input.close();
    }
}
