package com.codingshuttle.hms.entities;

import com.codingshuttle.hms.enums.BloodGroupType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String email;

    LocalDate birthDate;

    String gender;

    @Enumerated(EnumType.STRING)
    BloodGroupType bloodGroupType;

    LocalDateTime createdAt;

    @OneToOne
    @JoinColumn(name = "patient_insurance")
    Insurance insurance; // owning side of the relationship

    @OneToMany(mappedBy = "patient")
    List<Appointment> patientAppointments; // inverse side of the relationship
}
