package vista;

import java.awt.HeadlessException;
//import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//import java.sql.Date;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import controlador.Hash;
import controlador.Usuarios;
import modelo.UsuariosSQL;

public class RegistroUsuarios extends JFrame implements ActionListener, WindowListener, ItemListener {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private JLabel tituloRegistro;
	private JLabel et_correoElect;
	private JTextField tf_correoElect;
	private JLabel et_nombreComple;
	private JTextField tf_nombreComple;
	
	private JLabel et_tipDoc;
	private JComboBox<String> tf_tipDoc;
	private JLabel et_numDoc;
	private JTextField tf_numDoc;
	
	private JLabel et_password;
	private JPasswordField tf_password;
	private JLabel et_conPassword;
	private JPasswordField tf_conPassword;
	private JLabel et_fechaNacimi;
	private JDateChooser tf_fechaNacimi;
	private JButton botonRegistro;
	private JCheckBox cb_condiciones;
	private JLabel cb_condiciones1;
	private JLabel cb_condiciones2;
	public JPanel imagen;

	public RegistroUsuarios() {
		super();
		configurarVentana();
		inicializarComponentes();
		
		botonRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Inicio prin = new Inicio();
				//prin.setVisible(true);

				/*UsuariosSQL modSql = new UsuariosSQL();
				Usuarios mod = new Usuarios();
				String pass = new String(tf_password.getPassword());
				String passC = new String(tf_conPassword.getPassword());
				if (tf_correoElect.getText().equals("") || pass.equals("") || passC.equals("")
						|| tf_nombreComple.getText().equals("") || tf_tipDoc.equals("")
						|| tf_numDoc.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los datos");
				} else {
					if (pass.equals(passC)) {
						try {
							if (modSql.existeUsuario(tf_numDoc.getText()) == 0) {
								if (modSql.esEmail(tf_correoElect.getText())) {
									mod.setCorreo(tf_correoElect.getText());
									String nuevoPass = Hash.sha1(pass);
									// mod.setTipoDoc(tf_tipDoc);
									mod.setNumDoc(tf_numDoc.getText());
									mod.setPassword(nuevoPass);
									mod.setNombre(tf_nombreComple.getText());
									//mod.setFechaNacimiento(Date.valueOf(tf_fechaNacimi.getDate()));
									if (modSql.registrar(mod)) {
										JOptionPane.showMessageDialog(null, "Registro Guardado");
										Inicio prin = new Inicio();
										prin.setVisible(true);
									} else {
										JOptionPane.showMessageDialog(null, "Error al Guardar");
									}
								} else {
									JOptionPane.showMessageDialog(null, "El email es incorrecto");
								}
							} else {
								JOptionPane.showMessageDialog(null, "El usuario ya existe");
							}
						} catch (HeadlessException e1) {
							e1.printStackTrace();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					} else {
						JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
					}
				}*/
			}
		});
	}
	
	private void configurarVentana() {
		this.setTitle("REGISTRO DE USUARIO");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	private void inicializarComponentes() {
		// creamos los componentes
		tituloRegistro = new JLabel();
		// nombreAplicacion.setForeground(Color.BLUE);
		et_correoElect = new JLabel();
		tf_correoElect = new JTextField();
		et_nombreComple = new JLabel();
		tf_nombreComple = new JTextField();	
		et_tipDoc = new JLabel();
		tf_tipDoc = new JComboBox<String>();
		et_numDoc = new JLabel();
		tf_numDoc = new JTextField();
		et_password = new JLabel();
		tf_password = new JPasswordField();
		et_conPassword = new JLabel();
		tf_conPassword = new JPasswordField();
		et_fechaNacimi = new JLabel();
		tf_fechaNacimi = new JDateChooser();
		botonRegistro = new JButton();
		cb_condiciones = new JCheckBox();
		cb_condiciones1 = new JLabel();
		cb_condiciones2 = new JLabel();
		// configuramos los componentes
		tituloRegistro.setText("REGISTRO NUEVO USUARIO");
		tituloRegistro.setBounds(345, 30, 200, 25);
		et_correoElect.setText("Correo Electronico");
		et_correoElect.setBounds(320, 60, 150, 25);
		tf_correoElect.setBounds(320, 90, 200, 25);
		et_nombreComple.setText("Nombre Completo");
		et_nombreComple.setBounds(320, 120, 150, 25);
		tf_nombreComple.setBounds(320, 150, 200, 25);
		et_tipDoc.setText("Tipo Documento");
		et_tipDoc.setBounds(320, 180, 100, 25);
		tf_tipDoc.setBounds(320, 210, 120, 25);
		et_numDoc.setText("Numero Documento");
		et_numDoc.setBounds(450, 180, 150, 25);
		tf_numDoc.setBounds(450, 210, 110, 25);
		et_password.setText("Contraseña");
		et_password.setBounds(320, 240, 100, 25);
		tf_password.setBounds(320, 270, 200, 25);
		et_conPassword.setText("Repita Contraseña");
		et_conPassword.setBounds(320, 300, 150, 25);
		tf_conPassword.setBounds(320, 330, 200, 25);
		et_fechaNacimi.setText("Fecha Nacimiento");
		et_fechaNacimi.setBounds(320, 360, 150, 25);
		tf_fechaNacimi.setBounds(320, 390, 100, 25);
		botonRegistro.setText("REGISTRARSE");
		botonRegistro.setBounds(360, 430, 120, 25);
		//botonRegistro.setEnabled(false);
		cb_condiciones.setText("Al registrarte, aceptas nuestras");
		cb_condiciones.setBounds(320, 460, 300, 25);
		cb_condiciones1.setText("Condiciones, la Política de datos");
		cb_condiciones1.setBounds(340, 480, 300, 20);
		cb_condiciones2.setText("y la Política de cookies.");
		cb_condiciones2.setBounds(340, 500, 300, 20);
		// adicionamos los componentes a la ventana
		this.add(tituloRegistro);
		this.add(et_correoElect);
		this.add(tf_correoElect);
		this.add(et_nombreComple);
		this.add(tf_nombreComple);
		this.add(et_tipDoc);
		this.add(tf_tipDoc);
		this.add(et_numDoc);
		this.add(tf_numDoc);
		this.add(et_password);
		this.add(tf_password);
		this.add(et_conPassword);
		this.add(tf_conPassword);
		this.add(et_fechaNacimi);
		this.add(tf_fechaNacimi);
		this.add(botonRegistro);
		this.add(cb_condiciones);
		this.add(cb_condiciones1);
		this.add(cb_condiciones2);
		/* ITEMS TIPO DOCUMENTO */
		tf_tipDoc.addItem("Cedula Ciudadania");
		tf_tipDoc.addItem("Cedula Extranjeria");
		tf_tipDoc.addItemListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		UsuariosSQL modSql = new UsuariosSQL();
		Usuarios mod = new Usuarios();
		String pass = new String(tf_password.getPassword());
		String passC = new String(tf_conPassword.getPassword());
		if (tf_correoElect.getText().equals("") || pass.equals("") || passC.equals("")
				|| tf_nombreComple.getText().equals("") || tf_tipDoc.equals("")
				|| tf_numDoc.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los datos");
		} else {
			if (pass.equals(passC)) {
				try {
					if (modSql.existeUsuario(tf_numDoc.getText()) == 0) {
						if (modSql.esEmail(tf_correoElect.getText())) {
							mod.setCorreo(tf_correoElect.getText());
							String nuevoPass = Hash.sha1(pass);
							// mod.setTipoDoc(tf_tipDoc);
							mod.setNumDoc(tf_numDoc.getText());
							mod.setPassword(nuevoPass);
							mod.setNombre(tf_nombreComple.getText());
							//mod.setFechaNacimiento(Date.valueOf(tf_fechaNacimi.getDate()));
							if (modSql.registrar(mod)) {
								JOptionPane.showMessageDialog(null, "Registro Guardado");
								Inicio prin = new Inicio();
								//prin.setVisible(true);
							} else {
								JOptionPane.showMessageDialog(null, "Error al Guardar");
							}
						} else {
							JOptionPane.showMessageDialog(null, "El email es incorrecto");
						}
					} else {
						JOptionPane.showMessageDialog(null, "El usuario ya existe");
					}
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
			}
		}
	}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		InicioSesion.frmRegistro = null;
	}
	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == tf_tipDoc) {
			String seleccionado = (String) tf_tipDoc.getSelectedItem();
			setTitle(seleccionado);
		}
	}
}
