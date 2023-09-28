package com.rest.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	
	private Integer pId;
	private String pName;
	private String pDisease;
	
	
	
}
