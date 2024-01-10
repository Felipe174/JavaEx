package agenda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EcraContactos {

	private JFrame frmAgenda;
	private static JTextField txtNome;
	private static JTextField txtTelemovel;
	private static JTextField txtTelefone;
	private static JTextField txtMorada;
	private static JTextField txtEmail;
	private static JButton btnGuardar ;
	
	// array de contactos
	private static Contacto[] agenda = new Contacto[100] ;
	// regista o número de contactos
	private static int numContactos = 0 ;
	// guardar o contacto que está a ser mostrado
	private static int contactoAtual = 0 ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// dados de teste
					agenda[0] = new Contacto("Quim Tone", "965743521", "253962140", "Braga", "quimtone@gmail.com") ;
					agenda[1] = new Contacto("Aninhas", "932785642", "253698352", "Vila Verde", "aninhas@gmail.com") ;
					agenda[2] = new Contacto("Zé Naifas", "912346543", "253968574", "Guimarães", "zenaifas@gmail.com") ;
					agenda[3] = new Contacto("Isabelinha", "960985454", "253784513", "Porto", "isabelinha@gmail.com") ;
					agenda[4] = new Contacto("Nelo dos Caixões", "932145098", "253256845", "Braga", "nelocaixoes@gmail.com") ;
					numContactos = 5 ;
					
					EcraContactos window = new EcraContactos();
					window.frmAgenda.setVisible(true);
					
					mostrarContacto() ;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EcraContactos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAgenda = new JFrame();
		frmAgenda.setTitle("Agenda");
		frmAgenda.setBounds(100, 100, 780, 564);
		frmAgenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgenda.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(29, 45, 123, 37);
		frmAgenda.getContentPane().add(lblNewLabel);
		
		JLabel lblTelemvel = new JLabel("Telemóvel:");
		lblTelemvel.setFont(new Font("Arial", Font.BOLD, 18));
		lblTelemvel.setBounds(29, 126, 123, 37);
		frmAgenda.getContentPane().add(lblTelemvel);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Arial", Font.BOLD, 18));
		lblTelefone.setBounds(29, 204, 123, 37);
		frmAgenda.getContentPane().add(lblTelefone);
		
		JLabel lblMorada = new JLabel("Morada:");
		lblMorada.setFont(new Font("Arial", Font.BOLD, 18));
		lblMorada.setBounds(29, 289, 123, 37);
		frmAgenda.getContentPane().add(lblMorada);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 18));
		lblEmail.setBounds(29, 373, 123, 37);
		frmAgenda.getContentPane().add(lblEmail);
		
		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setFont(new Font("Arial", Font.PLAIN, 16));
		txtNome.setBounds(147, 45, 427, 27);
		frmAgenda.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtTelemovel = new JTextField();
		txtTelemovel.setEditable(false);
		txtTelemovel.setFont(new Font("Arial", Font.PLAIN, 16));
		txtTelemovel.setColumns(10);
		txtTelemovel.setBounds(147, 126, 210, 27);
		frmAgenda.getContentPane().add(txtTelemovel);
		
		txtTelefone = new JTextField();
		txtTelefone.setEditable(false);
		txtTelefone.setFont(new Font("Arial", Font.PLAIN, 16));
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(147, 204, 210, 27);
		frmAgenda.getContentPane().add(txtTelefone);
		
		txtMorada = new JTextField();
		txtMorada.setEditable(false);
		txtMorada.setFont(new Font("Arial", Font.PLAIN, 16));
		txtMorada.setColumns(10);
		txtMorada.setBounds(147, 289, 427, 27);
		frmAgenda.getContentPane().add(txtMorada);
		
		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		txtEmail.setColumns(10);
		txtEmail.setBounds(147, 373, 427, 27);
		frmAgenda.getContentPane().add(txtEmail);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
				txtTelemovel.setText("");
				txtTelefone.setText("");
				txtMorada.setText("");
				txtEmail.setText("");
				txtNome.setEditable(true);
				txtTelemovel.setEditable(true);
				txtTelefone.setEditable(true);
				txtMorada.setEditable(true);
				txtEmail.setEditable(true);
				btnGuardar.setEnabled(true) ;
			}
		});
		btnNovo.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNovo.setBounds(623, 96, 109, 37);
		frmAgenda.getContentPane().add(btnNovo);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setEnabled(false);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtNome.getText().equals("") && !txtTelemovel.getText().equals("")) {
					String n = txtNome.getText();
					String tlm = txtTelemovel.getText() ;
					String tlf = txtTelefone.getText() ;
					String m = txtMorada.getText();
					String em = txtEmail.getText();
					agenda[numContactos] = new Contacto(n, tlm, tlf, m, em) ;
					numContactos++ ;
				}
				txtNome.setEditable(false);
				txtTelemovel.setEditable(false);
				txtTelefone.setEditable(false);
				txtMorada.setEditable(false);
				txtEmail.setEditable(false);
				btnGuardar.setEnabled(false);
			}
		});
		btnGuardar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnGuardar.setBounds(623, 279, 109, 37);
		frmAgenda.getContentPane().add(btnGuardar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnEditar.getText().equals("Alterar")){
					agenda[contactoAtual].setTelemovel(txtTelemovel.getText());
					agenda[contactoAtual].setTelefone(txtTelefone.getText());
					agenda[contactoAtual].setMorada(txtMorada.getText());
					agenda[contactoAtual].setEmail(txtEmail.getText());
					txtTelemovel.setEditable(false);
					txtTelefone.setEditable(false);
					txtMorada.setEditable(false);
					txtEmail.setEditable(false);
					btnEditar.setText("Editar");
				}else {
					txtTelemovel.setEditable(true);
					txtTelefone.setEditable(true);
					txtMorada.setEditable(true);
					txtEmail.setEditable(true);
					btnEditar.setText("Alterar");
				}
			}
		});
		btnEditar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnEditar.setBounds(623, 179, 109, 37);
		frmAgenda.getContentPane().add(btnEditar);
		
		JButton btnPrimeiro = new JButton("<<");
		btnPrimeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contactoAtual = 0 ;
				mostrarContacto() ;
			}
		});
		btnPrimeiro.setFont(new Font("Arial", Font.BOLD, 16));
		btnPrimeiro.setBounds(46, 451, 109, 37);
		frmAgenda.getContentPane().add(btnPrimeiro);
		
		JButton btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contactoAtual > 0) {
					contactoAtual-- ;
					mostrarContacto() ;
				}
			}
		});
		btnAnterior.setFont(new Font("Arial", Font.BOLD, 16));
		btnAnterior.setBounds(193, 451, 109, 37);
		frmAgenda.getContentPane().add(btnAnterior);
		
		JButton btnProximo = new JButton(">");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (contactoAtual < numContactos - 1) {
					contactoAtual++ ;
					mostrarContacto() ;
				}
			}
		});
		btnProximo.setFont(new Font("Arial", Font.BOLD, 16));
		btnProximo.setBounds(348, 451, 109, 37);
		frmAgenda.getContentPane().add(btnProximo);
		
		JButton btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contactoAtual = numContactos - 1 ;
				mostrarContacto() ;
			}
		});
		btnUltimo.setFont(new Font("Arial", Font.BOLD, 16));
		btnUltimo.setBounds(501, 451, 109, 37);
		frmAgenda.getContentPane().add(btnUltimo);
		
		JButton btnSair_1 = new JButton("Sair");
		btnSair_1.setFont(new Font("Arial", Font.PLAIN, 16));
		btnSair_1.setBounds(623, 382, 109, 37);
		frmAgenda.getContentPane().add(btnSair_1);
	}
	
	public static void mostrarContacto() {
		txtNome.setText(agenda[contactoAtual].getNome()) ;
		txtTelemovel.setText(agenda[contactoAtual].getTelemovel()) ;
		txtTelefone.setText(agenda[contactoAtual].getTelefone()) ;
		txtMorada.setText(agenda[contactoAtual].getMorada()) ;
		txtEmail.setText(agenda[contactoAtual].getEmail()) ;
	}
}
