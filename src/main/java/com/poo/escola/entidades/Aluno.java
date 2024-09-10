package com.poo.escola.entidades;

import java.util.Date;

public class Aluno  extends Pessoa{
   private Date DataMatricula;
   private String curso;
   private Situacao situacao;
   
public Aluno(int matricula, String cpf, Date dataNascimento, Endereco endereco, String telefone, String email,
        String senha, Date dataMatricula, String curso, Situacao situacao ) {
            
    super(matricula, cpf, dataNascimento, endereco, telefone, email, senha);
    this.DataMatricula = dataMatricula;
    this.curso = curso;
    this.situacao = situacao;
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

public Situacao  getNota() {
    return situacao;
}

public void setNota(Situacao situacao) {
    this.situacao  =situacao;
    }
 }