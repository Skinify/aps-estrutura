package br.aps;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa acompanhante = null;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.acompanhante = null;
    }

    public Pessoa(String nome, int idade, Pessoa acompanhante){
        this.nome = nome;
        this.idade = idade;
        this.acompanhante = acompanhante;
    }

    public String getName(){
        return this.nome;
    }

    public int getIdade(){
        return idade;
    }

    public Pessoa getAcompanhante(){
        return acompanhante;
    }

}