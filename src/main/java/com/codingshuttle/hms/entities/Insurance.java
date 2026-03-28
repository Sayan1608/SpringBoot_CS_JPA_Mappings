package com.codingshuttle.hms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, unique = true, length = 50)
    String policyNumber;

    @Column(nullable = false, length = 100)
    String provider;

    @Column(nullable = false)
    LocalDate validUntil;

    @CreationTimestamp
    LocalDateTime createdAt;

    @OneToOne(mappedBy = "insurance")
    Patient patient; // inverse side of one-to-one relationship with Patient
}
