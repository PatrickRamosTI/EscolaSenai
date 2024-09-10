package com.poo.escola.entidades;

import java.util.Date;

public abstract class Pessoa {
    public int contMatricula = 1001;
    
    private int matricula;
    private String cpf;
    private String nome;
    private Date dataNascimento;
    private Endereco endereco;
    private String telefone;
    private String email;
    private String senha;

    public Pessoa(int matricula, String cpf, Date dataNascimento, Endereco endereco, String telefone, String email,
            String senha) {
        this.matricula = contMatricula;
        contMatricula++;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public Pessoa() {
        this.matricula = contMatricula;
        contMatricula++;
    }

    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf == null || cpf.isEmpty() || !isValidCpf(cpf)){
            System.out.println("Numero de cpf invalido!");
        }else {
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
        if (senha == null || senha.isEmpty() || !isValidPassword(senha)){
            System.out.println("Senha invalida! .");
        }else {
        this.senha = senha;
        }
    }

    private boolean isValidCpf(String cpf){
        if(cpf.length() != 11){
            return false;
        }else{
            return true;
        }
    }

    private boolean isValidPassword(String senha){
        if (senha.length() < 8){
            return false;
        }else {
            return true;
        }

    }

    @Override
    public String toString() {
        return 
        "Pessoa [contMatricula=" + contMatricula + 
        ", matricula=" + matricula + ", cpf=" + cpf + 
        ", nome=" + nome + 
        ", dataNascimento=" + dataNascimento + 
        ", endereco=" + endereco + 
        ", telefone=" + telefone + 
        ", email=" + email + 
        ", senha=" + senha + "]";
        
    }
}