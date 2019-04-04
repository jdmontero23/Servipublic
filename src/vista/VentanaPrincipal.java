package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame implements ActionListener {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public VentanaPrincipal() {
		super();
		configurarVentana();
		inicializarComponentes();
	}

	private void configurarVentana() {
		this.setTitle("INICO");
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.GRAY);

	}

	private void inicializarComponentes() {
		// creamos los componentes

		// configuramos los componentes

		// adicionamos los componentes a la ventana

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
