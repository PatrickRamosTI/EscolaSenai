package com.poo.escola.entidades;

import java.util.Date;

public class Aluno  extends Pessoa{
   private Date DataMatricula;
   private String curso;
   private Notas nota;
   
public Aluno(int matricula, String cpf, Date dataNascimento, Endereco endereco, String telefone, String email,
        String senha, Date dataMatricula, String curso, Notas nota) {
    super(matricula, cpf, dataNascimento, endereco, telefone, email, senha);
    DataMatricula = dataMatricula;
    this.curso = curso;
    this.nota = nota;
}

public Date getDataMatricula() {
    return DataMatricula;
}

public void setDataMatricula(Date dataMatricula) {
    DataMatricula = dataMatricula;
}

public String getCurso() {
    return curso;
}

public void setCurso(String curso) {
    this.curso = curso;
}

public Notas getNota() {
    return nota;
}

public void setNota(Notas nota) {
    this.nota = nota;
}

    }