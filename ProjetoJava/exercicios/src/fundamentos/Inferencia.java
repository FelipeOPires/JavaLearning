package fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        var b = 4.5; //O tipo de variávcel não foi inserido, então o JAVA INFERE que o tipo da variável seja DOUBLE
        System.out.println(b);

        var c = "texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        // c = 4.5; o JAVA "amarrou" o tipo da variável c para STRING, então não podemos alterar o seu tipo para DOUBLE


        double d; // A variável foi declarada
        d = 123.65; // Variável foi inicializada
        System.out.println(d); //Variável utilizada

    }
}
