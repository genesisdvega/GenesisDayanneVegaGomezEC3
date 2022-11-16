package com.idat.EC3GenesisVegaGomez.dto;

import com.idat.EC3GenesisVegaGomez.model.Reserva;

public class ReservaDTOResponse {

	private Integer id_hospital;

	private Integer id_cliente;

	public Integer getIdHospital() {
		return id_hospital;
	}

	public ReservaDTOResponse(Integer id_hospital, Integer id_cliente) {
		super();
		this.id_hospital = id_hospital;
		this.id_cliente = id_cliente;
	}

	public ReservaDTOResponse(Reserva reserva) {
		this(reserva.getFk().getIdHospital(), reserva.getFk().getIdCliente());
	}

	public Integer getId_hospital() {
		return id_hospital;
	}

	public void setId_hospital(Integer id_hospital) {
		this.id_hospital = id_hospital;
	}

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

}
