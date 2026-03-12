import java.io.*;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class LeitorCSV

{
    private Path caminho;

    public LeitorCSV(Path caminho){
        this.caminho = caminho;
    }

    public Map<String,Aluno> learquivo(){
        Map<String,Aluno> alunos = new HashMap<>();

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
                alunos.put(a.getMatricula(),a);

                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return alunos;
    }
}
