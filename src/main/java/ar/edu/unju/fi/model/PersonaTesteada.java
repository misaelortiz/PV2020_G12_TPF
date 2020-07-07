package ar.edu.unju.fi.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PersonaTesteada {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "ID")
		private Long id;
	@Column(name = "DNI")
		private String documento;
	@Column(name = "Nombre")
		private String nombre;
	@Column(name = "Apellido")
		private String apellido;
	@Column(name = "Resultado")
		private String resultadoTesteo;
		
		
		public PersonaTesteada() {
			super();
		}


		public PersonaTesteada(String documento, String nombre, String apellido, String resultadoTesteo) {
			super();
			this.documento = documento;
			this.nombre = nombre;
			this.apellido = apellido;
			this.resultadoTesteo = resultadoTesteo;
		}


		public String getDocumento() {
			return documento;
		}


		public void setDocumento(String documento) {
			this.documento = documento;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getApellido() {
			return apellido;
		}


		public void setApellido(String apellido) {
			this.apellido = apellido;
		}


		public String getResultadoTesteo() {
			return resultadoTesteo;
		}


		public void setResultadoTesteo(String resultadoTesteo) {
			this.resultadoTesteo = resultadoTesteo;
		}
		
		
		

}
