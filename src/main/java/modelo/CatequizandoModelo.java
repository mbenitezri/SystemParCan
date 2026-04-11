package modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_catequizando")
public class CatequizandoModelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer catz_id;

	@Column(length = 100, nullable = false)
	private String catz_nombre;

	@Column(length = 100, nullable = false)
	private String catz_apellido;

	@Column(length = 50, nullable = false, unique = false)
	private String catz_documento;

	@Column
	private String catz_telefono;

	@Column
	private String catz_correo;

	@Column
	private String catz_direccion;

	@Column
	private LocalDate catz_fechaNacimiento;

	@Column
	private LocalDate catz_fechaRegistro;

	@Column
	private Boolean catz_estado;
	
	

}
