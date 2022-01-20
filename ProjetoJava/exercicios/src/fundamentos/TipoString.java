package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(1)); //Valida o caracter na posição 1 da String

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().startsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));


        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("Nome: " + nome
                + "\nSobrenome: " + sobrenome
                + " \nIdade : " + idade
                + " \nSalário: " + salario);

        System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario); //Resultado: O Senhor Pedro Santos tem 33 anos e ganha R$12345.99. Onde
        // format %s = String, %d = int, %f = float

        String frase = String.format("\nO Senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario); //É obtido o mesmo resultado, mas dentro de uma variável String (frase)
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual")); //Verificar se a String contém "qual".
        System.out.println("Frase qualquer".indexOf("qual")); //Demonstra o índice de início da String qual
        System.out.println("Frase qualquer".substring(6));   //Demonstrar qual String se inicia na posição 6
        System.out.println("Frase qualquer".substring(6,8)); //A posição beginIndex 6 é inserida no resultado, e a final 8 não, ou seja, a exibição é das letras de posições 6 e 7.
    }
}
