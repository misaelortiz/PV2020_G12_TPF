package ar.edu.unju.fi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="usuario")
public class Usuario  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "ID")
		private Long id;
	@Column(name = "Usuario")
		private String nombreUsuario;
	@Column(name = "Contrase;a")
		private String password;
	@Column(name = "Nombre")
		private String nombreReal;
	@Column(name = "Apellido")
		private String apellidoReal;
	@Column(name = "Tipo")
		private String tipoUsuario;
		
			
		//* Construtor por defecto *//
		public Usuario() {
			super();
		}
		//* Constructor con parametros *//
		public Usuario(String nombreUsuario, String password, String nombreReal, String apellidoReal,
				String tipoUsuario) {
			super();
			this.nombreUsuario = nombreUsuario;
			this.password = password;
			this.nombreReal = nombreReal;
			this.apellidoReal = apellidoReal;
			this.tipoUsuario = tipoUsuario;
		}
		//* getter and setter*//
		public String getNombreUsuario() {
			return nombreUsuario;
		}
		public void setNombreUsuario(String nombreUsuario) {
			this.nombreUsuario = nombreUsuario;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getNombreReal() {
			return nombreReal;
		}
		public void setNombreReal(String nombreReal) {
			this.nombreReal = nombreReal;
		}
		public String getApellidoReal() {
			return apellidoReal;
		}
		public void setApellidoReal(String apellidoReal) {
			this.apellidoReal = apellidoReal;
		}
		public String getTipoUsuario() {
			return tipoUsuario;
		}
		public void setTipoUsuario(String tipoUsuario) {
			this.tipoUsuario = tipoUsuario;
		}
		
		
		
}
