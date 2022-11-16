package com.idat.EC3GenesisVegaGomez.service;

import java.util.List;

import com.idat.EC3GenesisVegaGomez.dto.UsuarioClienteDTORequest;
import com.idat.EC3GenesisVegaGomez.dto.UsuarioClienteDTOResponse;

public interface UsuarioClienteService {

	void guardarUsuarioCliente(UsuarioClienteDTORequest usuarioCliente);

	void actualizarUsuarioCliente(UsuarioClienteDTORequest usuarioCliente);

	void eliminarUsuarioCliente(Integer id);

	List<UsuarioClienteDTOResponse> listarUsuarioClientes();

	UsuarioClienteDTOResponse obtenerUsuarioClienteId(Integer id);

}
