package controle;

public class BreakRotulado {
    public static void main(String[] args) {

        //Neste exemplo, o for "externo" só será finalizado quando o valor do contador i for igual a 2, o que equivale a validação i < 3
        //Como na execução, temos a posição i = 0 e j = 0 na primeira iteração, o laço continuará o incremento dos valoes de j
        //Isso ocorre porque enquanto o laço "interno" não for satisfeito, ou seja j < 3 ou i == 2 (dentro do IF), ele será executado novamente, gerando assim os resultados:
        //[0 0] [0 1] [0 2] onde [i = 0, j = 0] [i = 0, j = 1] [i = 0, j = 2]
        //Depois é feita uma nova validação do laço "externo", gerando os resultados:
        //[1 0] [1 1] [1 2] onde [i = 1, j = 0] [i = 1, j = 1] [i = 1, j = 2]
        //No retorno ao for externo, a condição i < 3 é true, então uma nova validação (I -> J) é realizada
        externo: for (int i = 0; i < 3; i++) {
            interno: for (int j = 0; j < 3; j++) {
                if (i == 2){
                    break externo;
                }
                System.out.printf("[%d %d] ", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim.");
    }
}
