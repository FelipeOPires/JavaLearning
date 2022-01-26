package controle;

public class For2EPrintF {
    public static void main(String[] args) {

        //Criar um laço for que será iniciado com o valor 10 e será decrementado de 2 em 2
        //Demonstrar o valor da variável de controle

        //Método printf - especificadores de formato

/*         Especificador 	Formato
                %s 	        String de caracteres
                %d 	        Número inteiro decimal
                %u 	        Número inteiro decimal sem sinal
                %o 	        Número inteiro octal sem sinal
                %x, %X 	    Número inteiro hexadecimal sem sinal, minúsculo ou maiúsculo
                %f 	        Float
                %2f 	    Double
                %e, %E 	    Número real, em notação científica, minúsculo ou maiúsculo
                %b 	        Boolean
                %c 	        Caractere (char)*/

        for (int contador = 10; contador >= 0; contador-= 2){
            System.out.printf("%s%d", "\nA variável de controle é ",  contador);
        }

    }
}
