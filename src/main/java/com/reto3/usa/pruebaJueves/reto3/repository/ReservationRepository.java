
package com.reto3.usa.pruebaJueves.reto3.repository;

import com.reto3.usa.pruebaJueves.reto3.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
    
}
