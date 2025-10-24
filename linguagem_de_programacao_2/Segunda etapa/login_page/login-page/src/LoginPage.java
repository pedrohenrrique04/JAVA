import javax.swing.*;  // Importa todos os componentes gráficos do Swing (JFrame, JButton, JLabel, etc.)
import java.awt.*;     // Importa classes de layout e fontes
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // Importa interface para tratar eventos de clique nos botões

// Classe principal da tela de login. Herda de JFrame para criar uma janela
class TelaLoginAtual extends JFrame{

//atributos
    private JLabel lblTitulo;
    private JLabel lblUsuario;
    private JLabel lblSenha;
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnLogin;
    private JButton btnLimpar;

    // Construtor da classe, onde a janela e os componentes são configurados
    public TelaLoginAtual() {
        setTitle("Tela de Login");                   // Define o título da janela
        setSize(1000, 800);                           // Define largura e altura da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao clicar no X
        setLocationRelativeTo(null);                 // Centraliza a janela na tela
            setResizable(false);                         // Impede redimensionamento manual

        // Cria um painel para organizar os componentes visuais
        JPanel painel = new JPanel();
        painel.setLayout(null); // Define layout absoluto → posicionamento manual com setBounds()

        // ---------- TÍTULO ----------
        lblTitulo = new JLabel("Acesso ao Sistema", SwingConstants.CENTER); // Texto centralizado
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18)); // Define fonte e estilo
        lblTitulo.setBounds(50, 10, 250, 30); // Define posição (x, y) e tamanho (largura, altura)
        painel.add(lblTitulo); // Adiciona o rótulo de título ao painel

        // ---------- USUÁRIO ----------
        lblUsuario = new JLabel("Usuário:");         // Cria rótulo "Usuário"
        lblUsuario.setBounds(40, 60, 80, 25);        // Define posição e tamanho
        painel.add(lblUsuario);                      // Adiciona rótulo ao painel

        txtUsuario = new JTextField();               // Campo de texto para digitar o nome de usuário
        txtUsuario.setBounds(120, 60, 160, 25);      // Define posição e tamanho
        painel.add(txtUsuario);                      // Adiciona campo ao painel

        // ---------- SENHA ----------
        lblSenha = new JLabel("Senha:");             // Cria rótulo "Senha"
        lblSenha.setBounds(40, 95, 80, 25);          // Define posição e tamanho
        painel.add(lblSenha);                        // Adiciona rótulo ao painel

        txtSenha = new JPasswordField();             // Campo próprio para senha (mascara os caracteres)
        txtSenha.setBounds(120, 95, 160, 25);        // Define posição e tamanho
        painel.add(txtSenha);                        // Adiciona campo de senha ao painel

        // ---------- BOTÃO LOGIN ----------
        btnLogin = new JButton("Login");            // Cria botão com texto "Login"
        btnLogin.setBounds(80, 140, 80, 25);        // Define posição e tamanho
        painel.add(btnLogin);                       // Adiciona botão ao painel

        // ---------- BOTÃO LIMPAR ----------
        btnLimpar = new JButton("Limpar");          // Cria botão com texto "Limpar"
        btnLimpar.setBounds(180, 140, 80, 25);      // Define posição e tamanho
        painel.add(btnLimpar);                      // Adiciona botão ao painel

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

        // Adiciona o painel com todos os componentes à janela
        add(painel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaLoginAtual();
    }
}