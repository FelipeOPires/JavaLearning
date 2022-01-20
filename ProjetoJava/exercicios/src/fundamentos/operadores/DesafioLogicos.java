package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        //Trabalho na terça-feira (V OU F)
        //Trabalho na quinta-feira (V OU F)
        //SE os dois trabalhos darem certos, será comprada uma TV de 50"
        //Se apenas um dos trabalhos der certo, será comprada uma TV de 32"
        //Qualquer que seja TV comprada, a família irá tomar sorvete. Apenas se nenhum trabalho der certo, que nada acontecerá.
        //Colocar o resultado da TV comprada e se a família tomou sorvete

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        if (trabalho1 == true && trabalho2 == true){
            System.out.println("\nSerá comprada a TV de 50 polegadas e a família tomará sorvete no shopping!");
        }
        else if (trabalho1 == false && trabalho2 == true || trabalho1 == true && trabalho2 == false){
            System.out.println("\nSerá comprada a TV de 32 polegadas e a família tomará sorvete no shopping!");
        }
        else {
            System.out.println("\nTV não foi comprada e a família não tomará sorvete no shopping =(");
        }
    }
}
