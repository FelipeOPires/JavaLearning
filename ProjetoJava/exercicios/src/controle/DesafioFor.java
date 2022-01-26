package controle;

public class DesafioFor {
    public static void main(String[] args) {

        //Versão do desafio
        //Não pode ser utilizado valor numérico para controlar o laço
        //Fazer o laço for de forma que as 5 repetições não sejam controladas por números.

        for (String contador = "#"; !contador.equals("######"); contador+= "#"){
            System.out.println(contador);
        }
    }
}
