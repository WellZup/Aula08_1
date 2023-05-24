package Exercicio06;
import java.util.Scanner;
public class AntecessorSucessor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, antecessor, sucessor;

        System.out.println("Iremos mostrar o antecessor e o sucessor de um número\n" +
                "Digite o número desejado: ");
        numero = entrada.nextInt();

        antecessor = numero - 1;

        sucessor = numero + 1;

        System.out.print("O antecessor do número " + numero + " é: " + antecessor + ".\n" +
                "E o seu sucessor é: " + sucessor + ".");
    }
}
