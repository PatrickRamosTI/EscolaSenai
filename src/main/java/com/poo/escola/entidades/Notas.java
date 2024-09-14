package com.poo.escola.entidade;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Nota {
    private Double nota;
    private Aluno aluno;
    private Disciplina disciplina;

    public static List<Nota> listaNotas = new ArrayList<Nota>();

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public static List<Nota> getListaNotas() {
        return listaNotas;
    }

    public static void salvarNotasEmArquivo() {
        File arquivo = new File("notas.txt");
        System.out.println("Salvando notas no arquivo: " + arquivo.getAbsolutePath());
        if (!arquivo.canWrite()) {
            System.out.println("Sem permissão de escrita no arquivo. Tentando conceder permissão...");
            arquivo.setWritable(true); // Concede permissão de escrita ao arquivo
        }
        if (arquivo.exists()) {
            arquivo.delete(); // Deleta o arquivo se ele já existir
        }
        try {
            arquivo.createNewFile(); // Cria um novo arquivo
        } catch (IOException e) {
            System.err.println("Erro ao criar o novo arquivo: " + e.getMessage());
            return; // Sai do método se houver um erro ao criar o arquivo
        }
        try (FileWriter escritor = new FileWriter("notas.txt", true)) {
            for (Nota nota : listaNotas) {
                escritor.write(nota.getAluno().getEmail() + "," + nota.getDisciplina().getNomeDisciplina() + "," + nota.getNota() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void carregarNotasDeArquivo() {
        File arquivo = new File("notas.txt");
        if (!arquivo.exists()) {
            System.out.println("Arquivo não encontrado: " + arquivo.getAbsolutePath());
            return;
        }

        listaNotas.clear(); // Limpa a lista antes de carregar novos dados

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo.getAbsolutePath()))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                processarLinha(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    private static void processarLinha(String linha) {
        String[] partes = linha.split(",");
        if (partes.length != 3) {
            System.out.println("Formato de linha inválido: " + linha);
            return;
        }

        Aluno aluno = Aluno.getAlunoPorEmail(partes[0]);
        Disciplina disciplina = Disciplina.getDisciplinaPorNome(partes[1]);

        if (aluno != null && disciplina != null) {
            try {
                Double nota = Double.parseDouble(partes[2]);
                Nota notaObjeto = new Nota();
                notaObjeto.setAluno(aluno);
                notaObjeto.setDisciplina(disciplina);
                notaObjeto.setNota(nota);
                aluno.adicionarNota(notaObjeto);
                disciplina.adicionarNota(notaObjeto);
                Nota.getListaNotas().add(notaObjeto);
            } catch (NumberFormatException e) {
                System.out.println("Formato de nota inválido: " + partes[2]);
            }
        } else {
            System.out.println("Erro ao carregar nota: Aluno ou disciplina não encontrado");
        }
    }
}
