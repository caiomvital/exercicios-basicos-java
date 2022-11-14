//Crie um algoritmo que leia a idade de 10 pessoas,
//mostrando no final:
//a) Qual é a média de idade do grupo
//b) Quantas pessoas tem mais de 18 anos
//c) Quantas pessoas tem menos de 5 anos
//d) Qual foi a maior idade lida

package exercicios04.repeticoesenquanto;

import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade =0;
        int maior18 =0;
        int menor5 =0;
        int maiorIdade = Integer.MIN_VALUE;
        int contador =0;

        while(contador <10) {
            System.out.print("Digite a " + (contador+1) + "ª idade: ");

            idade = scan.nextInt();
            if(idade >=18) {
                maior18++;
            }
            if(idade <=5) {
                menor5++;
            }
            if(idade > maiorIdade) {
                maiorIdade = idade;
            }
            contador++;
        }
        System.out.println("Você digitou 10 idades." +
                "\nO número de idades acima de 18 anos foi " + maior18 +
                ".\nO número de idades abaixo de 5 anos foi " + menor5 +
                ".\nA maior idade digitada foi " + maiorIdade + ".");

    }
}
