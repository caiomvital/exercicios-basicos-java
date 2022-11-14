//Escreva um programa para calcular a redução do tempo de vida
//de um fumante. Pergunte a quantidade de cigarros fumados por dias
//e quantos anos ele já fumou. Considere que um fumante perde 10 min
//de vida a cada cigarro. Calcule quantos dias de vida um fumante perderá
//e exiba o total em dias.

package exercicios01.sequenciasbasicas;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos cigarros por dia você fuma?");
        int qtdCigarros = scan.nextInt();
        System.out.println("Informe há quantos anos você fuma:");
        int qtdAnos = scan.nextInt();
        int qtdCigarrosPorAno = qtdCigarros *365;
        System.out.println("Este é o total de cigarros que você fuma por ano: " + qtdCigarrosPorAno);
        int qtdCigarrosTotal = qtdCigarrosPorAno * qtdAnos;// 73000
        double tempoPerdidoDias = (( (double) (qtdCigarrosTotal *10) /6) /24);
        double tempoPerdido = ((( (double) (qtdCigarrosTotal *10) /6) /24) /365);
        System.out.printf("Você perdeu %d dias da sua vida por conta de cigarro.",Math.round(tempoPerdidoDias));
        System.out.printf(" Isso dá um total de %d anos.",Math.round(tempoPerdido));
    }
}
