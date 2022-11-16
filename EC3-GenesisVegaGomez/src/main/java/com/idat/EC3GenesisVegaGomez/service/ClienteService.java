package com.idat.EC3GenesisVegaGomez.service;

import java.util.Collection;
import java.util.List;

import com.idat.EC3GenesisVegaGomez.dto.ClienteDTORequest;
import com.idat.EC3GenesisVegaGomez.dto.ClienteDTOResponse;
import com.idat.EC3GenesisVegaGomez.dto.ReservaDTORequest;




public interface ClienteService {

	void guardarCliente(ClienteDTORequest cliente);

	void actualizarCliente(ClienteDTORequest cliente);

	void eliminarCliente(Integer id);

	List<ClienteDTOResponse> listarClientes();

	ClienteDTOResponse obtenerClienteId(Integer id);
	
	public abstract Collection<Object[]> listReservas();

}
