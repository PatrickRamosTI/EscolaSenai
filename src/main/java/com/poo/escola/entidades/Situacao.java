package com.poo.escola.enuns;

public enum Situacao {
    APROVADO("APROVADO"),
    REPROVADO("REPORVADO!"),
    EM_RECUPERACAO("EM_RECUPERACAO");

    private final String stts;

    Situacao(String stts) {
        this.stts = stts;
    }

    public String getStts() {
        return stts;
    }
}
