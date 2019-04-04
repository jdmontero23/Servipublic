package controlador;

public class IniSesion {

	
	public String correoElectronico;
	public String password;
	
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "IniSesion [correoElectronico=" + correoElectronico + ", password=" + password + "]";
	}
}
