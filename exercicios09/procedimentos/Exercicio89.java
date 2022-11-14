//Crie um programa que melhore o procedimento Gerador()
//da questão anterior para que o programador possa escolher
//uma entre três bordas:
//+-------=======------+ Borda 1
//
//~~~~~~~~:::::::~~~~~~~ Borda 2
//
//<<<<<<<<------->>>>>>> Borda 3
//
//Ex: Uma chamada válida seria Gerador("Portugol Studio", 3, 2)
//~~~~~~~~:::::::~~~~~~~
//Portugol Studio
//Portugol Studio
//Portugol Studio
//~~~~~~~~:::::::~~~~~~~

package exercicios09.procedimentos;

import java.util.Scanner;

public class Exercicio89 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String frase;
        int contador =0;
        int borda;

        System.out.println("Digite uma frase: ");
        frase = scan.nextLine();
        System.out.println("Entre com o contador: ");
        contador = scan.nextInt();
        System.out.println("Escolha a borda: " +
                "\n1) <<<<<<<<------->>>>>>>" +
                "\n2) ~~~~~~~~:::::::~~~~~~~" +
                "\n3) +-------=======------+ (Padrão)");
        borda = scan.nextInt();

        gerador(frase,contador,borda);
    }
    static void gerador(String intro,int contador,int tipoBorda) {
        switch (tipoBorda) {
            case 1:
            System.out.println("<<<<<<<<------->>>>>>>");
            for (int i =0;i < contador;i++) {
                System.out.println(intro);
            }
            System.out.println("<<<<<<<<------->>>>>>>");
            break;
            case 2:
            System.out.println("~~~~~~~~:::::::~~~~~~~");
            for (int i =0;i < contador;i++) {
                System.out.println(intro);
            }
            System.out.println("~~~~~~~~:::::::~~~~~~~");
            break;
            default:
                System.out.println("+-------=======------+");
                for (int i =0;i < contador;i++) {
                    System.out.println(intro);
                }
                System.out.println("+-------=======------+");
        }
    }
}
