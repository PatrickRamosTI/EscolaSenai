package com.poo.escola.entidades;

public enum Situacao {
    APROVADO("Aprovado"),
    REPROVADO("Reprovado"),
    RECUPERACAO("Recuperacao");

    private final String stts;
    
    Situacao(String stts){
        this.stts =stts;
    }
    public String getStts() {
        return stts;
    }  
}
