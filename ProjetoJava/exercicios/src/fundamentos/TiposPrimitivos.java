package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações de funcionário

        //Tipos núméricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;  //Inserindo L ou l após o valor, é definido que o número literal se trata de um LONG

        //Tipos numéricos reais (ponto flutuante)
        float salario = 11_445.44F;         //Indicamos ao JAVA para utilizar um literal FLOAT com a letra F ou f após o valor. O JAVA não analisa o valor em si, apenas o tipo.
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano
        boolean estaDeFerias = false; //true
        char status = 'A'; //Ativo

        //Dias de empresa do funcionário
        System.out.println(anosDeEmpresa * 365);

        //Número de viagens
        System.out.println(numeroDeVoos /2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario + " R$");
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status : " + status);
    }
}
