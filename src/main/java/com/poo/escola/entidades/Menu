package com.poo.escola.entidade;

import com.poo.escola.enuns.Situacao;

import java.util.*;

public class Menu {
    private static Situacao situacao;
    private static String usuarioLogado = null;
    private static String papelUsuario = null;

    public static void imprimirRegistro(String usuarioLogado) {
        Aluno aluno = Aluno.getAlunoPorEmail(usuarioLogado);

        if (aluno != null) {
            System.out.println("Registro do Aluno: ");
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Email: " + aluno.getEmail());

            Nota.carregarNotasDeArquivo(); // Supondo que o método correto seja este

            List<Nota> notasDoAluno = new ArrayList<>();
            for (Nota nota : Nota.getListaNotas()) {
                if (nota.getAluno().equals(aluno)) {
                    notasDoAluno.add(nota);
                }
            }

            if (!notasDoAluno.isEmpty()) {
                Situacao situacao = Situacao.EM_RECUPERACAO;
                for (Nota nota : notasDoAluno) {
                    if (nota.getNota() >= 6) {
                        situacao = Situacao.APROVADO;
                        break;
                    } else if (nota.getNota() < 3) {
                        situacao = Situacao.REPROVADO;
                        break;
                    }
                }
                System.out.println("Situação: " + situacao.getStts());
                System.out.println("Notas: ");
                for (Nota nota : notasDoAluno) {
                    System.out.println("Disciplina: " + nota.getDisciplina().getNomeDisciplina());
                    System.out.println("Nota: " + nota.getNota());
                }
            } else {
                System.out.println("Nenhuma nota encontrada.");
            }
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Bem-vindo ao sistema, entre com seu login --");
        System.out.print("Email: ");
        String emailUsuario = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        boolean usuarioValido = false;

        for (Secretaria s : Secretaria.getSecretarios()) {
            if (emailUsuario.equals(s.getEmail()) && senha.equals(s.getSenha())) {
                usuarioLogado = emailUsuario;
                papelUsuario = "Secretária";
                System.out.println("Login realizado com sucesso. (Secretária)!");
                usuarioValido = true;
                break;
            }
        }
        if (!usuarioValido) {
            for (Professor t : Professor.getListaProfessores()) {
                if (emailUsuario.equals(t.getEmail()) && senha.equals(t.getSenha())) {
                    usuarioLogado = emailUsuario;
                    papelUsuario = "Professor";
                    System.out.println("Login realizado com sucesso. (Professor)!");
                    usuarioValido = true;
                    break;
                }
            }
        }
        if (!usuarioValido) {
            for (Aluno sT : Aluno.getListaAlunos()) {
                if (emailUsuario.equals(sT.getEmail()) && senha.equals(sT.getSenha())) {
                    usuarioLogado = emailUsuario;
                    papelUsuario = "Aluno";
                    System.out.println("Login realizado com sucesso. (Aluno)!");
                    usuarioValido = true;
                    break;
                }
            }
        }

        if (!usuarioValido) {
            System.out.println("Email ou senha inválidos. Tente novamente");
            login();
        }
    }

    public static void menuFinal() {
        if (usuarioLogado == null) {
            System.out.println("Você precisa fazer login primeiro.");
            login();
        }

        int opcaoM;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n- MENU -");
            System.out.println("O que você deseja fazer?");
            switch (papelUsuario) {
                case "Secretária":
                    System.out.println("1- Menu Aluno.");
                    System.out.println("2- Menu Professor:");
                    break;
                case "Professor":
                    System.out.println("1- Lançar notas");
                    break;
                case "Aluno":
                    System.out.println("1- Meu boletim");
                    break;
            }
            System.out.println("0- Sair\n");
            System.out.print("Digite uma opção: ");
            opcaoM = sc.nextInt();
            try {
                System.out.println("\n");
                switch (opcaoM) {
                    case 1:
                        if (papelUsuario.equals("Secretária")) {
                            Secretaria.menuSecretarioAluno();
                        } else if (papelUsuario.equals("Professor")) {
                            Professor.registrarNotas();
                        } else if (papelUsuario.equals("Aluno")) {
                            imprimirRegistro(usuarioLogado);
                        }
                        break;
                    case 2:
                        if (papelUsuario.equals("Secretária")) {
                            Secretaria.menuSecretarioProfessor();
                        } else {
                            System.out.println("Opção não disponível.");
                        }
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        usuarioLogado = null;
                        papelUsuario = null;
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro!");
                sc.next(); // Limpar o buffer do scanner
            }
        } while (opcaoM != 0);
    }
}
