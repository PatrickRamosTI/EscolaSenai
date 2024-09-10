package com.poo.escola.entidades;

import java.util.Date;

public class Aluno  extends Pessoa{
   private Date dataMatricula;
   private String curso;
   private Situacao situacao;
   
   
public Aluno(int matricula, String cpf, Date dataNascimento, Endereco endereco, String telefone, String email,
        String senha, Date dataMatricula, String curso, Situacao situacao ) {
            
    super(matricula, cpf, dataNascimento, endereco, telefone, email, senha);
    this.dataMatricula = dataMatricula;
    this.curso = curso;
    this.situacao = situacao;
}

public Date getdataMatricula() {
    return dataMatricula;
}

public void setdataMatricula(Date dataMatricula) {
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
        return "Student{" +
                "dataMatricula, " + dataMatricula +
                ", curso='" + curso + '\'' +
                ", situacao=" + situacao.getStts() +
                '}';
     }
}