package it.betacom.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity

public class Presidente implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private int id_presidente;
	private String nome;
	private String cognome;
	
	@OneToOne
    private Istituto istituto;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId_presidente() {
		return id_presidente;
	}

	public void setId_presidente(int id_presidente) {
		this.id_presidente = id_presidente;
	}






	public String getNome() {
		return nome;
	}






	public void setNome(String nome) {
		this.nome = nome;
	}






	public String getCognome() {
		return cognome;
	}






	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setIstituto(Istituto istituto) {
		// TODO Auto-generated method stub
		
	}




   
}

