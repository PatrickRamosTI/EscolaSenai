package com.poo.escola.entidades;

public class Notas {
    private int nota;
    private Aluno alunos;
    private Disciplina disciplina;
    
    public Notas(int nota, Aluno alunos, Disciplina disciplina) {
        this.nota = nota;
        this.alunos = alunos;
        this.disciplina = disciplina;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Aluno getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno alunos) {
        this.alunos = alunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}