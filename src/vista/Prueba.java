package vista;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Prueba extends JPanel{
	
	private static String [][] datos = {{"1", "Agua", "$ 175.000"},
			{"2", "Luz", "$ 275.000"},
			{"3", "Gas", "$ 475.000"},
			{"4", "Gas", "$ 475.000"},
			{"5", "Gas", "$ 475.000"},
			{"6", "Gas", "$ 475.000"},
			{"7", "Gas", "$ 475.000"},
			{"8", "Gas", "$ 475.000"}};
	
	private static String []cabezera = {"id_Recibo", "des_Recibo", "Valor_A_Pagar"};

	static JFrame frame = new JFrame();
	//static DefaultTableModel model = new DefaultTableModel(4,4);
	static JTable tabla = new JTable(datos,cabezera);
	static JButton boton = new JButton();
	private JLabel et_inico;
	private JLabel et_preguFrec;
	private JLabel et_cerrarSesi;
	
	
	
	
	public Prueba(){
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setTitle("Tabla");        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setSize(600,600);
		frame.setResizable(false);
        
        this.setBounds(100,100,450,120);
        this.setBackground(Color.black);
        this.setLayout(new BorderLayout()); 
        this.setVisible(true);
        
        tabla.setColumnSelectionAllowed(true);
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabla.setCellSelectionEnabled(false);
        tabla.setRowHeight(26);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(150);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(150);
        tabla.setRowSelectionAllowed(false);
        tabla.setColumnSelectionAllowed(false);
        tabla.setCellSelectionEnabled(false);
      
        
        JScrollPane scroll = new JScrollPane(tabla);
        this.add(scroll);
        
    	et_inico = new JLabel("<html><a href=h>Inicio</a></html>");
    	et_inico.setBounds(300, 30, 50, 25);
    	et_preguFrec = new JLabel("<html><a href=h>Preguntas Frecuentes</a></html>");
    	et_preguFrec.setBounds(350, 30, 150, 25);
    	et_cerrarSesi = new JLabel("<html><a href=h>Cerrar Sesión</a></html>");
    	et_cerrarSesi.setBounds(495, 30, 100, 25);
        
        frame.add(this);
        frame.add(et_inico);
        frame.add(et_preguFrec);
        frame.add(et_cerrarSesi);
        frame.setVisible(true);
        
	}
	
	public static void main(String[] args){
		Prueba p = new Prueba();
	}
	
	
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}

