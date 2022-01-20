package controle;

public class DesafioIf {
    public static void main(String[] args) {

        double nota = 1.3;

        if(nota >= 9.0) { //originalmente o if estava da seguinte forma: if (nota >=9); {... Esse ; finaliza o bloco de código, então por isso as duas impressões são exibidas
            System.out.println("Quadro de Honra!");
            System.out.println("Você é fera!!!");
        }

    }
}
