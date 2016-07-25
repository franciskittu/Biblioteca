package it.biblio.model.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import it.biblio.model.Ruolo;

/**
 * Implementazionde del Plain Old Java Object relativo all'interfaccia Ruolo
 *  
 * @author francesco
 *
 */
public class RuoloImpl implements Ruolo {

	private long ID;
	private String nome,descrizione;
	
	/**
	 * Oggetto DAO per l'accesso al DB.
	 */
	private DataLayerImpl datalayer;
	
	/**
	 * Costruttore base che genera un oggetto "vuoto".
	 * @param datalayer
	 */
	public RuoloImpl(DataLayerImpl datalayer){
		ID = 0;
		nome = descrizione = "";
		this.datalayer = datalayer;
		
	}
	
	/**
	 * costruttore helper che costruisce l'oggetto dai risultati di una query
	 * 
	 * @param datalayer
	 * @param dati
	 * @throws SQLException
	 */
	public RuoloImpl(DataLayerImpl datalayer, ResultSet dati) throws SQLException{
		ID = dati.getLong("ID");
		nome = dati.getString("nome");
		descrizione = dati.getString("descrizione");
		this.datalayer = datalayer;
	}
	@Override
	public long getID() {
		return ID;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String Nome) {
		this.nome = nome;

	}

	@Override
	public String getDescrizione() {
		return descrizione;
	}

	@Override
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;

	}

}
