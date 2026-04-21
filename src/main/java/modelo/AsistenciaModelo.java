package modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_asistencia")
public class AsistenciaModelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer asist_id;

	@Column
	private Boolean estado;

	@Column(columnDefinition = "TEXT")
	private String observaciones;

	
	// ===== MUCHOS A UNO =======
	@ManyToOne
	private InscripcionModelo inscripcion;

	@ManyToOne
	private ClaseModelo clase;
//cc
}
