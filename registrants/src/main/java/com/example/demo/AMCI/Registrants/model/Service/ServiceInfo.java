package com.example.demo.AMCI.Registrants.model.Service;

import com.example.demo.AMCI.Registrants.model.Registrants;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceInfo {
    public String add_Registrants(Registrants registrants);
    public Registrants update_Registrants(int ID, Registrants registrants);
    public String delete_Registrants(int ID);
    public List<Registrants> getRegistrants();

}
