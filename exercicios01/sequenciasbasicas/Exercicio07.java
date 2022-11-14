//Crie um algoritmo que leia um número real
//e mostre na tela o seu dobro e a sua terça parte.

package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio07 {
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.println("Digite um número");
        double valor =scan.nextDouble();
        double dobro = valor*2;
        double terco = valor/3;
        System.out.printf("O dobro de %f é %f. %n" +
                "A terça parte de %f é %f",valor,dobro,valor,terco);

    }
}
