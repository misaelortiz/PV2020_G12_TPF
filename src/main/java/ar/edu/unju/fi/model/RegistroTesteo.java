package ar.edu.unju.fi.model;

import java.time.LocalDateTime;
import java.util.List;

public class RegistroTesteo {
	
			private LocalDateTime fechaHora;
			private UnidadHabitacional unidadHabitacional;
			private List<PersonaTesteada> personasTesteadas;
			
			public RegistroTesteo() {
				super();
			}

		
			public LocalDateTime getFechaHora() {
				return fechaHora;
			}

			public void setFechaHora(LocalDateTime fechaHora) {
				this.fechaHora = fechaHora;
			}

			public UnidadHabitacional getUnidadHabitacional() {
				return unidadHabitacional;
			}

			public void setUnidadHabitacional(UnidadHabitacional unidadHabitacional) {
				this.unidadHabitacional = unidadHabitacional;
			}

			public List<PersonaTesteada> getPersonasTesteadas() {
				return personasTesteadas;
			}

			public void setPersonasTesteadas(List<PersonaTesteada> personasTesteadas) {
				this.personasTesteadas = personasTesteadas;
			}

		
			
			

}
