
import java.util.Scanner;

public class repeticao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Quantas vezes deseja repetir seu nome?(a = 1x; b = 10x; c = 100x)");
        String pergunta = leitor.nextLine();

        if (pergunta.equals("a")) {
            System.out.println(nome);
        } else if (pergunta.equals("b")) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(nome);
            }
        } else if (pergunta.equals("c")) {
            for (int i = 1; i <= 100; i++) {
                System.out.println(nome);
            }
        } else {
            System.out.println("Digite uma opção valida!");
        }

    }
}
