package Model;

import java.util.ArrayList;

public class Autenticacao {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    static {
        // Usuário padrão
        usuarios.add(new Usuario("admin", "123"));
    }

    public static boolean autenticar(String nome, String senha) {
        for (Usuario u : usuarios) {
            if (u.getNomeUsuario().equals(nome) && u.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public static boolean cadastrarUsuario(String nome, String senha) {
        for (Usuario u : usuarios) {
            if (u.getNomeUsuario().equals(nome)) {
                return false; // Já existe
            }
        }
        usuarios.add(new Usuario(nome, senha));
        return true;
    }

    public static boolean resetarSenha(String nome, String novaSenha) {
        for (Usuario u : usuarios) {
            if (u.getNomeUsuario().equals(nome)) {
                u.setSenha(novaSenha);
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
