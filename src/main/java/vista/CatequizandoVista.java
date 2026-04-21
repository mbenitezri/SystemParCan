package vista;

import java.awt.EventQueue;

import javax.swing.JDialog;

import componentes.JDialogGenerico;
import controlador.CatequizandoController;

public class CatequizandoVista extends JDialogGenerico {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CatequizandoVista dialog = new CatequizandoVista();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setControlador();
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setControlador() {
		new ClienteController(this);
	}

	/**
	 * Create the dialog.
	 */
	public CatequizandoVista() {
		

	}

}
