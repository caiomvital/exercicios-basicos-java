//Desenvolva um programa que mostre na tela a seguinte contagem:
//        100 95 90 85 80 ... 0 Acabou!

package exercicios04.repeticoesenquanto;

public class Exercicio41 {
    public static void main(String[] args) {

        int i =100;

        while (i >=0) {
            System.out.print(i + " ");
            i -=5;
        }
        System.out.println("Acabou!");
    }
}
