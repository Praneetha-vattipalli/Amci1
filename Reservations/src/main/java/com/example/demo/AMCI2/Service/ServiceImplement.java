package com.example.demo.AMCI2.Service;

import com.example.demo.AMCI2.JPA.RepositoryReservation;
import com.example.demo.AMCI2.Model.Reservation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImplement implements ServiceInfo{
    @Autowired
    RepositoryReservation repo;
    @Override
    public String add_Reservation(Reservation reservation) {
     repo.save(reservation);
        return "added";
    }

    @Override
    public Reservation update_Reservations(int carId, Reservation reservation) {
        Reservation res=null;
       Reservation res1=repo.findById(carId).get();
       res1.setAddress(reservation.getAddress());
       res1.setAddress2(reservation.getAddress2());
       res1.setCity(reservation.getCity());
       res1.setCompaignId(reservation.getCompaignId());
       res1.setDuration(reservation.getDuration());
       res1.setEnrouteSent(reservation.getEnrouteSent());
       res1.setDidRequestSmsUpdates(reservation.getDidRequestSmsUpdates());
       res1.setNotes(reservation.getNotes());
       res=repo.save(res1);
        return res;
    }

    @Override
    public String delete_Reservations(int carId) {
        repo.deleteById(carId);
        return "deleted";
    }

    @Override
    public List<Reservation> getReservations() {
        List<Reservation> reservationsList=repo.findAll();
        return reservationsList;
    }
}
