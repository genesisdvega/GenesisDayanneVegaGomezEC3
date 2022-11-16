package com.idat.EC3GenesisVegaGomez.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC3GenesisVegaGomez.dto.ClienteDTORequest;
import com.idat.EC3GenesisVegaGomez.dto.ClienteDTOResponse;
import com.idat.EC3GenesisVegaGomez.dto.HospitalDTORequest;
import com.idat.EC3GenesisVegaGomez.dto.HospitalDTOResponse;
import com.idat.EC3GenesisVegaGomez.model.Hospital;
import com.idat.EC3GenesisVegaGomez.repository.HospitalRepository;



@Service
public class HospitalServiceImpl implements HospitalService {
	
	@Autowired
	private HospitalRepository repository;

	@Override
	public void guardarHospital(HospitalDTORequest hospital) {
		
		Hospital p = new Hospital();
		p.setIdHospital(hospital.getIdHospital());
		p.setNombre(hospital.getNombre());
		p.setDescripcion(hospital.getDescripcion());
		p.setDistrito(hospital.getDistrito());
		repository.save(p);
	}

	@Override
	public void actualizarHospital(HospitalDTORequest hospital) {
		// TODO Auto-generated method stub
		
		Hospital p = new Hospital();
		p.setIdHospital(hospital.getIdHospital());
		p.setNombre(hospital.getNombre());
		p.setDescripcion(hospital.getDescripcion());
		p.setDistrito(hospital.getDistrito());

		repository.saveAndFlush(p);
	}

	@Override
	public void eliminarHospital(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<HospitalDTOResponse> listarHospitales() {
		
		List<HospitalDTOResponse> listar = new ArrayList<>();
		
		HospitalDTOResponse dto = null;
		
		List<Hospital> p = repository.findAll();
		
		for (Hospital hospital : p) {
			
			dto = new HospitalDTOResponse();
			
			dto.setIdHospital(hospital.getIdHospital());
			dto.setNombre(hospital.getNombre());
			dto.setDescripcion(hospital.getDescripcion());
			dto.setDistrito(hospital.getDistrito());
			
			listar.add(dto);
		}
		
		return listar;
	}
			
		
	@Override
	public HospitalDTOResponse obtenerHospitalId(Integer id) {
		// TODO Auto-generated method stub
		
		Hospital hospital = repository.findById(id).orElse(null);
		HospitalDTOResponse dto = new HospitalDTOResponse();
		
		dto.setIdHospital(hospital.getIdHospital());
		dto.setNombre(hospital.getNombre());
		dto.setDescripcion(hospital.getDescripcion());
		dto.setDistrito(hospital.getDistrito());
		
		return dto;
	}

}
