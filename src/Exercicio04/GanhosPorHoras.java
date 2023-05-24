package Exercicio04;

import java.util.Scanner;
public class GanhosPorHoras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salariohora, horatrabalhada, salariomes, salariodia;

        System.out.println("----- Olá, vamos verificar quanto recebe por mês.-------\n" +
                "-----Informe o valor que ganha por hora em reais: -------");
        salariohora = entrada.nextDouble();

        System.out.println("------ Informe a quantidade de horas que você trabalhou: ------\n" );
        horatrabalhada = entrada.nextDouble();

        salariodia = salariohora * horatrabalhada;
        salariomes = (salariohora * horatrabalhada) * 30;

        System.out.println("------ O salário diario, pelas " + horatrabalhada +
                " é de :\n" + "R$" + salariodia + "\n" + "Seu salário mensal é de: \n" + "R$" + salariomes);

    }


}
//Programa que recebe o quanto você ganha por hora e o número de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês.