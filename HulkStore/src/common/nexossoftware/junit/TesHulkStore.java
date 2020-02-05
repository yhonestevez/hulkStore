/**
 * 
 */
package common.nexossoftware.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.swing.JPanel;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;

import common.nexissoftware.controller.ControllerHulkStore;
import common.nexossoftware.model.OutputProduct;
import common.nexossoftware.model.ProductEntered;
import common.nexossoftware.vista.EnterProduct;
import common.nexossoftware.vista.OutputProductPanel;
import common.nexossoftware.vista.RemainingProduct;
import common.nexossoftware.vista.SearchProduct;

/**
 * @author Yhon
 *
 */
public class TesHulkStore {
	private static Logger logger = Logger.getLogger(TesHulkStore.class);
	/**
	 * contentPane
	 */
	private JPanel contentPane;
	/**
	 * outputPoduct
	 */
	private OutputProduct product;
	/**
	 * Se guarda el objeto donde se encuentran los metodos para consultar datos
	 */
	private ControllerHulkStore controllerHulkStore;
	/**
	 * Buscar producto
	 */
	private SearchProduct searchProduct;
	/**
	 * Datos de producto
	 */
	private ProductEntered productEntered;
	/**
	 * Producto ingresado
	 */
	private EnterProduct enterProduct;
	/**
	 * Cantidad de producto en bodega
	 */
	private RemainingProduct remainingProduct;
	@Before
	public void before() {
		String log4jConfPath = "resources\\log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		controllerHulkStore = new ControllerHulkStore();
		productEntered = new ProductEntered();
		product = new OutputProduct();
	}
	@Test
	public void testConsult() {
		//para realizar la prueba debe existir el producto con el nombre pan 
//		en el archivo que se encuentra en la carpeta files
		productEntered.setProductName("pan");
		productEntered=controllerHulkStore.consult(productEntered);
		assertEquals("Se realizo la consulta correctaente", productEntered.getProductName(), "pan");
	}

	
	@Test
	public void testUpdate() {
		
		product.setId(1);
		product.setQuantity(3);
		product.setSalePrice(Double.parseDouble("230.0"));
		product.setProductName("pan");
		controllerHulkStore.updateProduct(product);
		productEntered.setProductName("pan");
		productEntered=controllerHulkStore.consult(productEntered);
		logger.info(" precio "+String.valueOf(productEntered.getSalePrice()));
		assertEquals("Se realizo la consulta correctaente", String.valueOf(productEntered.getSalePrice()), "230.0");
	}
	
	@Test
	public void testInsert() {
		productEntered.setProductName("pan2");
		productEntered.setQuantity(30);
		productEntered.setPrice(Double.valueOf("456.0"));
		controllerHulkStore.insert(productEntered);
		productEntered.setProductName("pan");
		productEntered=controllerHulkStore.consult(productEntered);
		logger.info(" precio "+String.valueOf(productEntered.getProductName()));
		logger.info(" precio "+String.valueOf(productEntered.getSalePrice()));
		assertEquals("Se realizo la consulta correctaente",productEntered.getProductName() , "pan");
	}
	
}
