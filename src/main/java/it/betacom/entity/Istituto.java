package it.betacom.entity;

import java.io.Serializable;

import javax.persistence.*;
@Entity
public class Istituto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_istituto;
	private String nome;
	
	public Istituto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return nome;
	}
	public void setName(String name) {
		this.nome = name;
	}

	public int getId_istituto() {
		return id_istituto;
	}

	public void setId_istituto(int id_istituto) {
		this.id_istituto = id_istituto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
