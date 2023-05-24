package Exercicio02;

import java.util.Scanner;


public class MediaAritimetica {

    public static void main(String[] args) {
        double n1, n2, n3, n4, media;
        String nome;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, informe seu nome");
        nome = entrada.next();

        System.out.println(nome + ", vamos calcular o valor de sua média com base nas notas que você irá nos fornecer .\n" +
                "Peço que nos informe sua primeira nota: ");

        n1 = entrada.nextInt();

        System.out.println("Informe sua segunda nota: ");
        n2 = entrada.nextInt();

        System.out.println("Agora, informe sua terceira nota: ");
        n3 = entrada.nextInt();

        System.out.println("Por ultimo, informe sua quarta nota: ");
        n4 = entrada.nextInt();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println(nome + ", sua média é de : \n" + media);


    }
}
//Programa que receba 4 notas bimestrais e mostre a média aritmética.