package controlador;

import interfaces.InterfaceABM;
import vista.CatequizandoVista;

public class CatequizandoController implements InterfaceABM {

	private CatequizandoVista vista;

	public CatequizandoController(CatequizandoVista catequizandoVista) {
		super();
		this.vista = catequizandoVista;
		this.vista.setInterfaceABM(this);
	}

	@Override
	public void nuevo() {
		System.out.println("Nuevo");

	}

	@Override
	public void editar() {
		System.out.println("Editar");

	}

	@Override
	public void eliminar() {
		System.out.println("Eliminar");

	}

	@Override
	public void cancelar() {
		System.out.println("Cancelar");

	}

	@Override
	public void guardar() {
		System.out.println("Guardar");

	}

	@Override
	public void buscar() {
		System.out.println("Buscar");

	}

}
