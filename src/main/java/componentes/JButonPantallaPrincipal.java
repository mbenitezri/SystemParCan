package componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

public class JButonPantallaPrincipal extends JButton {

	public JButonPantallaPrincipal() {

		setMinimumSize(new Dimension(140, 140)); // el tamanho minimo que queremos que tenga, un boton cuadrado
		setMaximumSize(new Dimension(140, 140)); // esto asegura que la persona no cambie el tamanho a menos que venga
													// en el codigo y lo cambie
		setFont(new Font("Arial", Font.BOLD, 16)); // para setear el tipo de fuente, negrita, tamanho
		setForeground(new Color(52, 152, 219));

	}
}
