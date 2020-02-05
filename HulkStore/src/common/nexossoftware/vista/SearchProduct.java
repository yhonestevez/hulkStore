package common.nexossoftware.vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import org.apache.log4j.Logger;

import common.nexossofware.exception.HolkStroreEception;

public class SearchProduct extends JPanel {
	private static Logger logger = Logger.getLogger(SearchProduct.class);
	/**
	 * Se gurda el objeto de la clase principal
	 */
	private Principal principal;
	/**
	/**
	 * Se guarda el nombre del producto
	 */
	private JTextField textProduct;

	public SearchProduct(Principal principal) {
		this();
		this.principal= principal;
	}
	/**
	 * Create the panel.
	 */
	public SearchProduct() {
		setBorder(new TitledBorder(null, "Buscar producto por nombre", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel searchProduct = new JLabel("Nombre del producto");
		add(searchProduct);
		
		textProduct = new JTextField();
		add(textProduct);
		textProduct.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					principal.searchProducto();
				} catch (HolkStroreEception e1) {
					logger.error(e1.getMessage());
				}
			}
		});
		add(btnNewButton);

	}

	/**
	 * Se obtiene el texto ingresado en el campo
	 * @return
	 */
	public String getTextProduct() {
		return textProduct.getText();
	}

	/**
	 *  Se envia texto al campo
	 * @param textProduct
	 */
	
	public void setTextProduct(String textProduct) {
		this.textProduct.setText(textProduct);
	}
	
	/**
	 * Este metodo se utiliza para limpiar el 
	 * campo donde se ingresa el producto a buscar
	 */
	public void clearSearchProduct() {
		textProduct.setText("");
	}
	

}
