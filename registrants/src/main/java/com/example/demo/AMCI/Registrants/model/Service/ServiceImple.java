package com.example.demo.AMCI.Registrants.model.Service;

import com.example.demo.AMCI.Registrants.model.Registrants;
import com.example.demo.AMCI.Registrants.model.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImple implements ServiceInfo {
    @Autowired
    Repo repo;

    @Override
    public String add_Registrants(Registrants registrants) {
        repo.save(registrants);
        return "added";
    }

    @Override
    public Registrants update_Registrants(int ID, Registrants registrants) {
        Registrants res1=null;
        Registrants res = repo.findById(ID).get();
        res.setFirst_name(registrants.getFirst_name());
        res.setLast_name(registrants.getLast_name());
        res.setEmail_address(registrants.getEmail_address());
        res.setIs_lisenced(registrants.getIs_lisenced());
        res.setDid_agreed_to_disclaimers(registrants.getDid_agreed_to_disclaimers());
        res.setLead_submission_response(registrants.getLead_submission_response());
        res.setPhone_number(registrants.getPhone_number());
        res.setIs_over_21(registrants.getIs_over_21());

        res1=repo.save(res);
        return res1;
    }

    @Override
    public String delete_Registrants(int ID) {
        Registrants reg = null;
        if (repo.findById(ID) != null) {
            repo.deleteById(ID);
        }

        return "deleted";
    }

    @Override
    public List<Registrants> getRegistrants() {
        List<Registrants> reg = repo.findAll();
        return reg;
    }
}
