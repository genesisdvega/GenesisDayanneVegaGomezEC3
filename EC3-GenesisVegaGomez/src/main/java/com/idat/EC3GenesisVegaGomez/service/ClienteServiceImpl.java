package com.idat.EC3GenesisVegaGomez.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC3GenesisVegaGomez.dto.ClienteDTORequest;
import com.idat.EC3GenesisVegaGomez.dto.ClienteDTOResponse;
import com.idat.EC3GenesisVegaGomez.dto.ReservaDTORequest;
import com.idat.EC3GenesisVegaGomez.model.Cliente;
import com.idat.EC3GenesisVegaGomez.repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;

	@Override
	public void guardarCliente(ClienteDTORequest cliente) {

		Cliente p = new Cliente();
		p.setIdCliente(cliente.getIdCliente());
		p.setNombre(cliente.getNombre());
		p.setCelular(cliente.getCelular());
		repository.save(p);
	}

	@Override
	public void actualizarCliente(ClienteDTORequest cliente) {
		// TODO Auto-generated method stub

		Cliente p = new Cliente();

		p.setIdCliente(cliente.getIdCliente());
		p.setNombre(cliente.getNombre());
		p.setCelular(cliente.getCelular());
		repository.saveAndFlush(p);
	}

	@Override
	public void eliminarCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<ClienteDTOResponse> listarClientes() {

		List<ClienteDTOResponse> listar = new ArrayList<>();

		ClienteDTOResponse dto = null;

		List<Cliente> p = repository.findAll();

		for (Cliente cliente : p) {

			dto = new ClienteDTOResponse();

			dto.setIdCliente(cliente.getIdCliente());
			dto.setNombre(cliente.getNombre());
			dto.setCelular(cliente.getCelular());

			listar.add(dto);
		}

		return listar;
	}

	@Override
	public ClienteDTOResponse obtenerClienteId(Integer id) {
		// TODO Auto-generated method stub

		Cliente cliente = repository.findById(id).orElse(null);
		ClienteDTOResponse dto = new ClienteDTOResponse();

		dto.setIdCliente(cliente.getIdCliente());
		dto.setNombre(cliente.getNombre());
		dto.setCelular(cliente.getCelular());

		return dto;
	}

	@Override
	public Collection<Object[]> listReservas() {
		return repository.listReservas();
	}

}
