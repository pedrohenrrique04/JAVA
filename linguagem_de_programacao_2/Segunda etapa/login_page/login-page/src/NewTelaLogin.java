import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;


public class NewTelaLogin extends JFrame {

    // Atributos
    private JLabel lblTitulo;
    private JLabel lblUsuario;
    private JLabel lblSenha;
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnLogin;
    private JButton btnLimpar;

    public NewTelaLogin() {
        setTitle("Tela de Login");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Painel principal com BoxLayout vertical
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));

        // ---------- TÍTULO ----------
        lblTitulo = new JLabel("LOGIN DE USUÁRIO", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Serif", Font.BOLD, 32));
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        painel.add(lblTitulo);
        painel.add(Box.createRigidArea(new Dimension(0, 30)));

        // ---------- USUÁRIO ----------
        lblUsuario = new JLabel("Nome de usuário");
        lblUsuario.setFont(new Font("Arial", Font.BOLD, 24));
        lblUsuario.setAlignmentX(Component.CENTER_ALIGNMENT);

        txtUsuario = new JTextField();
        txtUsuario.setFont(new Font("Arial", Font.PLAIN, 18));
        txtUsuario.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        txtUsuario.setAlignmentX(Component.CENTER_ALIGNMENT);
        txtUsuario.setMargin(new Insets(5, 5, 5, 5)); // margem interna

        painel.add(lblUsuario);
        painel.add(Box.createRigidArea(new Dimension(0, 5)));
        painel.add(txtUsuario);
        painel.add(Box.createRigidArea(new Dimension(0, 15)));

        // ---------- SENHA ----------
        lblSenha = new JLabel("Senha");
        lblSenha.setFont(new Font("Arial", Font.BOLD, 24));
        lblSenha.setAlignmentX(Component.CENTER_ALIGNMENT);

        txtSenha = new JPasswordField();
        txtSenha.setFont(new Font("Arial", Font.PLAIN, 18));
        txtSenha.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        txtSenha.setAlignmentX(Component.CENTER_ALIGNMENT);
        txtSenha.setMargin(new Insets(5, 5, 5, 5));

        painel.add(lblSenha);
        painel.add(Box.createRigidArea(new Dimension(0, 5)));
        painel.add(txtSenha);
        painel.add(Box.createRigidArea(new Dimension(0, 25)));

        // ---------- BOTÕES LADO A LADO ----------
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new BoxLayout(painelBotoes, BoxLayout.X_AXIS));
        painelBotoes.setAlignmentX(Component.CENTER_ALIGNMENT);

        btnLogin = new JButton("Login");
        btnLogin.setFont(new Font("Arial", Font.BOLD, 24));

        btnLimpar = new JButton("Limpar");
        btnLimpar.setFont(new Font("Arial", Font.BOLD, 24));

        painelBotoes.add(btnLogin);
        painelBotoes.add(Box.createRigidArea(new Dimension(20, 0))); // espaçamento
        painelBotoes.add(btnLimpar);

        painel.add(painelBotoes);

        // ---------- AÇÃO DO BOTÃO LOGIN ----------
        btnLogin.addActionListener(new ActionListener() { // Cria um ouvinte de eventos de clique
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pega o texto digitado no campo de usuário
                String usuario = txtUsuario.getText();
                // Converte a senha de char[] para String
                String senha = new String(txtSenha.getPassword());

                // Verifica se usuário e senha correspondem aos valores esperados
                if (usuario.equals("admin") && senha.equals("123")) {
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                    // Aqui você poderia abrir uma nova tela, por exemplo:
                    // new TelaPrincipal().setVisible(true);
                    dispose(); // Fecha a tela de login atual
                } else {
                    // Exibe mensagem de erro se login for inválido
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
                }
            }
        });

        // ---------- AÇÃO DO BOTÃO LIMPAR ----------
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsuario.setText(""); // Limpa o campo de usuário
                txtSenha.setText("");   // Limpa o campo de senha
            }
        });

        //BOTAOO ESQUECII MINHA SENHAA!!
        JLabel linkLabel = new JLabel("<html><a href=''>Esqueceu sua senha?</a></html>");
        linkLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        linkLabel.setForeground(Color.BLUE);
        linkLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(painel);
        painel.add(linkLabel);
        setVisible(true);
        painel.add(Box.createRigidArea(new Dimension(0, 25)));
        JPanel painelLink = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelLink.add(linkLabel);
        painel.add(painelLink);
        painel.add(Box.createRigidArea(new Dimension(0, 25)));

        linkLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://support.google.com/accounts/answer/7682439?hl=pt-BR"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    public static void main(String[] args) {
        new NewTelaLogin();
    }
}