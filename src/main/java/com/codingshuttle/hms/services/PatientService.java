package com.codingshuttle.hms.services;

import com.codingshuttle.hms.entities.Insurance;
import com.codingshuttle.hms.entities.Patient;
import com.codingshuttle.hms.repositories.InsuranceRepository;
import com.codingshuttle.hms.repositories.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;
    private final InsuranceRepository insuranceRepository;

    @Transactional
    public Insurance addInsuranceToPatient(Long patientId, Insurance insurance) {
        Patient patient = getPatient(patientId);
        patient.setInsurance(insurance); // patient dirtied
        insurance.setPatient(patient); // optional: set the patient reference in the insurance entity
        return insurance;
    }


    @Transactional
    public Insurance updateInsuranceOfAPatient(Long patientId, Insurance insurance) {
        Patient patient = getPatient(patientId);
        patient.setInsurance(insurance); // patient dirtied
        insurance.setPatient(patient); // optional: set the patient reference in the insurance entity
        return insurance;
    }

    @Transactional
    public Patient removeInsuranceOfAPatient(Long patientId) {
        Patient patient = getPatient(patientId);
        patient.setInsurance(null); // patient dirtied
        return patient;
    }

    private @NonNull Patient getPatient(Long patientId) {
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        return patient;
    }

    @Transactional
    public void deletePatient(Long patientId) {
        getPatient(patientId);
        patientRepository.deleteById(patientId);
    }
}
