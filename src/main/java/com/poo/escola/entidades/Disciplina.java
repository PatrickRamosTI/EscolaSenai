package com.poo.escola.entidades;

public class Disciplina {
    private String nomeDisciplina;
    private Notas nota;
    private Professor professor;
    
    public Disciplina(String nomeDisciplina, Notas nota, Professor professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.nota = nota;
        this.professor = professor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Notas getNota() {
        return nota;
    }

    public void setNota(Notas nota) {
        this.nota = nota;
    }

    public Professor getProfessor() {
        return professor;
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
         }
    }