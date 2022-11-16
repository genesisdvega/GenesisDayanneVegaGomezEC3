package com.idat.EC3GenesisVegaGomez.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ClienteHospitalFK implements Serializable {

	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;

	@Column(name = "id_hospital", nullable = false, unique = true)
	public Integer idHospital;

	@Column(name = "id_cliente", nullable = false, unique = true)
	public Integer idCliente;

	public Integer getIdHospital() {
		return idHospital;
	}

	public void setIdHospital(Integer idHospital) {
		this.idHospital = idHospital;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

}
