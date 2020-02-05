/**
 * 
 */
package common.nexissoftware.controller;

import common.nexossoftware.dao.ExcelOutputPoduct;
import common.nexossoftware.dao.ExelProductEntered;
import common.nexossoftware.model.OutputProduct;
import common.nexossoftware.model.ProductEntered;

/**
 * @author Yhon
 *
 */
public class ControllerHulkStore {
	/**
	 * ExcelOutputPoduct
	 */
	private ExcelOutputPoduct excelOutputPoduct;
	/**
	 * ExelProductEntered
	 */
	private ExelProductEntered exelProductEntered;
	
	/**
	 * Constructor
	 */
	public ControllerHulkStore( ) {
		excelOutputPoduct=new ExcelOutputPoduct();
		exelProductEntered= new ExelProductEntered();
	}
	
	/**
	 * Actualiza los datos enviados
	 * @param outputPoduct
	 */
	public void updateProduct(OutputProduct outputPoduct) {
		
		excelOutputPoduct.update(outputPoduct);
		
	}
	/**
	 * Consuta el producto
	 * @param outputPoduct
	 * @return
	 */
	public OutputProduct consult(OutputProduct outputPoduct) {
		
		excelOutputPoduct.consult(outputPoduct);
		return outputPoduct;
		
	}
	
	/**
	 * Actualiza los datos enviados
	 * @param outputPoduct
	 */
	public void updateProduct(ProductEntered productEntered) {
		
		exelProductEntered.update(productEntered);
		
	}
	/**
	 * Consuta el producto
	 * @param outputPoduct
	 * @return
	 */
	public ProductEntered consult(ProductEntered productEntered) {
		
		
		return exelProductEntered.consult(productEntered);
		
	}
	/**
	 * Este metodo se utiliza 
	 * para insertar un nuevo producto
	 * @param productEntered
	 */
	public void insert(ProductEntered productEntered) {
		exelProductEntered.insert(productEntered);
	}
}
