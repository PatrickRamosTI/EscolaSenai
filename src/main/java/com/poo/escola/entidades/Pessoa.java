package com.poo.escola.entidade;

import java.util.Date;

public abstract class Pessoa {
    public static int contMatricula = 1001;

    // Atributos da classe pai
    private int matricula;
    private String cpf;
    private String nome;
    private Date dataNascimento;
    private Endereco endereco;
    private String telefone;
    private String email;
    private String senha;

    public Pessoa(String cpf, String nome, Date dataNascimento, Endereco endereco, String telefone, String email, String senha) {
        this.matricula = contMatricula++;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public Pessoa() {
        this.matricula = contMatricula++;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isEmpty() || !isValidCpf(cpf)) {
            System.out.println("Número de CPF inválido!");
        } else {
            this.cpf = cpf;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.isEmpty() || !isValidPassword(senha)) {
            System.out.println("Senha inválida.");
        } else {
            this.senha = senha;
        }
    }

    private boolean isValidCpf(String cpf) {
        return cpf.length() == 11;
    }

    private boolean isValidPassword(String senha) {
        return senha.length() >= 8;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "matricula=" + matricula +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco=" + endereco +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
