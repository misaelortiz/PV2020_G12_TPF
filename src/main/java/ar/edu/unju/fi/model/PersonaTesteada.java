package ar.edu.unju.fi.model;

public class PersonaTesteada {
		
		private String documento;
		private String nombre;
		private String apellido;
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
