//Faça um programa que leia a largura e o comprimento
//de um terreno retangular, calculando e mostrando
//a sua área em m². O programa também deve mostrar
//a classificação desse terreno, de acordo com a lista abaixo:
//- Abaixo de 100m² = TERRENO POPULAR
//- Entre 100m² e 500m² = TERRENO MASTER
//- Acima de 500m² = TERRENO VIP

package exercicios03.condicoescompostas;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int largura;
        System.out.println("Informe a largura do terreno: ");
        largura = scan.nextInt();
        int comprimento;
        System.out.println("Informe o comprimento do terreno: ");
        comprimento = scan.nextInt();
        int area = largura * comprimento;

        if (area < 100) {
            System.out.println("O terreno é do tipo POPULAR.");
        } else if (area > 100 && area <= 500) {
            System.out.println("O terreno é do tipo MASTER.");
        } else {
            System.out.println("O terreno é do tipo VIP.");
        }
    }
}
