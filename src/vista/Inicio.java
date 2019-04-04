package vista;
 
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Inicio {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1, mi2, mi3, mi4 , mi5;
	private JLabel et_inico;
	private JLabel et_preguFrec;
	private JLabel et_cerrarSesi;
	
	private JTable tabla;
	private String [][] datos = {{"1", "Agua", "$ 175.000"},
			{"2", "Luz", "$ 275.000"},
			{"3", "Gas", "$ 475.000"},};
	
	private String []cabezera = {"id_Recibo", "des_Recibo", "Valor_A_Pagar"};
	
	private JScrollPane js;
	public JFrame ini;

	public Inicio() {
        mb =new JMenuBar();
        setJMenuBar(mb);
        menu1 = new JMenu("Opciones");
        mb.add(menu1);
        mi1 = new JMenuItem("Pague Aqui");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2  =new JMenuItem("Consultas Historicas PAgos");
        mi2.addActionListener(this);
        menu1.add(mi2);
        mi3 = new JMenuItem("Terminos Legales");
        mi3.addActionListener(this);
        menu1.add(mi3); 
        mi4 = new JMenuItem("Datos Personales");
        mi4.addActionListener(this);
        menu1.add(mi4); 
        mi5 = new JMenuItem("Cambio de Contraseña");
        mi5.addActionListener(this);
        menu1.add(mi5); */
    	et_inico = new JLabel("<html><a href=h>Inicio</a></html>");
    	et_inico.setBounds(350, 30, 50, 25);
    	et_preguFrec = new JLabel("<html><a href=h>Preguntas Frecuentes</a></html>");
    	et_preguFrec.setBounds(400, 30, 150, 25);
    	et_cerrarSesi = new JLabel("<html><a href=h>Cerrar Sesión</a></html>");
    	et_cerrarSesi.setBounds(545, 30, 100, 25);
		
		ini = new JFrame();
		ini.setTitle("INICO");
		ini.setSize(700, 700);
		ini.setLocationRelativeTo(null);
		ini.setLayout(new FlowLayout());
		//ini.setResizable(false);
		set_table();
		ini.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ini.setVisible(true);
		ini.add(et_inico);
		ini.add(et_preguFrec);
		ini.add(et_cerrarSesi);

	}


	private void setJMenuBar(JMenuBar mb2) {
		// TODO Auto-generated method stub
		
	}


	@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== mi1) {
        }
        if (e.getSource()== mi2) {
        }
        if (e.getSource()== mi3) {
        }  
        if (e.getSource()== mi4) {
            DatosPersonales datPer = new DatosPersonales();
            datPer.setVisible(true);
        }  
        if (e.getSource()== mi5) {
            CambioPass newPass = new CambioPass();
            newPass.setVisible(true);
        }  
    }
}
