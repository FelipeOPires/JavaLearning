package fundamentos.operadores;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        int a = 3 * 4 - 10;
        int b = (int) Math.pow(a, 3); //O resultado do método Math.pow é double então deve ser feito o CAST para INT. Elevando a a terceira potência.
        double c = Math.pow(a, 3);

        //Separação da primeira parte da equação = [6 * (3 + 2) / 3 * 2 e o resultado disso, deve ser elevado ao quadrado
        double primeiraExpresao1 = 6 * (3 + 2);
        double primeiraExpresao2 = Math.pow(primeiraExpresao1, 2);
        double primeiraExpressao3 = primeiraExpresao2 / (3 * 2);

        //Segunda parte da equação = (1 - 5) * (2 - 7) / 2 e o resultado deve ser elevado ao quadrado
        double segundaExpresao1 = ((1 -5) * (2-7)) / 2;
        double segundaExpresao2 = Math.pow(segundaExpresao1, 2);

        //Tarceira parte - resolvendo a subtração entre primeiraExpressão1 e segundaExpressão2
        double terceiraExpressao1 = primeiraExpressao3 - segundaExpresao2;

        //Quarta parte da equação, elevando o resultado da subtração das expressões anteriores ao cubo
        double quartaExpressao1 = Math.pow(terceiraExpressao1, 3); //Elevando o resultado da terceiraExpressao1 ao cubo
        double quartaExpressao2 = Math.pow(10, 3); //Elevando 10 ao cubo

        //Junção final da pexpressão com o resultado
        double resultadoFinal = quartaExpressao1 / quartaExpressao2;


    /*
        System.out.println(primeiraExpressao3); //150.0
        System.out.println(segundaExpresao2); //100.0
        System.out.println(terceiraExpressao1); //50.0
        System.out.println(quartaExpressao1); //125000.0
     */

        System.out.println("O resultado da expressão é : " + (int) resultadoFinal); //125
    }
}
