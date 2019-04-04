package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class DatosPersonales extends JFrame implements ActionListener, ItemListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel tituloRegistro;
	private JTextField nombreCompleto;
	private JLabel et_correoElect;
	private JTextField tf_correoElect;
	private JLabel et_fechaNacimi;
	private JDateChooser tf_fechaNacimi;
	private JLabel et_departa;
	private JComboBox tf_departa;
	private JLabel et_ciudad;
	private JTextField tf_ciudad;
	private JLabel et_telefono;
	private JTextField tf_telefono;
	private JLabel et_direccion;
	private JTextField tf_direccion;
	private JButton actuContacto;
	private JButton cancelar;

	public DatosPersonales() {
		super();
		configurarVentana();
		inicializarComponentes();
		
		cancelar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
			}	
		});
	}

	private void configurarVentana() {
		this.setTitle("DATOS DE CONTACTO");
		this.setSize(600, 460);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	private void inicializarComponentes()  {
		// creamos los componentes
		tituloRegistro = new JLabel();
		nombreCompleto = new JTextField();
		// nombreAplicacion.setForeground(Color.BLUE);
		et_correoElect = new JLabel();
		tf_correoElect = new JTextField();
		et_fechaNacimi = new JLabel();
		tf_fechaNacimi = new JDateChooser();
		et_departa = new JLabel();
		tf_departa = new JComboBox();
		et_ciudad = new JLabel();
		tf_ciudad = new JTextField();
		et_telefono = new JLabel();
		tf_telefono = new JTextField();
		et_direccion = new JLabel();
		tf_direccion = new JTextField();
		actuContacto = new JButton("GUARDAR");
		cancelar = new JButton("CANCELAR");

		// configuramos los componentes
		tituloRegistro.setText("Actualización de Datos");
		tituloRegistro.setBounds(200, 30, 200, 25);
		nombreCompleto.setBounds(360, 180, 200, 25);
		nombreCompleto.setEnabled(false);
		et_correoElect.setText("Correo Electronico");
		et_correoElect.setBounds(30, 60, 150, 25);
		tf_correoElect.setBounds(30, 90, 200, 25);
		tf_correoElect.setEnabled(false);
		et_fechaNacimi.setText("Fecha Nacimiento");
		et_fechaNacimi.setBounds(30, 120, 150, 25);
		tf_fechaNacimi.setBounds(30, 150, 100, 25);
		tf_fechaNacimi.setEnabled(false);
		et_departa.setText("Departamento");
		et_departa.setBounds(30, 180, 150, 25);
		tf_departa.setBounds(30, 210, 150, 25);
		et_ciudad.setText("Ciudad");
		et_ciudad.setBounds(190, 180, 150, 25);
		tf_ciudad.setBounds(190, 210, 150, 25);
		et_telefono.setText("Telefono");
		et_telefono.setBounds(30, 240, 150, 25);
		tf_telefono.setBounds(30, 270, 150, 25);
		et_direccion.setText("Direccion");
		et_direccion.setBounds(30, 300, 150, 25);
		tf_direccion.setBounds(30, 330, 200, 25);
		actuContacto.setBounds(210, 380, 100, 20);
		cancelar.setBounds(330, 380, 100, 20);

		// adicionamos los componentes a la ventana
		this.add(tituloRegistro);
		this.add(nombreCompleto);
		this.add(et_correoElect);
		this.add(tf_correoElect);
		this.add(et_fechaNacimi);
		this.add(tf_fechaNacimi);
		this.add(et_departa);
		this.add(tf_departa);
		this.add(et_ciudad);
		this.add(tf_ciudad);
		this.add(et_telefono);
		this.add(tf_telefono);
		this.add(et_direccion);
		this.add(tf_direccion);
		this.add(actuContacto);
		this.add(cancelar);
		/* ITEMS AL COMBOBOX */
		tf_departa.addItem("Amazonas");
		tf_departa.addItem("Amazonas");
		tf_departa.addItem("Antioquia");
		tf_departa.addItem("Arauca");
		tf_departa.addItem("Atlántico");
		tf_departa.addItem("Bolívar");
		tf_departa.addItem("Boyacá");
		tf_departa.addItem("Caldas");
		tf_departa.addItem("Caquetá");
		tf_departa.addItem("Casanare");
		tf_departa.addItem("Cauca");
		tf_departa.addItem("Cesar");
		tf_departa.addItem("Chocó");
		tf_departa.addItem("Córdoba");
		tf_departa.addItem("Cundinamarca");
		tf_departa.addItem("Guainía");
		tf_departa.addItem("Guaviare");
		tf_departa.addItem("Huila");
		tf_departa.addItem("La Guajira");
		tf_departa.addItem("Magdalena");
		tf_departa.addItem("Meta");
		tf_departa.addItem("Nariño");
		tf_departa.addItem("Norte de Santander");
		tf_departa.addItem("Putumayo");
		tf_departa.addItem("Quindio");
		tf_departa.addItem("Risaralda");
		tf_departa.addItem("San Andres y Providencia");
		tf_departa.addItem("Santander");
		tf_departa.addItem("Sucre");
		tf_departa.addItem("Tolima");
		tf_departa.addItem("Valle del Cauca");
		tf_departa.addItem("Vaupés");
		tf_departa.addItem("Vichada");
		tf_departa.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == tf_departa) {
			String seleccionado = (String) tf_departa.getSelectedItem();
			System.out.println(seleccionado);
			setTitle(seleccionado);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}
}
