package common.nexossoftware.vista;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import org.apache.log4j.Logger;

import common.nexossofware.exception.HolkStroreEception;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EnterProduct extends JPanel {
	
	private static Logger logger = Logger.getLogger(EnterProduct.class);
	/**
	 * Se guarda el JTextField
	 */
	private JTextField textNameProduct;
	/**
	 * Se guarda el JTextField
	 */
	private JTextField textQuantity;
	/**
	 * Se guarda el JTextField
	 */
	private JTextField textPrice;
	/**
	 * Se gurda el objeto de la clase principal
	 */
	private Principal principal;

	public EnterProduct(Principal principal) {
		this();
		this.principal= principal;
	}
	/**
	 * Create the panel.
	 */
	public EnterProduct() {
		setBorder(new TitledBorder(null, "Ingresar nuevo producto", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Producto");
		add(lblNewLabel);
		
		textNameProduct = new JTextField();
		add(textNameProduct);
		textNameProduct.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad");
		add(lblNewLabel_1);
		
		textQuantity = new JTextField();
		add(textQuantity);
		textQuantity.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Valor");
		add(lblNewLabel_2);
		
		textPrice = new JTextField();
		add(textPrice);
		textPrice.setColumns(10);
		
		JButton save = new JButton("Guarda");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					principal.inserProduct();
				} catch (HolkStroreEception e1) {
					logger.error(e1.getMessage());
				}
			}
		});
		add(save);

	}

	public String getTextNameProduct() {
		return textNameProduct.getText();
	}

	public void setTextNameProduct(String textNameProduct) {
		this.textNameProduct.setText(textNameProduct);;
	}

	public String getTextQuantity() {
		return textQuantity.getText();
	}

	public void setTextQuantity(String textQuantity) {
		this.textQuantity.setText(textQuantity);
	}

	public String getTextPrice() {
		return textPrice.getText();
	}

	public void setTextPrice(String  textPrice) {
		this.textPrice.setText(textPrice);
	}

	/**
	 * Se utiliza para limpiar los campos
	 */
	public void clearEnterProduct() {
		setTextNameProduct("");
		setTextPrice("");
		setTextQuantity("");
	}
}
