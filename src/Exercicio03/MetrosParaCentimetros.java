package Exercicio03;

import java.util.Scanner;
public class MetrosParaCentimetros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double metro, centimetros;

        System.out.println("Olá, vamos transformar metros em centimetros.\n" +
                "Informe o valor do metro: ");
        metro = entrada.nextDouble();

        centimetros = metro * 100;

        System.out.println("O valor de " + metro +"mt" + " em centimetros é de: \n" + centimetros + "cm");


    }
}
// Programa que converta metros para centímetros.