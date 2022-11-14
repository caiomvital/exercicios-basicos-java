//O Índice de Massa Corpórea (IMC) é um valor calculado baseado
//na altura e no peso de uma pessoa. De acordo com o valor do IMC,
//podemos classificar o indivíduo dentro de certas faixas.
//- abaixo de 18.5: Abaixo do peso
//- entre 18.5 e 25: Peso ideal
//- entre 25 e 30: Sobrepeso
//- entre 30 e 40: Obesidade
//- acima de 40: Obesidade mórbida
//Obs: O IMC é calculado pela expressão peso/altura²
//(peso dividido pelo quadrado da altura)

package exercicios03.condicoescompostas;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double altura = 1;
        double peso = 1;

        System.out.println("Informe o peso do indivíduo em kg: ");
        peso = scan.nextDouble();
        System.out.println("Informe a altura do indivíduo em m: ");
        altura = scan.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        if (imc < 18.5) {
            System.out.println("O indivíduo está abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 25) {
            System.out.println("O indivíduo está em seu peso ideal.");
        } else if (imc > 25 && imc < 30) {
            System.out.println("O indivíduo está em sobrepeso.");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("O indivíduo está obeso.");
        } else {
            System.out.println("O indivíduo está com obesidade mórbida.");
        }
    }
}
