package com.poo.escola.entidade;

import java.util.*;

public class Secretaria extends Pessoa {
   
    public static List<Secretaria> secretarios = new ArrayList<Secretaria>();

    public static void menuSecretarioAluno() {
        int opcaoS = 8;

        do {
            System.out.println("\n- MENU -");
            System.out.println("O que você deseja fazer?");
            System.out.println("1- Cadastrar novo aluno");
            System.out.println("2- Atualizar aluno");
            System.out.println("3- Excluir aluno");
            System.out.println("4- Listar alunos");
            System.out.println("0- Sair\n");
            System.out.print("Digite uma opção: ");
            Scanner sc = new Scanner(System.in);
            try {
                opcaoS = sc.nextInt();
                System.out.println("\n");
                switch (opcaoS) {
                    case 1:
                        Aluno.cadastrarAluno();
                        break;
                    case 2:
                        Aluno.atualizarAluno();
                        break;
                    case 3:
                        Aluno.removerAluno();
                        break;
                    case 4:
                        Aluno.mostrarListaAlunos();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número inteiro!");
            }
        } while (opcaoS != 0);
    }

    public static void menuSecretarioProfessor() {
        int opcaoT = 8;

        do {
            System.out.println("\n- MENU -");
            System.out.println("O que você deseja fazer?");
            System.out.println("1- Cadastrar novo professor");
            System.out.println("2- Atualizar professor");
            System.out.println("3- Excluir professor");
            System.out.println("4- Listar professores");
            System.out.println("0- Sair\n");
            System.out.print("Digite uma opção: ");
            Scanner sc = new Scanner(System.in);
            try {
                opcaoT = sc.nextInt();
                System.out.println("\n");
                switch (opcaoT) {
                    case 1:
                        Professor.cadastrarProfessor();
                        break;
                    case 2:
                        Professor.atualizarProfessor();
                        break;
                    case 3:
                        Professor.removerProfessor();
                        break;
                    case 4:
                        Professor.mostrarListaProfessores();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um número inteiro!");
            }
        } while (opcaoT != 0);
    }

    public static void semearSecretario() {
        Secretaria secretario1 = new Secretaria();
        secretario1.setEmail("sc@gmail.com");
        secretario1.setSenha("Sc@!1973");
        secretarios.add(secretario1);
    }

    public static List<Secretaria> getSecretarios() {
        return secretarios;
    }
}
