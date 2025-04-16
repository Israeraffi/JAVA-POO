
import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class horas {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        LocalTime agora = LocalTime.now();
        int hora = agora.getHour();

        if (hora > 6 && hora <= 12) {
            System.out.println("Bom dia! " + nome);
        } else if (hora >= 13 && hora <= 18) {
            System.out.println("Bom tarde! " + nome);
        } else if (hora >= 19 && hora <= 23) {
            System.out.println("Bom noite! " + nome);
        } else {
            System.out.println("VAI DORMIR " + nome);
        }

    }
}
