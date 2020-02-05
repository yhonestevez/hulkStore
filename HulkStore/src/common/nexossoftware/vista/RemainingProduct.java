package common.nexossoftware.vista;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class RemainingProduct extends JPanel {
	/**
	 * Se guarda el valor de la cantidad de producto en la bodega
	 */
	private JTextField txtTextproductcostinstock;

	/**
	 * Create the panel.
	 */
	public RemainingProduct() {
		setBorder(new TitledBorder(null, "Producto restante", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(0, 2, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Producto restante");
		add(lblNewLabel);
		
		txtTextproductcostinstock = new JTextField();
		add(txtTextproductcostinstock);
		txtTextproductcostinstock.setColumns(10);

	}

	/**
	 * Este metodo se utiliza paara enviar el valor 
	 * equivalente a la cantidad de producto
	 * @param txtTextproductcostinstock
	 */
	public void setTxtTextproductcostinstock(String txtTextproductcostinstock) {
		this.txtTextproductcostinstock.setText(txtTextproductcostinstock);
	}
	
	public void clearRemainingProduct() {
		txtTextproductcostinstock.setText("");
		
	}
	
}
