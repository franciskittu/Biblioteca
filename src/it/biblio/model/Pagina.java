package it.biblio.model;

import java.sql.Timestamp;

/**
 * Interfaccia del Plain Old Java Object della Entità Pagina.
 * Contiene metodi get e set per ogni attributo dell'entità.
 * Transfer Object del pattern DAO
 *  
 * @author francesco
 *
 */
public interface Pagina {
	
	long getID();
	
	String getNumero();
	void setNumero(String numero);
	
	String getPathImmagine();
	void setPathImmagine(String path);
	
	String getPathTrascrizione();
	void setPathTrascrizione(String path);
	
	Timestamp getUploadImmagine();
	void setUploadImmagine(Timestamp ts);
	
	Timestamp getUltimaModificaTrascrizione();
	void setUltimaModificaTrascrizione(Timestamp ts);
	
	Boolean getImmagineValidata();
	void setImmagineValidata(Boolean b);

	Boolean getTrascrizioneValidata();
	void setTrascrizioneValidata(Boolean b);
	
	Opera getOpera();
	void setOpera(Opera O);
	
}
