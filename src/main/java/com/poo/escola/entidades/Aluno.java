package com.poo.escola.entidade;

import com.poo.escola.enuns.Situacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa {
    private Date dataMatricula;
    private String curso;
    private static Situacao situacao;

    private List<Nota> listaNotas = new ArrayList<>();

    public List<Nota> getListaNotas() {
        return listaNotas;
    }

    public void adicionarNota(Nota nota) {
        this.listaNotas.add(nota);
    }

    public static List<Aluno> listaAlunos = new ArrayList<Aluno>();

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "dataMatricula=" + dataMatricula +
                ", curso='" + curso + '\'' +
                ", situacao=" + situacao.getStts() +
                '}';
    }

    public static void cadastrarAluno() {
        System.out.println(" -- Cadastrando novo aluno -- ");
        System.out.println("Nome: ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        Aluno.listaAlunos.add(aluno);
    }

    public static void atualizarAluno() {
        if (!Aluno.listaAlunos.isEmpty()) {
            System.out.println("Lista de alunos: ");
            mostrarListaAlunos();
            System.out.println("Digite o número do aluno a ser atualizado: ");
            Scanner sc = new Scanner(System.in);
            int indiceAluno = sc.nextInt() - 1;
            if (indiceAluno >= 0 && indiceAluno < Aluno.listaAlunos.size()) {
                Aluno alunoAtualizar = Aluno.listaAlunos.get(indiceAluno);
                System.out.println("Digite o novo nome: ");
                sc.nextLine();
                String novoNome = sc.nextLine();
                alunoAtualizar.setNome(novoNome);
                System.out.println("Aluno atualizado com sucesso. \n");
            } else {
                System.out.println("Número de aluno inválido. \n");
            }
        } else {
            System.out.println("Não há alunos cadastrados.");
        }
    }

    public static void removerAluno() {
        if (!Aluno.listaAlunos.isEmpty()) {
            System.out.println("Lista de alunos: ");
            mostrarListaAlunos();
            System.out.println("Digite o número do aluno a ser removido: ");
            Scanner sc = new Scanner(System.in);
            int indiceAluno = sc.nextInt() - 1;
            if (indiceAluno >= 0 && indiceAluno < Aluno.listaAlunos.size()) {
                Aluno.listaAlunos.remove(indiceAluno);
                System.out.println("Aluno removido com sucesso. \n");
            } else {
                System.out.println("Número de aluno inválido. \n");
            }
        } else {
            System.out.println("Não há alunos cadastrados.");
        }
    }

    public static void mostrarListaAlunos() {
        if (!Aluno.listaAlunos.isEmpty()) {
            System.out.println("Lista de alunos: ");
            for (Aluno a : listaAlunos) {
                System.out.println((listaAlunos.indexOf(a) + 1) + "- " + a.getNome() + " / Data matrícula: " +
                        a.getDataMatricula() + " / Email: " + a.getEmail() + " / Curso: " +
                        a.getCurso());
            }
        } else {
            System.out.println("Não há alunos cadastrados. \n");
        }
    }

    public static void popularAlunos() {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Luan");
        aluno1.setEmail("luanG@gmail.com");
        aluno1.setCurso("Desenvolvimento de Software");
        aluno1.setSenha("Lu!1984@");
        listaAlunos.add(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Carlos");
        aluno2.setDataMatricula(new Date());
        aluno2.setEmail("carlosS@gmail.com");
        aluno2.setCurso("Desenvolvimento de Software");
        aluno2.setSenha("carl!1984@");
        listaAlunos.add(aluno2);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Marcos");
        aluno3.setDataMatricula(new Date());
        aluno3.setEmail("marcosS@gmail.com");
        aluno3.setCurso("Desenvolvimento de Software");
        aluno3.setSenha("mark!1984@");
        listaAlunos.add(aluno3);
    }

    public static List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public static Aluno getAlunoPorEmail(String email) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getEmail().equals(email)) {
                return aluno;
            }
        }
        return null;
    }
}
