package modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_inscripcion")
public class InscripcionModelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer inscrip_id;

	@Column
	private LocalDate inscrip_fecha;

	@Column
	private Boolean inscrip_estado;

	
	// ===== MUCHOS A UNO =======
	@ManyToOne
	private CatequizandoModelo catequizando;

	@ManyToOne
	private GrupoCatequesisModelo grupoCatequista;

}
