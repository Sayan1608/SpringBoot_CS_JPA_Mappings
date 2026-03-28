package com.codingshuttle.hms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, length = 100, unique = true)
    String name;

    @OneToOne
    @JoinColumn(name = "hod_id")
    Doctor headOfDepartment; // owning side of the relationship, foreign key in Department table referencing Doctor

    @ManyToMany
    List<Doctor> doctors = new ArrayList<>();
}
