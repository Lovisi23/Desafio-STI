import java.util.Scanner;
public class GerenciadorUFFmail

{

    public static void criaUFFmail(Aluno a, String mat, Scanner sc)
    {

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
                String ls = (partes.length > 1) ? partes[partes.length - 1].toLowerCase() : "";      // Último nome

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
                        "5 - " + op5 + "\n");

                int op = 0;
                op = sc.nextInt();

                if (op < 1 || op > 5)
                    do {
                        System.out.print("\nOpção invalida, escolha uma opção valida: ");
                        op = sc.nextInt();
                    }while (op < 1 || op > 5);

                String email_es = "";

                switch (op){

                    case 1: email_es = op1;break;
                    case 2: email_es = op2;break;
                    case 3: email_es = op3;break;
                    case 4: email_es = op4;break;
                    case 5: email_es = op5;break;

                }

                System.out.println("\nA criação de seu e-mail " + "(" + email_es + ") será feita nos próximos minutos.\n" +
                        "Um SMS foi enviado para " + a.getTelefone() + " com a sua senha de acesso.");
            }
        }
    }
}

