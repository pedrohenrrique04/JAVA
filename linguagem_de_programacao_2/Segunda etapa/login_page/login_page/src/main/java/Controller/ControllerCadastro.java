package Controller;

import Model.Autenticacao;

public class ControllerCadastro {

    public boolean cadastrar(String nome, String senha) {
        return Autenticacao.cadastrarUsuario(nome, senha);
    }

    public boolean resetarSenha(String nome, String novaSenha) {
        return Autenticacao.resetarSenha(nome, novaSenha);
    }

    public boolean autenticar(String nome, String senha) {
        return Autenticacao.autenticar(nome, senha);
    }
}
