package com.example.demo.AMCI2.Service;

import com.example.demo.AMCI2.Model.Reservation;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ServiceInfo {
    public String add_Reservation(Reservation reservation);
    public Reservation update_Reservations(int carId, Reservation reservation);
    public String delete_Reservations(int  carId);
    public List<Reservation> getReservations();
}
