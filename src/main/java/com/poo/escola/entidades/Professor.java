package com.poo.escola.entidades;

import java.util.Date;

public class Professor extends Pessoa {
    private Date dataAdmissao;
    private double salario;

    public Professor(int matricula, String cpf, Date dataNascimento, Endereco endereco, String telefone, String email,
            String senha, Date dataAdmissao, double salario) {
        super(matricula, cpf, dataNascimento, endereco, telefone, email, senha);
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
