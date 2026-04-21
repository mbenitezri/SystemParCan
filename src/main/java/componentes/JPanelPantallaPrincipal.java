package componentes;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class JPanelPantallaPrincipal extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Image image;

	// metodo constructor que recibe y crea la imagen, pusimos dentro de un catch
	// para que muestre un msj de error si no se encuentra la imagen
	public JPanelPantallaPrincipal() {
		try {
			this.image = new ImageIcon(getClass().getResource("/imagenes/fondo.png")).getImage();
		} catch (Exception e) {
			System.err.println("No se encontro la imagen /fondo.png");
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null) { // si no tengo una imagen porque si encuentro va a ser nulo
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this); // los ceros para las posiciones. getWidth es para
																		// que agarre el tamanho de mi JPANEL
			// si la imagen es nula, si no encontro esa imagen entonces va a dibujar esa
			// imagen en el Jpanel
			// para ver si esto esta funcionando
		}
	}
}
