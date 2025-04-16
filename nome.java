
import java.util.Scanner;

public class nome1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Olá, tudo bem " + nome + "?");

        for (int i = 1; i <= 11; i++) {
            System.out.println("\nOlá, tudo bem " + nome + "?");

        }

    }

}
