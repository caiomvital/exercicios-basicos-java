//Faça um programa que mostre os 10 primeiros elementos
//da Sequência de Fibonacci:
//        1 1 2 3 5 8 13 21...

package exercicios07.repeticoescompara;

public class Exercicio70 {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(num1 + " ");
            num1 = num1 + num2;
            num2 = num1 - num2;
        }
    }
}
