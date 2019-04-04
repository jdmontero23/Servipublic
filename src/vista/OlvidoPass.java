package vista;

import java.awt.HeadlessException;
//import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import modelo.UsuariosSQL;

public class OlvidoPass extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel et_numDocu;
	private JTextField tf_numDocu;
	private JButton botonBuscar;
	private JLabel et_password;
	private JPasswordField tf_password;
	private JLabel et_conPassword;
	private JPasswordField tf_conPassword;
	private JButton nuevaContrase;

	public OlvidoPass() {
		super();
		configurarVentana();
		inicializarComponentes();

		botonBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				UsuariosSQL modSql = new UsuariosSQL();
				if (tf_numDocu.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Por Favor Digite El Numero de Documento");
				} else {
						try {
							if (modSql.existeUsuario(tf_numDocu.getText()) == 1) {
								et_password.setEnabled(true);
								et_password.setEnabled(true);
								tf_password.setEnabled(true);
								et_conPassword.setEnabled(true);
								et_conPassword.setEnabled(true);
								tf_conPassword.setEnabled(true);
								nuevaContrase.setEnabled(true);
							} else {
								JOptionPane.showMessageDialog(null, "El usuario no existe");
							}
						} catch (HeadlessException e1) {
							e1.printStackTrace();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
				}
			}
		});

		nuevaContrase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String pass = new String(tf_password.getPassword());
				String conPass = new String(tf_conPassword.getPassword());
				
				if (!pass.equals("") && !conPass.equals("")) {
					if (pass.equals(conPass)) {
						JOptionPane.showMessageDialog(null, "CLAVE MODIFICADA DE MANERA CORECTA");
						Inicio inicio = new Inicio();
						//inicio.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "CLAVES DIFERENTES");
						tf_password.setText("");
						tf_conPassword.setText("");
					}
				}else{
					JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE LA CONTRASEÑA NUEVA");
					tf_password.setText("");
					tf_conPassword.setText("");
				}
			}
		});

	}

	private void configurarVentana() {
		this.setTitle("OLVIDO CONTRASEÑA");
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	private void inicializarComponentes() {
		// creamos los componentes
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		et_numDocu = new JLabel();
		tf_numDocu = new JTextField();
		botonBuscar = new JButton("BUSCAR USUARIO");
		et_password = new JLabel();
		tf_password = new JPasswordField();
		et_conPassword = new JLabel();
		tf_conPassword = new JPasswordField();
		nuevaContrase = new JButton("CONFIRMAR");
		// configuramos los componentes
		label1.setText("¿Tienes Problemas para iniciar sesión?");
		label1.setBounds(140, 20, 250, 25);
		label2.setText("Ingresa tu numero de Documento");
		label2.setBounds(170, 50, 250, 25);
		label3.setText("y te buscaremos en nuestra base de personas");
		label3.setBounds(120, 65, 300, 25);
		label4.setText("para que puedas recuperar tu cuenta");
		label4.setBounds(150, 80, 250, 25);
		et_numDocu.setText("Numero Documento");
		et_numDocu.setBounds(200, 120, 150, 25);
		tf_numDocu.setBounds(160, 150, 200, 25);
		botonBuscar.setBounds(190, 180, 140, 20);
		et_password.setText("Contraseña");
		et_password.setBounds(220, 220, 100, 25);
		tf_password.setBounds(160, 240, 200, 25);
		et_conPassword.setText("Confirme Contraseña");
		et_conPassword.setBounds(195, 260, 150, 25);
		tf_conPassword.setBounds(160, 280, 200, 25);
		nuevaContrase.setBounds(200, 310, 120, 20);
		et_password.setEnabled(false);
		et_password.setEnabled(false);
		tf_password.setEnabled(false);
		et_conPassword.setEnabled(false);
		et_conPassword.setEnabled(false);
		tf_conPassword.setEnabled(false);
		nuevaContrase.setEnabled(false);
		// adicionamos los componentes a la ventana
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(et_numDocu);
		this.add(tf_numDocu);
		this.add(botonBuscar);
		this.add(et_password);
		this.add(tf_password);
		this.add(et_conPassword);
		this.add(tf_conPassword);
		this.add(nuevaContrase);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
