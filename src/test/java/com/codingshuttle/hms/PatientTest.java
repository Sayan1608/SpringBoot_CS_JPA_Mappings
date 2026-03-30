package com.codingshuttle.hms;

import com.codingshuttle.hms.entities.Insurance;
import com.codingshuttle.hms.entities.Patient;
import com.codingshuttle.hms.services.InsuranceService;
import com.codingshuttle.hms.services.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class PatientTest {

    @Autowired
    private PatientService patientService;

    @Autowired
    private InsuranceService insuranceService;

    @Test
    void testAssignInsuranceToPatient(){
        Insurance insurance = Insurance.builder()
                .provider("HealthCare Inc.")
                .policyNumber("HC123456789")
                .validUntil(LocalDate.of(2025, 12, 31))
                .build();
        Insurance savedInsurance = patientService.addInsuranceToPatient(1L, insurance);
        System.out.println(savedInsurance);
//        System.out.println("Trying to delete patient with id 1");
//        patientService.deletePatient(1L);

//        Insurance insurance2 = Insurance.builder()
//                .provider("HealthCare Inc.")
//                .policyNumber("ICICI123456789")
//                .validUntil(LocalDate.of(2026, 12, 31))
//                .build();
//        Insurance insurance1 = patientService.updateInsuranceOfAPatient(1L, insurance2);
//        System.out.println(insurance1);

        Patient patient = patientService.removeInsuranceOfAPatient(1L);
        System.out.println(patient);
    }

    @Test
    void testAllPatientsWithAppointments(){
        patientService.testFetchAllPatientsWithAppointments().forEach(System.out::println);
    }
}
