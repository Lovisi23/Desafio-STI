import java.util.Scanner;
public class GerenciadorUFFmail

{

    public static void criaUFFmail(Aluno a, String mat)
    {
        Scanner sc = new Scanner(System.in);

        if(!a.getStatus().equalsIgnoreCase("ativo"))

        {
            System.out.println("Falha ao criar email, aluno não ativo");
        }

        else if(!a.getUffmail().isEmpty())
        {
            System.out.println("Falha ao criar email, aluno ja possui uffmail");
        }

        {
            if (a.getMatricula().equals(mat) && a.getStatus().equalsIgnoreCase("ativo") && a.getUffmail().isEmpty()){

                String nomeCompleto = a.getNome();
                String[] partes = nomeCompleto.split(" ");
                String fn = partes[0].toLowerCase();                      // Primeiro nome
                String mn = (partes.length > 2) ? partes[1].toLowerCase() : ""; // Nome do meio
                String ls = partes[partes.length - 1].toLowerCase();      // Último nome

                String op1 = fn + (mn.isEmpty() ? "" : "_" + mn) +"@id.uff.br";
                String op2 = fn + (mn.isEmpty() ? "" : mn.charAt(0)) + ls.charAt(0) + "@id.uff.br";
                String op3 = fn.concat(ls) + "@id.uff.br";
                String op4 = fn.charAt(0) + ls + "@id.uff.br";
                String op5 = fn.charAt(0) + mn.concat(ls) + "@id.uff.br";

                System.out.println();
                System.out.println(a.getNome().substring(0, a.getNome().indexOf(" ")) + ", por favor escolha uma das opções abaixo para o seu UFFMail:\n" +
                        "1 - " + op1 + "\n" +
                        "2 - " + op2 + "\n" +
                        "3 - " + op3 + "\n" +
                        "4 - " + op4 + "\n" +
                        "5 - " + op5);

                System.out.println();
                int op = sc.nextInt();

                switch (op){

                    case 1:
                        System.out.println("A criação de seu e-mail " + "(" + op1 + ") será feita nos próximos minutos.\n" +
                                "Um SMS foi enviado para " + a.getTelefone() + " com a sua senha de acesso.");
                        break;

                    case 2:
                        System.out.println("A criação de seu e-mail " + "(" + op2 + ") será feita nos próximos minutos.\n" +
                                "Um SMS foi enviado para " + a.getTelefone() + " com a sua senha de acesso.");
                        break;
                    case 3:
                        System.out.println("A criação de seu e-mail " + "(" + op3 + ") será feita nos próximos minutos.\n" +
                                "Um SMS foi enviado para " + a.getTelefone() + " com a sua senha de acesso.");
                        break;
                    case 4:
                        System.out.println("A criação de seu e-mail " + "(" + op4 + ") será feita nos próximos minutos.\n" +
                                "Um SMS foi enviado para " + a.getTelefone() + " com a sua senha de acesso.");
                        break;
                    case 5:
                        System.out.println("A criação de seu e-mail " + "(" + op5 + ") será feita nos próximos minutos.\n" +
                                "Um SMS foi enviado para " + a.getTelefone() + " com a sua senha de acesso.");
                        break;

                    default: System.out.println("Opção invalida");

                }
            }
        }
    }
}

