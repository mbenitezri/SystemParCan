package modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_clase")
public class ClaseModelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer clase_id;
	
	@Column
	private LocalDate anho;
	
	

}
