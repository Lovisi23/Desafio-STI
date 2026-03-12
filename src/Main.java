import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LeitorCSV leitor = new LeitorCSV(Paths.get("alunos.csv"));

        List<Aluno> listaDeAlunos = leitor.learquivo();

        System.out.print("Digite sua matricula: ");
        String mat = sc.nextLine();

        boolean achoumat = false;

        for (Aluno a : listaDeAlunos) {
            if (a.getMatricula().equals(mat)) {
                achoumat = true;
                GerenciadorUFFmail.criaUFFmail(a, mat);
                break;
            }
        }

        if(!achoumat)
            System.out.println("Matricula não encontrada");
    }
}