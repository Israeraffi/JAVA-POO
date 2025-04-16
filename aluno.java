import java.util.Scanner;

public class Aluno {

    String nome;
    int idade;
    String curso;
    String[] aulasassistidas;

    
    Aluno(String nome, String curso, int idade, String[] aulasassistidas) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.aulasassistidas = aulasassistidas;
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("\nDigite seu curso: ");
        String curso = leitor.nextLine();

        System.out.println("\nDigite sua idade: ");
        int idade = leitor.nextInt();
        leitor.nextLine(); 

        
        String[] aulasassistidas = new String[4];
        aulasassistidas[0] = "Português";
        aulasassistidas[1] = "Matemática";  
        aulasassistidas[2] = "POO";
        aulasassistidas[3] = "P.W";


        Aluno aluno1 = new Aluno(nome, curso, idade, aulasassistidas);

        System.out.println("\nSeu nome: " + aluno1.nome);
        System.out.println("Seu curso: " + aluno1.curso);
        System.out.println("Sua idade: " + aluno1.idade);

        System.out.println("\nAulas assistidas: ");
        for (String aula : aluno1.aulasassistidas) {
            System.out.println(aula);
        }
    }
}
