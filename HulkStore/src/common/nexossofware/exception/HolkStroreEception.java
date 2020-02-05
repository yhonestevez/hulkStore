/**
 * 
 */
package common.nexossofware.exception;

/**
 * @author Yhon
 *
 */

@SuppressWarnings("serial")
public class HolkStroreEception  extends Exception{

	public HolkStroreEception() {
		
	}
	/**
	 * Este metodo recibe como parametro el texto que se desea mostrar
	 * Cuando sucede un error
	 * @param message
	 */
	public HolkStroreEception (String message) {
		
		super(message);
	}
}
