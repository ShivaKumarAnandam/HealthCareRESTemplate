package com.rest.template;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	HospitalService hospitalService;
	
	
	@PostMapping("/save")
	private Hospital saveHospital(@RequestBody Hospital hospital){	
		return hospitalService.saveHospital(hospital);
	}

	@GetMapping("/{id}")
	public Hospital getHospitalData(@PathVariable Integer id) {
		return hospitalService.getHospitalDataById(id);
	}
	
	@GetMapping
	public List<Hospital> getAllHospitalData() {
		return hospitalService.getAllHospitals();
	}
}
