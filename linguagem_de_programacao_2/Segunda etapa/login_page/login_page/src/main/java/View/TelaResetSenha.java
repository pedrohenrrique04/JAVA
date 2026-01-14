package View;

import Controller.ControllerCadastro;
import javax.swing.*;
import java.awt.*;

public class TelaResetSenha extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtNovaSenha;
    private JButton btnResetar;
    private JButton btnVoltar;
    private ControllerCadastro controller;

    public TelaResetSenha() {
        controller = new ControllerCadastro();

        setTitle("Resetar Senha");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        JLabel lblTitulo = new JLabel("Resetar Senha", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Serif", Font.BOLD, 28));
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        painel.add(lblTitulo);
        painel.add(Box.createRigidArea(new Dimension(0, 20)));

        JLabel lblUsuario = new JLabel("Nome de usuário:");
        txtUsuario = new JTextField();
        painel.add(lblUsuario);
        painel.add(txtUsuario);

        JLabel lblNovaSenha = new JLabel("Nova senha:");
        txtNovaSenha = new JPasswordField();
        painel.add(lblNovaSenha);
        painel.add(txtNovaSenha);

        painel.add(Box.createRigidArea(new Dimension(0, 20)));

        btnResetar = new JButton("Alterar senha");
        btnVoltar = new JButton("Voltar");

        btnResetar.addActionListener(e -> {
            String nome = txtUsuario.getText();
            String novaSenha = new String(txtNovaSenha.getPassword());

            if (controller.resetarSenha(nome, novaSenha)) {
                JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
            }
        });

        btnVoltar.addActionListener(e -> dispose());

        JPanel botoes = new JPanel();
        botoes.add(btnResetar);
        botoes.add(btnVoltar);
        painel.add(botoes);

        add(painel);
        setVisible(true);
    }
}
