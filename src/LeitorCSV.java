import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LeitorCSV

{
    private Path caminho;

    public LeitorCSV(Path caminho){
        this.caminho = caminho;
    }

    public List<Aluno> learquivo(){
        List<Aluno> alunos = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(caminho.toFile()))) {

            String line;
            line = br.readLine();
            while (line != null){

                String[] v = line.split(",");
                String nome = v[0];
                String matricula = v[1];
                String telefone = v[2];
                String email = v[3];
                String uffmail = v[4].trim();
                String status = v[5];

                Aluno a = new Aluno(nome,matricula,telefone,email,uffmail,status);
                alunos.add(a);

                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return alunos;
    }
}
