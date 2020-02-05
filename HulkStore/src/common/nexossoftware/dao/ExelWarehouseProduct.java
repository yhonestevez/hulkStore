/**
 * 
 */
package common.nexossoftware.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import common.nexossoftware.model.WarehouseProduct;
import common.nexossoftware.utils.Excel;
import common.nexossoftware.utils.GetProperties;
import common.nexossofware.exception.HolkStroreEception;

/**
 * @author Yhon
 *
 */
public class ExelWarehouseProduct implements WarehouseProductDAO {
	
	private static Logger logger = Logger.getLogger(ExelWarehouseProduct.class);
	private static String path = null;
	

	public ExelWarehouseProduct() {
		path = GetProperties.getInstance().getdataProperties("path_excel");
	}

	@Override
	public void insert(WarehouseProduct data) {

	}

	@Override
	public void update(WarehouseProduct data) {
		// TODO Auto-generated method stub

	}

	@Override
	public WarehouseProduct consult(WarehouseProduct product) {

		List<ArrayList<String>> data;
		try {
			data = Excel.readAll(path, "Hoja1");

			for (int i = 0; i < data.size(); i++) {
				if (data.get(i).get(0).contains(product.getProductName())) {
					product.setId(i);
					product.setQuantity(Integer.parseInt((data.get(i).get(1))));
					product.setPrice(Double.parseDouble(data.get(i).get(2)));
					return product;
				}
			}
		} catch (HolkStroreEception e) {
			logger.error(e.getMessage());
		}
		return null;

	}
}