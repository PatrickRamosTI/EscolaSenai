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


}