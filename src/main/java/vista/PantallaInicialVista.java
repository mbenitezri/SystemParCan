package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import componentes.JPanelPantallaPrincipal;

public class PantallaInicialVista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanelPantallaPrincipal contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaInicialVista frame = new PantallaInicialVista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaInicialVista() {
		setExtendedState(MAXIMIZED_BOTH);// esto sirve para que al iniciar abra la pantalla completa
		setLocationRelativeTo(this);// para que ejecute en el medio siempre
		setTitle("Sistema de Control de Asistencia"); // aqui edito el titulo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080); // aqui se cambia el tamaño de la pantalla esta FULL HD
		contentPane = new JPanelPantallaPrincipal();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	}
}
