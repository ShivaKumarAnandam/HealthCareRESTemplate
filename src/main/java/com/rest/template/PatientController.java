package com.rest.template;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@PostMapping("/s")
	private Patient savePatient(@RequestBody Patient patient){	
		return patientService.savePatient(patient);
	}
	
	@GetMapping
	private List<Patient> getAllPatient(){	
		return patientService.getPatients();
	}
	
//	@GetMapping("/{pId}")
//	public ResponseEntity<Patient> getPatientDetails(@PathVariable("pId") Integer pId){
//		Patient p1 = new Patient();
//		p1.setPId(1);
//		p1.setPName("P1");
//		p1.setPDisease("D1");
//		
//		return new ResponseEntity<Patient>(p1,HttpStatus.OK);
//	}

}
