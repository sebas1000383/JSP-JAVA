package modelo;

public class RolVo {
	//encapsulation attributes  
	
	private int idusuario;
	private String nombreUsuario,apellidoUsuario,correo,contrase�a;
	// builders empty, receive data
	
	public RolVo() {
		
		
	}
	public RolVo(int idusuario, String nombreUsuario, String apellidoUsuario, String correo, String contrase�a) {
		super();
		this.idusuario = idusuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.correo = correo;
		this.contrase�a = contrase�a;
		
		// Getters and Setters 
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getApellidoUsuario() {
		return apellidoUsuario;
	}
	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

}
