package com.example.demo.AMCI2.JPA;

import com.example.demo.AMCI2.Model.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryReservation extends JpaRepository<Reservation,Integer> {
}
