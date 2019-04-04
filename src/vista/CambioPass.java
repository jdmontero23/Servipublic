package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class CambioPass extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JLabel label1;
	private JLabel et_passActual;
	private JPasswordField tf_passActual;
	private JLabel et_password;
	private JPasswordField tf_password;
	private JLabel et_conPassword;
	private JPasswordField tf_conPassword;
	private JButton nuevaContrase;
	private JButton canNuePass;

	public CambioPass() {
		super();
		configurarVentana();
		inicializarComponentes();

		nuevaContrase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String actuPass = new String(tf_passActual.getPassword());
				String pass = new String(tf_password.getPassword());
				String conPass = new String(tf_conPassword.getPassword());
				if (actuPass.equals(pass)) {
					JOptionPane.showMessageDialog(null, "CLAVE NUEVA DEBE SER DIFERENTE A CLAVE ACTUAL");
					tf_passActual.setText("");
					tf_password.setText("");
					tf_conPassword.setText("");
				} else {
					if (pass.equals(conPass)) {
						JOptionPane.showMessageDialog(null, "CLAVE MODIFICADA DE MANERA CORECTA");
					} else {
						JOptionPane.showMessageDialog(null, "CLAVE INVALIDA");
						tf_passActual.setText("");
						tf_password.setText("");
						tf_conPassword.setText("");
					}
				}
			}
		});
		
		canNuePass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

	}

	private void configurarVentana() {
		this.setTitle("CAMBIO CONTRASEÑA");
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		///this.getContentPane().setBackground(Color.GRAY);

	}

	private void inicializarComponentes() {
		// creamos los componentes
		label1 = new JLabel();
		et_passActual = new JLabel();
		tf_passActual = new JPasswordField();
		et_password = new JLabel();
		tf_password = new JPasswordField();
		et_conPassword = new JLabel();
		tf_conPassword = new JPasswordField();
		nuevaContrase = new JButton("CONFIRMAR");
		canNuePass = new JButton("CANCELAR");
		// configuramos los componentes
		label1.setText("Cambio de Contraseña");
		label1.setBounds(180, 50, 250, 25);
		et_passActual.setText("Contraseña Actual");
		et_passActual.setBounds(195, 80, 150, 25);
		tf_passActual.setBounds(150, 110, 200, 25);
		et_password.setText("Contraseña Nueva");
		et_password.setBounds(195, 140, 150, 25);
		tf_password.setBounds(150, 170, 200, 25);
		et_conPassword.setText("Confirmar Contraseña");
		et_conPassword.setBounds(195, 200, 150, 25);
		tf_conPassword.setBounds(150, 230, 200, 25);
		nuevaContrase.setBounds(190, 270, 120, 20);
		canNuePass.setBounds(190, 310, 120, 20);
		// adicionamos los componentes a la ventana
		this.add(label1);
		this.add(et_passActual);
		this.add(tf_passActual);
		this.add(et_password);
		this.add(tf_password);
		this.add(et_conPassword);
		this.add(tf_conPassword);
		this.add(nuevaContrase);
		this.add(canNuePass);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
