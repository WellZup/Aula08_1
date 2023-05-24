package Exercicio07;
import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salariohora, horatrabalhada, salariomes, salarioLiquido, inss, sindicato;

        System.out.println("----- Olá, vamos verificar quanto recebe por mês.-------\n" +
                "-----Informe o valor que ganha por hora em reais: -------");
        salariohora = entrada.nextDouble();

        System.out.println("------ Informe a quantidade de horas que você trabalhou: ------\n" );
        horatrabalhada = entrada.nextDouble();

        salariomes = (salariohora * horatrabalhada) * 30;
        inss = salariomes / 100*11;
        sindicato = salariomes / 100*5;
        salarioLiquido = salariomes - inss - sindicato;

        System.out.println("------Salário Bruto: ------\n" + "R$" + salariomes + "\n" +
                "------Desconto INSS: ------\n" + "R$" + inss + "\n" +
                "------Desconto Sindicato: ------\n" + "R$" + sindicato + "\n" +
                "------Salário Líquido: ------\n" + "R$" + salarioLiquido + "\n" );

    }
}
//Programa que nos dá respectivamente:
//Salário bruto.
//Quanto pagou ao INSS.
//Quanto pagou ao sindicato.
//Qual o salário líquido do funcionário.