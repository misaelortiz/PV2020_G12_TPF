package ar.edu.unju.fi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unju.fi.model.Barrio;


public interface IBarrioRepository extends JpaRepository<Barrio, Long> {
	//public Optional<Barrio> findBynombreBarrio(String nombre);
	
}
