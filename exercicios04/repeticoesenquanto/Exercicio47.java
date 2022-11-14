//Desenvolva um aplicativo que mostre na tela
//o resultado da expressão 500 + 450 + 400 + 350 + 300 + ... + 50 + 0

package exercicios04.repeticoesenquanto;

public class Exercicio47 {
    public static void main(String[] args) {

        int inicio =500;
        int soma =0;

        while (inicio >=0) {

            soma += inicio;
            inicio -=50;
        }
        System.out.println("A soma dos números é " + soma);

    }
}
