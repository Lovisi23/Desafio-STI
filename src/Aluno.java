public class Aluno
{
    protected String nome;
    protected String matricula;
    protected String telefone;
    protected String email;
    protected String uffmail;
    protected String status;

    // Construtor

    public Aluno(String nome, String matricula, String telefone, String email, String uffmail, String status)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
        this.email = email;
        this.status = status;
        this.uffmail = uffmail;
    }

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
            this.telefone = telefone;
    }

    public void setUffmail(String uffmail) {
        this.uffmail = uffmail;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getUffmail() {
        return uffmail;
    }

    public String getStatus() {
        return status;
    }

    public String toString(){
        return String.format("%s: %s %n%s: %s %n%s: %s %n%s: %s %n%s: %s %n%s: %s  ",
                "Aluno", nome,
                "matricula", matricula,
                "telefone", telefone,
                "email", email,
                "uffmail", uffmail,
                "status", status);
    }
}

