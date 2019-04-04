/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import controlador.Usuarios;

/**
 *
 * @author ESTACION
 */
public class UsuariosSQL extends Conexion{
    
    public boolean registrar(Usuarios usr) throws SQLException{
    
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "INSERT INTO registrousuarios (correoElectronico, Nombre, tipoDoc, numDoc , Contraseña, "
        		+ "FechaNacimiento) VALUES  (?,?,?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getCorreo());
            ps.setString(2, usr.getNombre());
            ps.setString(3, usr.getTipoDoc());
            ps.setString(4, usr.getNumDoc());
            ps.setString(5, usr.getPassword());
            ps.setDate(6, usr.getFechaNacimiento());
            //ps.execute();
            rs = ps.executeQuery(); 
            return true;
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
    }
    
    public boolean login(Usuarios usr) throws SQLException{
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT tipoDoc, numDoc, correoElectronico, Nombre, Contraseña FROM registrousuarios WHERE correoElectronico = ?"; 
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getCorreo());
            rs = ps.executeQuery(); 
            if (rs.next()) {
            	if (usr.getPassword().equals(rs.getString(5))) {
            		usr.setTipoDoc(rs.getString(1));
            		usr.setNumDoc(rs.getString(2));
            		usr.setNombre(rs.getString(4));
            		return true;
				}else {
					return false;
				}
			}
            return false;
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
        
    }
    
    public int existeUsuario(String usuario) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT count(id) FROM registrousuarios WHERE numDoc = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }
    
    
    public boolean actualizacionPassword(String usuario) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "UPDATE registrousuarios SET Contraseña=? WHERE numDoc=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
            		return true;
				}else {
					return false;
				}
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public boolean esEmail(String correo) {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);
        return mather.find();

    }
    
}
