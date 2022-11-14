//Crie um programa que calcule e mostre na tela o resultado
//da soma entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.

package exercicios04.repeticoesenquanto;

public class Exercicio46 {
    public static void main(String[] args) {

        int inicio = 1;
        int soma = 0;

        while (inicio < 101) {

            if (inicio <100) {
                System.out.print(inicio + " + ");
            } else {
                System.out.println(inicio);
            }
            soma += inicio;
            inicio++;
        }
        System.out.println("A soma dos números é " + soma);
    }
}
