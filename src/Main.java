import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LeitorCSV leitor = new LeitorCSV(Paths.get("alunos.csv"));

        Map<String, Aluno> mapaDeAlunos = leitor.learquivo();

        System.out.print("Digite sua matricula: ");
        String mat = sc.nextLine();

        Aluno a = mapaDeAlunos.get(mat);

        if (a != null) {

            GerenciadorUFFmail.criaUFFmail(a, mat, sc);
        } else {

            System.out.println("Matricula não encontrada");
        }

    }
}