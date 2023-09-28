package com.rest.template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class PatientService {
	
	List<Patient> patients = new ArrayList<Patient>(
			Arrays.asList(
					new Patient(1, "p1", "d1"),
					new Patient(2, "p2", "d2"),
					new Patient(3, "p3", "d3"),
					new Patient(4, "p4", "d4"),
					new Patient(5, "p5", "d5")
					)
			);
	

	public Patient savePatient(Patient patient) {
		return patients.add(patient)?patient:null;	
	}


	public List<Patient> getPatients() {
		return patients;
	}


}
