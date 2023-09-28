package com.rest.template;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hospital {
	private Integer id;
	private String name;
	private double rating;
	private String location;
	private List<Patient> patients;
	
}
