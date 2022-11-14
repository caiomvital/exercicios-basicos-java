//Desenvolva um programa que faça o sorteio de 20 números
//entre 0 e 10 e mostre na tela:
//a) Quais foram os números sorteados
//b) Quantos números estão acima de 5
//c) Quantos números são divisíveis por 3

package exercicios04.repeticoesenquanto;

import java.util.Random;

public class Exercicio50 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] i = new int[10];
        int contador =0;
        int maior5 =0;
        int div3 =0;
        while (contador <10) {
            i[contador] = random.nextInt(10-1+1) +1;
            contador++;
        }
        System.out.println("Os números sorteados foram: ");
        for (int j =0;j < i.length;j++) {
            System.out.println(i[j]);
            if(i[j] >5) {
                maior5++;
            }
            if(i[j] %3==0) {
                div3++;
            }
        }
        System.out.println("Há " + maior5 + " números maiores que 5");
        System.out.println("Há " + div3 + " números divísveis por 3");

    }
}
