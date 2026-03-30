package com.codingshuttle.hms.entities;

import com.codingshuttle.hms.enums.BloodGroupType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@ToString
@Builder
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

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE, CascadeType.REMOVE}, orphanRemoval = true)
    @JoinColumn(name = "patient_insurance")
    Insurance insurance; // owning side of the relationship

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    @ToString.Exclude
    List<Appointment> patientAppointments = new ArrayList<>(); // inverse side of the relationship
}
