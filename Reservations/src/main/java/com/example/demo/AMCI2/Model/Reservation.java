package com.example.demo.AMCI2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="reservation")
public class Reservation {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    int carId;
    int modelId;
    int compaignId;
    int instructionId;
    String address;
    String address2;
    String city;
    String state;
    String zip;
    String notes;
    String urlParams;
    String startsAt;
    String duration;
    String preDuration;
    String postDuration;
    String confirmationSent;
    String reminderSent;
    String reminderSecoundToLastSent;
    String reminderThirdToLastSent;
    String rescheduleSent;
    String rescheduleSecoundSent;
    String rescheduleThirdSent;
    String thankYouSent;
    String enrouteSent;
    String didRequestSmsUpdates;
    String startedAt;
    String completedAt;
    String cancelledAt;
    String tookenJobId;
    String tookenCompletedAt;
    String tookenCachedAt;
    String accessToken;
    String cancellationSent;
    String status;
}
