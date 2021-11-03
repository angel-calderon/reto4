
package com.reto3.usa.pruebaJueves.reto3.services;

import com.reto3.usa.pruebaJueves.reto3.entity.Reservation;
import com.reto3.usa.pruebaJueves.reto3.repository.ReservationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository repositorio;
    
    //Create
    public Reservation saveReservation(Reservation reservation){
       return repositorio.save(reservation);
    }
       
    //Read
    public List<Reservation> getReservationAll(){
        return repositorio.findAll();
    }
    
    //Update
    public Reservation updatReservation(Reservation reservation){
        Reservation existeReservation=repositorio.findById(reservation.getIdReservation()).orElse(null);
        existeReservation.setStartDate(reservation.getStartDate());
        existeReservation.setDevolutionDate(reservation.getDevolutionDate());
        return repositorio.save(existeReservation);
    }
    //Delete
    public String deleteReservation(int idReservation){
        repositorio.deleteById(idReservation);
        return "Registro con id "+idReservation+" ha sido eliminado";
    }
}
