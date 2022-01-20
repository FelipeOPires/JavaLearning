package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {

        double a = 1; //Conversão implícita
        System.out.println(a);

        float b = (float) 1.123456788888; //Conversão explícita (CAST), dizemos ao Java para explicitamente converter o valor para FLOAT.
        // Porém haverá perda de informação pois o valor é muito grande para um float. O valor será truncado.
        System.out.println(b);

        int c = 4;
        byte d = (byte) c;
        //O JAVA não analisa valores, apenas tipos como o tipo é int, não pode ser convertido implicitamente para byte
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e;
        System.out.println(f);






    }
}
