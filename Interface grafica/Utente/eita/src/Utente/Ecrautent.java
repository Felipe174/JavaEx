package Utente;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ecrautent {

	private JFrame frmUte;
	private static JTextField txtCartao;
	private static JTextField txtNome;
	private static JTextField txtData;
	private static JTextField txtRendimento;

	// array de Utentes
	private static Utente[] ute = new Utente[20] ;
	private static int numUtentes = 0 ;
	
	private static int utenteAtual = 0 ;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					// dados de teste
					ute[0] = new Utente("33D3432G","Rodrigao","esses dias",23) ;
					ute[1] = new Utente("34HG56EU","Ney","2 de dezembro",321) ;
					numUtentes = 2 ;
					
					Ecrautent window = new Ecrautent();
					window.frmUte.setVisible(true);
					
					mostrarUtente();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ecrautent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUte = new JFrame();
		frmUte.setBounds(100, 100, 517, 430);
		frmUte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUte.getContentPane().setLayout(null);
		
		txtCartao = new JTextField();
		txtCartao.setEditable(false);
		txtCartao.setBounds(36, 115, 293, 20);
		frmUte.getContentPane().add(txtCartao);
		txtCartao.setColumns(10);
		
		txtData = new JTextField();
		txtData.setEditable(false);
		txtData.setBounds(36, 228, 293, 20);
		frmUte.getContentPane().add(txtData);
		txtData.setColumns(10);
		
		txtRendimento = new JTextField();
		txtRendimento.setEditable(false);
		txtRendimento.setBounds(36, 296, 293, 20);
		frmUte.getContentPane().add(txtRendimento);
		txtRendimento.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblNome.setBounds(36, 146, 210, 14);
		frmUte.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setColumns(10);
		txtNome.setBounds(36, 171, 293, 20);
		frmUte.getContentPane().add(txtNome);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (utenteAtual > 0) {
					utenteAtual-- ;
					mostrarUtente() ;
				}
			}
		});
		btnAnterior.setBounds(10, 348, 89, 23);
		frmUte.getContentPane().add(btnAnterior);
		
		
		JButton btnProximo = new JButton("Proximo");
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (utenteAtual < numUtentes - 1) {
					utenteAtual++ ;
					mostrarUtente() ;
				}
			}
		});
		btnProximo.setBounds(121, 348, 89, 23);
		frmUte.getContentPane().add(btnProximo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtCartao.getText().equals("") && !txtNome.getText().equals("")) {
					String c = txtCartao.getText();
					String n = txtNome.getText();
					String d = txtData.getText() ;
					double r = Double.valueOf(txtRendimento.getText()) ;
					ute[numUtentes] = new Utente(c,n,d,r) ;
					numUtentes++ ;
			}
				txtCartao.setEditable(false);
				txtNome.setEditable(false);
				txtData.setEditable(false);
				txtRendimento.setEditable(false);
			}
		});
		btnGuardar.setBounds(381, 348, 89, 23);
		frmUte.getContentPane().add(btnGuardar);
		
		JLabel lblNewLabel = new JLabel("Rendimento");
		lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblNewLabel.setBounds(36, 271, 124, 14);
		frmUte.getContentPane().add(lblNewLabel);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblDataDeNascimento.setBounds(36, 203, 210, 14);
		frmUte.getContentPane().add(lblDataDeNascimento);
		
		JLabel lblCartoCidado = new JLabel("Cartão Cidadão");
		lblCartoCidado.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblCartoCidado.setBounds(36, 90, 210, 14);
		frmUte.getContentPane().add(lblCartoCidado);
		
		JLabel lblNewLabel_1 = new JLabel("Utente");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNewLabel_1.setBounds(36, 11, 79, 68);
		frmUte.getContentPane().add(lblNewLabel_1);
		
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCartao.setText("");
				txtNome.setText("");
				txtData.setText("");
				txtRendimento.setText("");
				txtCartao.setEditable(true);
				txtNome.setEditable(true);
				txtData.setEditable(true);
				txtRendimento.setEditable(true);
			}
		});
		btnNovo.setBounds(275, 348, 89, 23);
		frmUte.getContentPane().add(btnNovo);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUte.dispose();
			}
		});
		btnSair.setBounds(425, 22, 66, 23);
		frmUte.getContentPane().add(btnSair);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnEditar.getText().equals("Alterar")){
					ute[utenteAtual].setCartao(txtCartao.getText());
					ute[utenteAtual].setNome(txtNome.getText());
					ute[utenteAtual].setData(txtData.getText());
					ute[utenteAtual].setRendimento(Double.valueOf(txtRendimento.getText()));
					txtCartao.setEditable(false);
					txtNome.setEditable(false);
					txtData.setEditable(false);
					txtRendimento.setEditable(false);
					btnEditar.setText("Editar");
					btnGuardar.setEnabled(true);
				}else {
					txtCartao.setEditable(true);
					txtNome.setEditable(true);
					txtData.setEditable(true);
					txtRendimento.setEditable(true);
					btnEditar.setText("Alterar");
					btnGuardar.setEnabled(false);
			}
			}
		});
		btnEditar.setBounds(391, 295, 79, 23);
		frmUte.getContentPane().add(btnEditar);
		
	}
		public static void mostrarUtente() {
			txtCartao.setText(ute[utenteAtual].getCartao()) ;
			txtNome.setText(ute[utenteAtual].getNome()) ;
			txtData.setText(ute[utenteAtual].getData()) ;
			txtRendimento.setText(Double.toString(ute[utenteAtual].getRendimento())) ;
		}
	}

