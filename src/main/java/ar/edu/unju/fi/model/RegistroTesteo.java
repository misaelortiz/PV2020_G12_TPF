
package ar.edu.unju.fi.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="registroTesteo")
public class RegistroTesteo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "fechahora")
	private LocalDateTime fechaHora;
	
	@OneToOne
	@JoinColumn(name = "id_unidadHaitacional")
	private UnidadHabitacional unidadHabitacional;
	
	@OneToMany(mappedBy ="id_personaTesteada", cascade = CascadeType.ALL) 
	private List<PersonaTesteada> personasTesteadas = new ArrayList<PersonaTesteada>();
			
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
