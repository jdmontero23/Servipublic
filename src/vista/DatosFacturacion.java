package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class DatosFacturacion extends JFrame implements ActionListener, ItemListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel tituloRegistro;
	private JLabel et_nombreTitular;
	private JTextField tf_nombreTitular;
	private JLabel et_pais;
	private JTextField tf_pais;
	private JLabel et_tipoDoc;
	private JComboBox<String> tf_tipoDoc;
	private JLabel et_departa;
	private JComboBox<String> tf_departa;
	private JLabel et_ciudad;
	private JTextField tf_ciudad;
	private JLabel et_numDoc;
	private JTextField tf_numDoc;
	private JLabel et_direccion;
	private JTextField tf_direccion;
	private JLabel et_telefono;
	private JTextField tf_telefono;
	private JLabel et_email;
	private JTextField tf_email;
	private JLabel et_pago;
	private JTextField tf_pago;
	private JLabel tituloRegistro1;
	private JLabel tituloRegistro2;
	private JComboBox<String> tf_credito;
	private JLabel et_numTarje;
	private JTextField tf_numTarje;
	private JLabel et_codSeg;
	private JTextField tf_codSeg;
	private JLabel et_fechaExpira;
	private JDateChooser tf_fechaExpira;
	private JLabel et_tipoBanco;
	private JComboBox<String> tf_tipoBanco;
	private JLabel et_numCuotas;
	private JComboBox<String> tf_numCuotas;
	private JLabel tituloRegistro3;
	private JButton pagosPSE;
	private JCheckBox cb_condiciones;
	private JButton acepPago;
	private JButton cancPago;

	public DatosFacturacion() throws FileNotFoundException, IOException {
		super();
		configurarVentana();
		inicializarComponentes();

	}

	private void configurarVentana() throws FileNotFoundException, IOException {
		this.setTitle("DATOS DE FACTURACION");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.getContentPane().setBackground(Color.GRAY);
	}

	private void inicializarComponentes() throws FileNotFoundException, IOException {
		// creamos los componentes
		// nombreAplicacion.setForeground(Color.BLUE);
		tituloRegistro = new JLabel();
		et_nombreTitular = new JLabel();
		tf_nombreTitular = new JTextField();
		et_pais = new JLabel();
		tf_pais = new JTextField();
		et_tipoDoc = new JLabel();
		;
		tf_tipoDoc = new JComboBox<String>();
		et_departa = new JLabel();
		tf_departa = new JComboBox<String>();
		et_ciudad = new JLabel();
		tf_ciudad = new JTextField();
		et_numDoc = new JLabel();
		tf_numDoc = new JTextField();
		et_direccion = new JLabel();
		tf_direccion = new JTextField();
		et_telefono = new JLabel();
		tf_telefono = new JTextField();
		et_email = new JLabel();
		tf_email = new JTextField();
		et_pago = new JLabel();
		tf_pago = new JTextField();
		tituloRegistro1 = new JLabel();
		tituloRegistro2 = new JLabel();
		tf_credito = new JComboBox<String>();
		et_numTarje = new JLabel();
		tf_numTarje = new JTextField();
		et_codSeg = new JLabel();
		tf_codSeg = new JTextField();
		et_fechaExpira = new JLabel();
		tf_fechaExpira = new JDateChooser();
		et_tipoBanco = new JLabel();
		tf_tipoBanco = new JComboBox<String>();
		et_numCuotas = new JLabel();
		tf_numCuotas = new JComboBox<String>();
		tituloRegistro3 = new JLabel();
		pagosPSE = new JButton();
		cb_condiciones = new JCheckBox();
		acepPago = new JButton();
		cancPago = new JButton();
		// configuramos los componentes
		tituloRegistro.setText("Datos de Facturación");
		tituloRegistro.setBounds(230, 10, 200, 25);
		et_nombreTitular.setText("Nombre del Titular");
		et_nombreTitular.setBounds(20, 40, 150, 25);
		tf_nombreTitular.setBounds(20, 60, 200, 25);
		et_pais.setText("Pais");
		et_pais.setBounds(250, 40, 100, 25);
		tf_pais.setText("Colombia");
		tf_pais.setBounds(250, 60, 100, 25);
		tf_pais.setEnabled(false);
		et_tipoDoc.setText("Tipo de Documento");
		et_tipoDoc.setBounds(20, 90, 150, 25);
		tf_tipoDoc.setBounds(20, 110, 150, 25);
		et_departa.setText("Departamento");
		et_departa.setBounds(250, 90, 150, 25);
		tf_departa.setBounds(250, 110, 150, 25);
		et_ciudad.setText("Ciudad");
		et_ciudad.setBounds(410, 90, 150, 25);
		tf_ciudad.setBounds(410, 110, 150, 25);
		et_numDoc.setText("Numero de Documento");
		et_numDoc.setBounds(20, 140, 150, 25);
		tf_numDoc.setBounds(20, 160, 100, 25);
		et_direccion.setText("Direccion");
		et_direccion.setBounds(250, 140, 150, 25);
		tf_direccion.setBounds(250, 160, 200, 25);
		et_telefono.setText("Telefono");
		et_telefono.setBounds(20, 190, 150, 25);
		tf_telefono.setBounds(20, 210, 100, 25);
		et_email.setText("Email");
		et_email.setBounds(150, 190, 150, 25);
		tf_email.setBounds(150, 210, 160, 25);
		et_pago.setText("Total a Pagar");
		et_pago.setBounds(340, 190, 150, 25);
		tf_pago.setBounds(340, 210, 120, 25);
		tituloRegistro1.setText("Forma de Pago");
		tituloRegistro1.setBounds(230, 260, 200, 25);
		tituloRegistro2.setText("CREDITO");
		tituloRegistro2.setBounds(20, 280, 200, 25);
		tf_credito.setBounds(20, 310, 120, 25);
		et_numTarje.setText("Numero de Tarjeta");
		et_numTarje.setBounds(150, 310, 200, 25);
		tf_numTarje.setBounds(260, 310, 150, 25);
		et_codSeg.setText("Codigo de Seguridad");
		et_codSeg.setBounds(415, 310, 150, 25);
		tf_codSeg.setBounds(538, 310, 50, 25);
		et_fechaExpira.setText("Fecha de Caducidad");
		et_fechaExpira.setBounds(20, 340, 150, 25);
		tf_fechaExpira.setBounds(20, 360, 80, 25);
		String Formato = new String("MM-YYYY");
		tf_fechaExpira.setDateFormatString(Formato);
		et_tipoBanco.setText("Nombre del Banco");
		et_tipoBanco.setBounds(160, 340, 150, 25);
		tf_tipoBanco.setBounds(160, 360, 150, 25);
		et_numCuotas.setText("Numero de Cuotas");
		et_numCuotas.setBounds(350, 340, 150, 25);
		tf_numCuotas.setBounds(350, 360, 50, 25);
		tituloRegistro3.setText("DEBITO");
		tituloRegistro3.setBounds(20, 400, 200, 25);
		pagosPSE.setText("PAGO PSE");
		pagosPSE.setBounds(20, 430, 100, 25);
		cb_condiciones.setText("Acepto Politicas de Seguridad y Tratamiento de Datos");
		cb_condiciones.setBounds(20, 470, 500, 25);
		cancPago.setText("CANCELAR PAGO");
		cancPago.setBounds(270, 510, 140, 25);
		acepPago.setText("ACEPTAR PAGO");
		acepPago.setBounds(420, 510, 130, 25);

		// adicionamos los componentes a la ventana
		this.add(tituloRegistro);
		this.add(et_nombreTitular);
		this.add(tf_nombreTitular);
		this.add(et_pais);
		this.add(tf_pais);
		this.add(et_tipoDoc);
		this.add(tf_tipoDoc);
		this.add(et_departa);
		this.add(tf_departa);
		this.add(et_ciudad);
		this.add(tf_ciudad);
		this.add(et_numDoc);
		this.add(tf_numDoc);
		this.add(et_direccion);
		this.add(tf_direccion);
		this.add(tf_telefono);
		this.add(et_telefono);
		this.add(et_email);
		this.add(tf_email);
		this.add(et_pago);
		this.add(tf_pago);
		this.add(tituloRegistro1);
		this.add(tituloRegistro2);
		this.add(tf_credito);
		this.add(et_numTarje);
		this.add(tf_numTarje);
		this.add(et_codSeg);
		this.add(tf_codSeg);
		this.add(et_fechaExpira);
		this.add(tf_fechaExpira);
		this.add(et_tipoBanco);
		this.add(tf_tipoBanco);
		this.add(et_numCuotas);
		this.add(tf_numCuotas);
		this.add(tituloRegistro3);
		this.add(pagosPSE);
		this.add(cb_condiciones);
		this.add(cancPago);
		this.add(acepPago);
		/* ITEMS AL COMBOBOX */
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
		/* ITEMS TIPO DOCUMENTO */
		tf_tipoDoc.addItem("Cedula Ciudadania");
		tf_tipoDoc.addItem("Cedula Extranjeria");
		tf_tipoDoc.addItemListener(this);
		/* ITEMS TARJETA CREDITO */
		tf_credito.addItem("Master Card");
		tf_credito.addItem("Visa");
		tf_credito.addItemListener(this);
		/* ITEMS NOMBRE BANCOS 1 */
		tf_tipoBanco.addItem("Bancolombia");
		tf_tipoBanco.addItem("BBVA");
		tf_tipoBanco.addItem("Banco de Bogota");
		tf_tipoBanco.addItem("Banco Caja Social");
		tf_tipoBanco.addItem("Itau");
		tf_tipoBanco.addItemListener(this);
		/* ITEMS NUMERO CUOTAS */
		tf_numCuotas.addItem("1");
		tf_numCuotas.addItem("2");
		tf_numCuotas.addItem("3");
		tf_numCuotas.addItem("5");
		tf_numCuotas.addItem("6");
		tf_numCuotas.addItem("15");
		tf_numCuotas.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == tf_departa) {
			String seleccionado = (String) tf_departa.getSelectedItem();
			setTitle(seleccionado);
		}
	}

	public void itemStateChanged1(ItemEvent e) {
		if (e.getSource() == tf_tipoDoc) {
			String seleccionado = (String) tf_tipoDoc.getSelectedItem();
			setTitle(seleccionado);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}
}
