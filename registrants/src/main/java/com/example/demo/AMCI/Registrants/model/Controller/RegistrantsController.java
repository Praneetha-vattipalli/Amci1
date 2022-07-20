package com.example.demo.AMCI.Registrants.model.Controller;

import com.example.demo.AMCI.Registrants.model.Registrants;
import com.example.demo.AMCI.Registrants.model.Service.ServiceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class RegistrantsController {
    @Autowired
    ServiceInfo si;
    @PostMapping("addRegistrants")
    public String addRegistrants(@RequestBody Registrants reg){
        String r= si.add_Registrants(reg);
        return "added";

    }
    @PutMapping("UpdateRegistrants/{ID}")
    public Registrants updateRegistrants(@PathVariable(value = "ID")int ID,@RequestBody Registrants registrants){
        Registrants r= si.update_Registrants(ID,registrants);
        return r;

    }
    @DeleteMapping("deleteRegistrants/{ID}")
    public String deleteRegistrants(@PathVariable(value="ID")int ID){
        String  r= si.delete_Registrants(ID);
        return "Deleted";

    }
    @GetMapping("getRegistrants")
    public List<Registrants> getRegistrants(){
        List<Registrants> r= si.getRegistrants();
        return r;

    }

}
