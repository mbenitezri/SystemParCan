package modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_grupo_catequesis")
public class GrupoCatequesisModelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer grup_id;

	@Column
	private LocalDate grup_anho;

	// ===== MUCHOS A UNO =======
	@ManyToOne
	private EtapaModelo etapa;

	@ManyToOne
	private CatequistaModelo catequista;
}
