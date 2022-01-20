package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Felipe".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X"
                        .replace("X", "Gui")
                        .toUpperCase()
                        .concat("!!!");


        System.out.println(y);

        //Tipos primitivos não possuem operador "."

        int a = 3;
        //a. por exemplo, Não retorna atributos ou comportamentos após o "."
    }
}
