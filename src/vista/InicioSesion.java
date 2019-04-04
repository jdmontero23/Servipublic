package vista;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controlador.Hash;
import controlador.Usuarios;
import modelo.UsuariosSQL;

public class InicioSesion extends JFrame implements ActionListener, WindowListener, MouseListener {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private JLabel nombreAplicacion;
	private JLabel et_correoElect;
	private JTextField tf_correoElect;
	private JLabel et_password;
	private JButton botonIngresar;
	private JPasswordField tf_password;
	private JLabel olvido;
	private JLabel noCuenta;
	private JLabel registro;
	
	public static RegistroUsuarios frmRegistro;
	public static OlvidoPass frmOlviClave;

	public InicioSesion() {
		super();
		configurarVentana();
		inicializarComponentes();

		botonIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuariosSQL modSql = new UsuariosSQL();
				Usuarios mod = new Usuarios();
		        String pass = new String(tf_password.getPassword());
		        if (!tf_correoElect.getText().equals("") && !pass.equals("")) {
		            String nuevoPass = Hash.sha1(pass);
		            mod.setCorreo(tf_correoElect.getText());
		            mod.setPassword(nuevoPass);
		            try {
						if (modSql.login(mod)) {
						    dispose();
						    Inicio frmInicio = new Inicio();
						    //frmInicio.setVisible(true);				    
						} else {
						    JOptionPane.showMessageDialog(null, "Datos incorrectos");
						}
					} catch (HeadlessException e1) {
						e1.printStackTrace();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
		        } else {
		            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
		        }
			}
		});

		olvido.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				OlvidoPass passOlvi = new OlvidoPass();
				passOlvi.setVisible(true);
			}	
		});
		
		registro.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				RegistroUsuarios regiNue = new RegistroUsuarios();
				regiNue.setVisible(true);
			}
		});
	}

	private void configurarVentana() {
		this.setTitle("INICIO DE SESION");
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void inicializarComponentes() {
		// creamos los componentes
		nombreAplicacion = new JLabel();
		et_correoElect = new JLabel();
		tf_correoElect = new JTextField();
		et_password = new JLabel();
		tf_password = new JPasswordField();
		botonIngresar = new JButton();
		olvido = new JLabel("<html><a href=h>¿Has Olvidad tu Contraseña?</a></html>");
		noCuenta = new JLabel("¿No Tienes Cuenta?");
		registro = new JLabel("<html><a href=>Registrate</a></html>");
		// configuramos los componentes
		nombreAplicacion.setText("SERVIPUBLIC");
		nombreAplicacion.setBounds(280, 50, 100, 25);
		et_correoElect.setText("Correo Electronico");
		et_correoElect.setBounds(265, 100, 150, 25);
		tf_correoElect.setBounds(220, 130, 200, 25);
		et_password.setText("Contraseña");
		et_password.setBounds(285, 160, 100, 25);
		tf_password.setBounds(220, 190, 200, 25);
		botonIngresar.setText("INGRESAR");
		botonIngresar.setBounds(275, 230, 100, 25);
		botonIngresar.addActionListener(this);
		olvido.setBounds(230, 290, 200, 15);
		noCuenta.setBounds(230, 320, 120, 15);
		registro.setBounds(350, 320, 100, 15);
		// adicionamos los componentes a la ventana
		this.add(nombreAplicacion);
		this.add(et_correoElect);
		this.add(tf_correoElect);
		this.add(et_password);
		this.add(tf_password);
		this.add(botonIngresar);
		this.add(olvido);
		this.add(noCuenta);
		this.add(registro);
	}

	@Override
	public void actionPerformed(ActionEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		InicioSesion.frmOlviClave = null;
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
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}
