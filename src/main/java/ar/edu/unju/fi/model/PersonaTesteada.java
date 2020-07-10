package ar.edu.unju.fi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="personatesteada")
public class PersonaTesteada {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "ID")
		private Long id_personaTesteada;
	@Column(name = "DNI", length = 150, nullable=true)
		private String documento;
	@Column(name = "Nombre", length = 150, nullable=true)
		private String nombre;
	@Column(name = "Apellido", length = 150, nullable=true)
		private String apellido;
	@Column(name = "Resultado", length = 150, nullable=true)
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
		
		
		public Long getId() {
		return id_personaTesteada;
	}


	public void setId(Long id) {
		this.id_personaTesteada = id;
	}

}

