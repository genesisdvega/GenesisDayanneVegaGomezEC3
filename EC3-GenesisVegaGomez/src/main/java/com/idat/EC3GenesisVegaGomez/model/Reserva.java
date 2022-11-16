package com.idat.EC3GenesisVegaGomez.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.idat.EC3GenesisVegaGomez.model.ClienteHospitalFK;

@Entity
@Table(name = "reserva")
public class Reserva {

	@Id
	public ClienteHospitalFK fk = new ClienteHospitalFK();

	public ClienteHospitalFK getFk() {
		return fk;
	}

	public void setFk(ClienteHospitalFK fk) {
		this.fk = fk;
	}

	
	
}

