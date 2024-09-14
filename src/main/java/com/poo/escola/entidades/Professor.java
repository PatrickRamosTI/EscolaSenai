package com.poo.escola.entidade;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Professor extends Pessoa {
    private Date dataAdmissao;
    private Double salario;

    public static List<Professor> listaProfessores = new ArrayList<Professor>();

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public static void cadastrarProfessor() {
        System.out.println(" -- Cadastrando novo professor -- ");
        System.out.println("Nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        Professor professor = new Professor();
        professor.setNome(nome);
        Professor.listaProfessores.add(professor);
    }

    public static void atualizarProfessor() {
        if (!Professor.listaProfessores.isEmpty()) {
            System.out.println("Lista de professores: ");
            mostrarListaProfessores();
            System.out.println("Digite o número do professor para atualizar: ");
            Scanner sc = new Scanner(System.in);
            int indiceProfessor = sc.nextInt() - 1;
            if (indiceProfessor >= 0 && indiceProfessor < Professor.listaProfessores.size()) {
                Professor professorParaAtualizar = Professor.listaProfessores.get(indiceProfessor);
                System.out.println("Digite o novo nome: ");
                sc.nextLine();
                String novoNome = sc.nextLine();
                professorParaAtualizar.setNome(novoNome);
                System.out.println("Professor atualizado com sucesso. \n");
            } else {
                System.out.println("Número de professor inválido. \n");
            }
        } else {
            System.out.println("Não há professores cadastrados.");
        }
    }

    public static void removerProfessor() {
        if (!Professor.listaProfessores.isEmpty()) {
            System.out.println("Lista de professores: ");
            mostrarListaProfessores();
            System.out.println("Digite o número do professor para remover: ");
            Scanner sc = new Scanner(System.in);
            int indiceProfessor = sc.nextInt() - 1;
            if (indiceProfessor >= 0 && indiceProfessor < Professor.listaProfessores.size()) {
                Professor.listaProfessores.remove(indiceProfessor);
                System.out.println("Professor removido com sucesso. \n");
            } else {
                System.out.println("Número de professor inválido. \n");
            }
        } else {
            System.out.println("Não há professores cadastrados.");
        }
    }

    public static void mostrarListaProfessores() {
        if (!Professor.listaProfessores.isEmpty()) {
            System.out.println("Lista de professores: ");
            for (Professor p : listaProfessores) {
                System.out.println((listaProfessores.indexOf(p)) + "- " + p.getNome() + " / salário: " +
                        p.getSalario() + "/ e-mail: " + p.getEmail() + " / data de admissão: " +
                        p.getDataAdmissao());
            }
        } else {
            System.out.println("Não há professores cadastrados. \n");
        }
    }

    public static void semearProfessores() {
        Professor professor1 = new Professor();
        professor1.setNome("Arthur");
        professor1.setSalario(3200.00);
        professor1.setEmail("arthurG@gmail.com");
        professor1.setDataAdmissao(new Date());
        professor1.setSenha("MA@!1999");
        listaProfessores.add(professor1);

        Professor professor2 = new Professor();
        professor2.setNome("Pedro");
        professor2.setSalario(3200.00);
        professor2.setEmail("pedroG@gmail.com");
        professor2.setDataAdmissao(new Date());
        professor2.setSenha("PE@!1999");
        listaProfessores.add(professor2);

        Professor professor3 = new Professor();
        professor3.setNome("Lucas");
        professor3.setSalario(3200.00);
        professor3.setEmail("LucasG@gmail.com");
        professor3.setDataAdmissao(new Date());
        professor3.setSenha("LU@!1999");
        listaProfessores.add(professor3);

        Professor professor4 = new Professor();
        professor4.setNome("Mario");
        professor4.setSalario(3200.00);
        professor4.setEmail("marioG@gmail.com");
        professor4.setDataAdmissao(new Date());
        professor4.setSenha("MA@!1999");
        listaProfessores.add(professor4);
    }

    public static void registrarNotas() {
        System.out.println("Registrando notas");
        Aluno.mostrarListaAlunos();
        System.out.println("Digite o número do aluno para registrar a nota: ");
        Scanner sc = new Scanner(System.in);
        int indiceAluno = sc.nextInt() - 1;
        if (indiceAluno >= 0 && indiceAluno < Aluno.getListaAlunos().size()) {
            Disciplina.mostrarListaDisciplinas();
            System.out.println("Agora, digite o número da disciplina para registrar a nota: ");
            int indiceDisciplina = sc.nextInt() - 1;
            if (indiceDisciplina >= 0 && indiceDisciplina < Disciplina.getListaDisciplinas().size()) {
                Nota nota = new Nota();
                System.out.println("Qual a nota do aluno: ");
                Double valorNota = sc.nextDouble();
                nota.setNota(valorNota);
                nota.setAluno(Aluno.getListaAlunos().get(indiceAluno));
                nota.setDisciplina(Disciplina.getListaDisciplinas().get(indiceDisciplina));
                Nota.listaNotas.add(nota);
                Nota.salvarNotasEmArquivo();
            }
        } else {
            System.out.println("Número de aluno inválido. \n");
        }
    }

    public static List<Professor> getListaProfessores() {
        return listaProfessores;
    }
}
