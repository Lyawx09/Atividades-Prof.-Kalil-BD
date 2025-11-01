import javax.swing.*;

public class Teste extends JFrame{

    private JButton btnInserir, btnAlterar;
    private JTextField txtNome, txtAntigo, txtNovo;
    private JLabel lblNome, lblAntigo, lblNovo;
    public Conexao conexao;
    public Teste(){
        //INSERIR NOME

        setTitle("- GERENCIADOR DE NOMES -");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        //INCLUIR NOME

        lblNome = new JLabel("Digite o nome: ");
        lblNome.setBounds(5, 15, 150, 30);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(100, 15, 100, 30);
        add(txtNome);

        btnInserir = new JButton("Inserir");
        btnInserir.setBounds(220, 15, 80, 30);
        btnInserir.addActionListener(e ->{
            String nome = txtNome.getText();
            conexao.inserir(nome);
            txtNome.setText("");
        });
        add(btnInserir);

        setVisible(true);




    }

    public static void main(String[] args) {
        new Teste();
    }

}

