//Melhore o exercício 96, criando além da função Media()
//uma outra função chamada Situacao(), que vai retornar
//para o programa principal se o aluno está
//APROVADO, em RECUPERAÇÃO ou REPROVADO.
//Essa nova função, vai receber como parâmetro
//o resultado retornado pela função Media().

package exercicios10.funcoes;

import java.util.Scanner;

public class Exercicio100 {

    static double nota1;
    static double nota2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        Exercicio100.nota1= scan.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        Exercicio100.nota2= scan.nextDouble();

        System.out.println("A média entre as notas é de " +media(Exercicio100.nota1,Exercicio100.nota2));
        System.out.println("Situação: " +situacao(media(Exercicio100.nota1,Exercicio100.nota2)));
    }
    static double media(double nota1,double nota2) {

        return (nota1 + nota2) /2;
    }

    static String situacao(double media) {

        double nota1 = Exercicio100.nota1;
        double nota2 = Exercicio100.nota2;

        String situacao = " ";
        if(media(nota1,nota2) <5) {
            situacao = "Reprovado";
        } else if(media >=5&& media <7) {
            situacao = "Em recuperação";
        } else if(media >=7) {
            situacao = "Aprovado";
        }

        return situacao;
    }
}
