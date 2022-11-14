//Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas,
//mostrando no final:
//a) Qual foi a média de altura do grupo
//b) Quantas pessoas pesam mais de 90Kg
//c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
//d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.

package exercicios04.repeticoesenquanto;

import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int contador =0;
        double altura;
        double peso;
        double totalAltura =0;
        double mediaAltura;
        int totalAcima90 =0;
        int totalMenor50Menor160 =0;
        int totalMaior190Acima100 =0;

        while (contador <7) {
            System.out.println("Entre com o peso da " + (contador +1) + "ª pessoa:");
            peso = scan.nextDouble();
            System.out.println("Entre com a altura da " + (contador +1) + "ª pessoa:");
            altura = scan.nextDouble();
            totalAltura += altura;

            if (peso >=90) {
                totalAcima90++;
            }
            if (peso <=50&& altura <=1.6) {
                totalMenor50Menor160++;
            }
            if (peso >=100&& altura >=1.9) {
                totalMaior190Acima100++;
            }

            contador++;

        }

        mediaAltura = totalAltura /7;
        System.out.println("A média de altura do grupo foi de " + mediaAltura);

        if (totalAcima90 >0) {
            System.out.println("O total de pessoas acima dos 90kg foi de " + totalAcima90);
        }
        if (totalMenor50Menor160 >0) {
            System.out.println("O total de pessoas abaixo dos 50kg e menores que 1.60m foi de " + totalMenor50Menor160);
        }
        if (totalMaior190Acima100 >0) {
            System.out.println("O total de pessoas acima de 100kg e maiores que 1.90m foi de " + totalMaior190Acima100);
        }

    }
}
