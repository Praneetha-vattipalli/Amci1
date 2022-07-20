package com.example.demo.AMCI2.Controller;

import com.example.demo.AMCI2.Model.Reservation;

import com.example.demo.AMCI2.Service.ServiceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ReservationController {
@Autowired
ServiceInfo si;
@PostMapping("/addReservation")
    public String AddReservations(@RequestBody Reservation reservations){
  si.add_Reservation(reservations);
  return "added";


}
@PatchMapping("UpdateReservations/{carId}")
    public  Reservation  UpdateReservation(@PathVariable(value="carId") int carId,@RequestBody Reservation reservation){
    Reservation res=si.update_Reservations(carId,reservation);
    return res;

}
@DeleteMapping("deleteReservations/{carId}")
    public String deleteReservations(@PathVariable(value="carId")int carId){
    String res=si.delete_Reservations(carId);
    return "delete reservation";

}
@GetMapping("ListOfReservation")
    public List<Reservation> GetReservation(){
    List<Reservation> res=si.getReservations();
    return res;

}
}
