package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 5.6;

        String resultadoFinal = media >= 7.0 ? "aprovado." : "em recuperação.";

        System.out.println("\nO Aluno está " + resultadoFinal);

        double nota = 7;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim" : "Não";

        System.out.printf("\nTem desconto? %s", resultado);
    }
}
