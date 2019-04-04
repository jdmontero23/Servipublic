package controlador;

import java.io.FileNotFoundException;
import java.io.IOException;

import vista.Inicio;
import vista.InicioSesion;
import vista.Tabla;

public class Principal {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //InicioSesion inSe = new InicioSesion();
        //Inicio inSe = new Inicio();
    	Tabla inSe = new Tabla();
        inSe.setVisible(true);
    }
}
