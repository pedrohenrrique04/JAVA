package View;

import Controller.ControllerCadastro;
import javax.swing.*;
import java.awt.*;

public class TelaCadastro extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnCadastrar;
    private JButton btnVoltar;
    private ControllerCadastro controller;

    public TelaCadastro() {
        controller = new ControllerCadastro();

        setTitle("Cadastro de Usuário");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        JLabel lblTitulo = new JLabel("Cadastro", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Serif", Font.BOLD, 28));
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        painel.add(lblTitulo);
        painel.add(Box.createRigidArea(new Dimension(0, 20)));

        JLabel lblUsuario = new JLabel("Nome de usuário:");
        txtUsuario = new JTextField();
        painel.add(lblUsuario);
        painel.add(txtUsuario);

        JLabel lblSenha = new JLabel("Senha:");
        txtSenha = new JPasswordField();
        painel.add(lblSenha);
        painel.add(txtSenha);

        painel.add(Box.createRigidArea(new Dimension(0, 20)));

        btnCadastrar = new JButton("Cadastrar");
        btnVoltar = new JButton("Voltar");

        btnCadastrar.addActionListener(e -> {
            String nome = txtUsuario.getText();
            String senha = new String(txtSenha.getPassword());

            if (controller.cadastrar(nome, senha)) {
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário já existe!");
            }
        });

        btnVoltar.addActionListener(e -> dispose());

        JPanel botoes = new JPanel();
        botoes.add(btnCadastrar);
        botoes.add(btnVoltar);
        painel.add(botoes);

        add(painel);
        setVisible(true);
    }
}
