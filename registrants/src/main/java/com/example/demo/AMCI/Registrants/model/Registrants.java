package com.example.demo.AMCI.Registrants.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;



    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Registrants {
        @Id
        int  ID ;
        String   first_name  ;
        String   last_name;
        String   email_address;
        String  phone_number;
        String is_over_21 ;
        String is_lisenced ;
        String did_agreed_to_disclaimers ;
        String lead_submission_response;
    }


