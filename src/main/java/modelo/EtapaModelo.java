package modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_etapa")
public class EtapaModelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer etap_id;

	@Column(nullable = false)
	private String etap_descripcion;

	@Column
	private Boolean etap_estado;

}
