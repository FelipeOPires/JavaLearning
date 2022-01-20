package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        //Domingo -> 1
        //Segunda -> 2
        //Terça -> 3
        //Quarta -> 4
        //Quinta -> 5
        //Sexta -> 6
        //Sábado -> 7

        //Scanner para pegar o nome de um dia da semana e deverá ser retornado o número associado a tal dia

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um dia da semana (texto) como: Domingo, Segunda, Terça, Quarta... etc: ");
        String dia = input.next();

        if(dia.equalsIgnoreCase("Domingo")){
            System.out.println("O número associoado a " + dia.toLowerCase() + " é 1");
        } else if(dia.equalsIgnoreCase("Segunda")){
            System.out.println("O número associoado a " + dia.toLowerCase() + " é 2");
        } else if(dia.equalsIgnoreCase("Terça")){
            System.out.println("O número associoado a " + dia.toLowerCase() + " é 3");
        } else if(dia.equalsIgnoreCase("Quarta")){
            System.out.println("O número associoado a " + dia.toLowerCase() + " é 4");
        } else if(dia.equalsIgnoreCase("Quinta")){
            System.out.println("O número associoado a " + dia.toLowerCase() + " é 5");
        } else if(dia.equalsIgnoreCase("Sexta")){
            System.out.println("O número associoado a " + dia.toLowerCase() + " é 6");
        } else{
            System.out.println("O número associoado a " + dia.toLowerCase() + " é 7");
        }

        input.close();

    }
}
