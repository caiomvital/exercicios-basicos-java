//Crie um programa que leia gênero e peso de 8 pessoas,
//usando a estrutura “para”. No final, mostre na tela:
//a) Quantas mulheres foram cadastradas
//b) Quantos homens pesam mais de 100Kg
//c) A média de peso entre as mulheres
//d) O maior peso entre os homens

package exercicios07.repeticoescompara;

import java.util.Scanner;

public class Exercicio68 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numMulheres =0;
        double peso;
        double mediaPeso;
        double totalPeso =0;
        int totalHomensAcima100 =0;
        double maiorPesoHomens = Double.MIN_VALUE;
        String genero;

        for (int i =0;i <8;i++) {
            System.out.println("Entre com o gênero (M/F) da " + (i +1) + "ª pessoa");
            genero = scan.next();
            System.out.println("Entre com o peso da " + (i +1) + "ª pessoa");
            peso = scan.nextDouble();

            if(genero.equalsIgnoreCase("f")) {
                numMulheres++;
                totalPeso += peso;
            } else if (genero.equalsIgnoreCase("m") && peso >100) {
                totalHomensAcima100++;
            }
            if (genero.equalsIgnoreCase("m") && peso > maiorPesoHomens) {
                maiorPesoHomens = peso;
            }
        }

        mediaPeso = totalPeso / numMulheres;

        System.out.println("Você registrou 8 pessoas.");
        System.out.println("Foram cadastradas " + numMulheres + " mulheres.");
        System.out.println(totalHomensAcima100 + " homens acima de 100kg foram cadastrados.");
        System.out.println("A média de peso entre as mulheres foi de " + mediaPeso);
        System.out.println("O maior peso entre os homens registrados foi de " + maiorPesoHomens);

    }
}
