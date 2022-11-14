//Faça um algoritmo que leia o nome, o gênero e o salário
//de 5 funcionários e guarde esses dados em três vetores.
//No final, mostre uma listagem contendo apenas os dados
//das funcionárias mulheres que ganham mais de R$5 mil.

package exercicios08.vetores;


import java.util.Scanner;

public class Exercicio85 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] nomes = new String[5];
        String[] genero = new String[5];
        double[] salario = new double[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome da " + (i + 1) + " ª pessoa.");
            nomes[i] = scan.next();
            System.out.println("Digite o gênero da " + (i + 1) + "ª pessoa.");
            genero[i] = scan.next();
            System.out.println("Digite o salário da" + (i + 1) + "ª pessoa.");
            salario[i] = scan.nextDouble();
        }
        for (int i = 0; i < nomes.length; i++) {
            if (genero[i].equalsIgnoreCase("f") && salario[i] >= 5000) {

                System.out.println("Nome da funcionária: " + nomes[i]);
                System.out.println("Salário: " + salario[i]);


            }
        }
    }
}