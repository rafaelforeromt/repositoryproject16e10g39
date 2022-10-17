package com.project16.project16.service;

import com.project16.project16.entities.Category;
import com.project16.project16.entities.Reservation;
import com.project16.project16.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAll(){
        return reservationRepository.getAll();
    }
    public Optional<Reservation> getReservation(int id){
        return reservationRepository.getReservation(id);
    }

    public Reservation save(Reservation p){
        if(p.getIdReservartion()==null){
            return reservationRepository.save(p);
        }else{
            Optional<Reservation> e = reservationRepository.getReservation(p.getIdReservartion());
            if(e.isPresent()){
                return e.get();
            }else{
                return reservationRepository.save(p);
            }
        }
    }

    public Reservation update(Reservation p){
        if(p.getIdReservartion()!=null){
            Optional<Reservation> q= reservationRepository.getReservation(p.getIdReservartion());
            if(q.isPresent()){
                if(p.getStatus()!=null){
                    q.get().setStatus(p.getStatus());
                }
                reservationRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }

    public boolean delete(int id){
        boolean flag=false;
        Optional<Reservation>p= reservationRepository.getReservation(id);
        if(p.isPresent()){
            reservationRepository.delete(p.get());
            flag=true;
        }
        return flag;
    }

}
