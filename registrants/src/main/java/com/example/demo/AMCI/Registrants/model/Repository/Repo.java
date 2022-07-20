package com.example.demo.AMCI.Registrants.model.Repository;

import com.example.demo.AMCI.Registrants.model.Registrants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface Repo extends JpaRepository<Registrants,Integer> {
    //Registrants findAllById(int ID);
}
