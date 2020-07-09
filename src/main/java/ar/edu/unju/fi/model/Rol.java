package ar.edu.unju.fi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Component
@Table(name = "roles")
public class Rol implements Serializable {

	/**
    * se asocia a la clave primaria de un registro
    * en la tabla roles
    */
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "rol_id")
   private Long id;
   
   /**
    * Representa un tipo específico de rol
    */
   @Column(name = "rol_tipo", length = 20, nullable = true)
   private String tipo;
}
