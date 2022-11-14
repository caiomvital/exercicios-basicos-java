//Faça um algoritmo que mostre na tela a seguinte contagem:
//        10 9 8 7 6 5 4 3 Acabou!

package exercicios04.repeticoesenquanto;

public class Exercicio39 {
    public static void main(String[] args) {

        int i =10;

        while (i>=3) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println("Acabou!");
    }
}
