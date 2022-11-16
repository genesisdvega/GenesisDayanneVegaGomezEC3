package com.idat.EC3GenesisVegaGomez.service;

import java.util.List;

import com.idat.EC3GenesisVegaGomez.dto.HospitalDTORequest;
import com.idat.EC3GenesisVegaGomez.dto.HospitalDTOResponse;

public interface HospitalService {

	void guardarHospital(HospitalDTORequest hospital);

	void actualizarHospital(HospitalDTORequest hospital);

	void eliminarHospital(Integer id);

	List<HospitalDTOResponse> listarHospitales();

	HospitalDTOResponse obtenerHospitalId(Integer id);

}
