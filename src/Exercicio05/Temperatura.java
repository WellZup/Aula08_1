package Exercicio05;

import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.println("Olá, vamos transformar o valor das temperaturas de Fahrenheit para Celsius.\n" +
                "-----Digite a temperatura em Farenheit: -----");
        fahrenheit = entrada.nextDouble();

        celsius = (fahrenheit - 32) / 1.8;

        System.out.println("O valor da temperatura em Celsius é de: " + celsius + "°C");

    }
}
//Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.

