package modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_catequista")
public class CatequistaModelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cat_id;

	@Column(length = 100, nullable = false)
	private String cat_nombre;

	@Column(length = 100, nullable = false)
	private String cat_apellido;

	@Column(length = 50, nullable = false, unique = false)
	private String cat_documento;

	@Column
	private String cat_telefono;

	@Column
	private String cat_correo;

	@Column
	private String cat_direccion;

	@Column
	private LocalDate cat_fechaNacimiento;

	@Column
	private LocalDate cat_fechaRegistro;

	@Column
	private Boolean cat_estado;

}
