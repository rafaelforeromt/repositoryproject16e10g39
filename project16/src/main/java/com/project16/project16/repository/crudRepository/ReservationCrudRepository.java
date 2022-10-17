package com.project16.project16.repository.crudRepository;

import com.project16.project16.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
