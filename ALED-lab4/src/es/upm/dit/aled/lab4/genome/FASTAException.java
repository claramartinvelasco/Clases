package es.upm.dit.aled.lab4.genome;

/**
 * Exception to wrap errors especific to the processing of FASTA files.
 * 
 * @author mmiguel, rgarciacarmona
 *
 */
public class FASTAException extends Exception{

	public FASTAException(String msg) {
		super(msg);
	}
}
