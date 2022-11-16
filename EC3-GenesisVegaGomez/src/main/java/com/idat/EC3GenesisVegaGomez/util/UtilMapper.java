package com.idat.EC3GenesisVegaGomez.util;

import java.util.ArrayList;
import java.util.Collection;

import com.idat.EC3GenesisVegaGomez.dto.ReservaDTORequest;
import com.idat.EC3GenesisVegaGomez.model.Reserva;





public class UtilMapper {
    public static Collection<ReservaDTORequest> toReserva(Collection<Reserva> reservas) {
        Collection<ReservaDTORequest> mapper = new ArrayList<>();

        for (Reserva reserva : reservas) {
        	ReservaDTORequest reservaMapper = new ReservaDTORequest(reserva);
            mapper.add(reservaMapper);
        }

        return mapper;
    }

 
}
