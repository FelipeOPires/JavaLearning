public class Continue {
    public static void main(String[] args) {

        //Exemplo não usual de exibição de valores pares com continue;
        for (int i = 0; i < 10; i++) {

            if(i % 2 == 1){
                continue;
            }

            System.out.println(i);
        }

        // O valor da iteração = 5 "skipar" este item e prosseguir para a próxima iteração, que no caso será 6
        for (int i = 0; i < 10; i++) {

            if(i == 5){ continue;
            }

            System.out.println(i);
        }

    }
}
