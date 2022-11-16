package com.idat.EC3GenesisVegaGomez.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.idat.EC3GenesisVegaGomez.dto.ClienteDTORequest;
import com.idat.EC3GenesisVegaGomez.dto.ClienteDTOResponse;
import com.idat.EC3GenesisVegaGomez.dto.HospitalDTORequest;
import com.idat.EC3GenesisVegaGomez.dto.HospitalDTOResponse;
import com.idat.EC3GenesisVegaGomez.dto.UsuarioClienteDTORequest;
import com.idat.EC3GenesisVegaGomez.dto.UsuarioClienteDTOResponse;
import com.idat.EC3GenesisVegaGomez.model.UsuarioCliente;
import com.idat.EC3GenesisVegaGomez.repository.HospitalRepository;
import com.idat.EC3GenesisVegaGomez.repository.UsuarioClienteRepository;


@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService {

	@Autowired
	private UsuarioClienteRepository repository;

	BCryptPasswordEncoder bcp;

	@Override
	public void guardarUsuarioCliente(UsuarioClienteDTORequest usuarioCliente) {

		UsuarioCliente p = new UsuarioCliente();
		p.setIdUsuario(usuarioCliente.getIdUsuario());
		p.setUsuario(usuarioCliente.getUsuario());
		p.setPassword(bcp.encode(usuarioCliente.getPassword()));
		p.setRol(usuarioCliente.getRol());

		repository.save(p);
	}

	@Override
	public void actualizarUsuarioCliente(UsuarioClienteDTORequest usuarioCliente) {
		// TODO Auto-generated method stub

		UsuarioCliente p = new UsuarioCliente();
		p.setIdUsuario(usuarioCliente.getIdUsuario());
		p.setUsuario(usuarioCliente.getUsuario());
		p.setPassword(bcp.encode(usuarioCliente.getPassword()));
		p.setRol(usuarioCliente.getRol());

		repository.saveAndFlush(p);
	}

	@Override
	public void eliminarUsuarioCliente(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<UsuarioClienteDTOResponse> listarUsuarioClientes() {

		List<UsuarioClienteDTOResponse> listar = new ArrayList<>();

		UsuarioClienteDTOResponse dto = null;

		List<UsuarioCliente> p = repository.findAll();

		for (UsuarioCliente usuarioCliente : p) {

			dto = new UsuarioClienteDTOResponse();

			dto.setIdUsuario(usuarioCliente.getIdUsuario());
			dto.setUsuario(usuarioCliente.getUsuario());
			dto.setPassword(usuarioCliente.getPassword());
			dto.setRol(usuarioCliente.getRol());

			listar.add(dto);
		}

		return listar;
	}

	@Override
	public UsuarioClienteDTOResponse obtenerUsuarioClienteId(Integer id) {
		// TODO Auto-generated method stub

		UsuarioCliente usuarioCliente = repository.findById(id).orElse(null);
		UsuarioClienteDTOResponse dto = new UsuarioClienteDTOResponse();

		dto.setIdUsuario(usuarioCliente.getIdUsuario());
		dto.setUsuario(usuarioCliente.getUsuario());
		dto.setPassword(bcp.encode(usuarioCliente.getPassword()));
		dto.setRol(usuarioCliente.getRol());
		return dto;
	}

}
