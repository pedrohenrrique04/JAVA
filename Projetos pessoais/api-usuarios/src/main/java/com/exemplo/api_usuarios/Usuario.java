package com.exemplo.api_usuarios;

public class Usuario {
    //atributos

    private String nome;
    private int idade;

    //metodos especiais
    public Usuario() {} //Construtor vazio é necessário pro Spring conseguir criar objetos a partir do JSON que o cliente envia.

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
