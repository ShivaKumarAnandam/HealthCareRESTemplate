package com.rest.template;

import java.util.ArrayList;
import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HospitalService {
	
//	@Autowired
//	PatientService patientService;
	
	List<Hospital> hospitals = new ArrayList<Hospital>();

	public Hospital saveHospital(Hospital hospital) {
		
		//List<Patient> patients = patientService.getPatients();

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:3456/patient";

		List<Patient> patients = restTemplate.getForObject(url, List.class);

			Hospital h1 = new Hospital();
			h1.setId(hospital.getId());
			h1.setName(hospital.getName());
			h1.setRating(hospital.getRating());
			h1.setLocation(hospital.getLocation());
			h1.setPatients(patients);
	
		return hospitals.add(h1) ? h1 : null;
	}

	public Hospital getHospitalDataById(Integer id) {
		return hospitals.stream().filter(h->h.getId()==id).findAny().get();
	}

	public List<Hospital>  getAllHospitals() {
		return hospitals;
	}
	
	
}

//POST : http://localhost:3456/hospital/save
//{
//    "id":1,
//	"name":"KIMS",
//	"rating":4.4,
//	"location":"HYD"
//}

//o/p : - 
//{
//    "id": 1,
//    "name": "KIMS",
//    "rating": 4.4,
//    "location": "HYD",
//    "patients": [
//        {
//            "pdisease": "d1",
//            "pid": 1,
//            "pname": "p1"
//        },
//        {
//            "pdisease": "d2",
//            "pid": 2,
//            "pname": "p2"
//        },
//        {
//            "pdisease": "d3",
//            "pid": 3,
//            "pname": "p3"
//        },
//        {
//            "pdisease": "d4",
//            "pid": 4,
//            "pname": "p4"
//        },
//        {
//            "pdisease": "d5",
//            "pid": 5,
//            "pname": "p5"
//        }
//    ]
//}

//GET : http://localhost:3456/hospital/2
//{
//    "id": 2,
//    "name": "NIMS",
//    "rating": 5.4,
//    "location": "HYD",
//    "patients": [
//        {
//            "pid": 1,
//            "pdisease": "d1",
//            "pname": "p1"
//        },
//        {
//            "pid": 2,
//            "pdisease": "d2",
//            "pname": "p2"
//        },
//        {
//            "pid": 3,
//            "pdisease": "d3",
//            "pname": "p3"
//        },
//        {
//            "pid": 4,
//            "pdisease": "d4",
//            "pname": "p4"
//        },
//        {
//            "pid": 5,
//            "pdisease": "d5",
//            "pname": "p5"
//        }
//    ]
//}


//GET : http://localhost:3456/hospital
//[
// {
//     "id": 1,
//     "name": "KIMS",
//     "rating": 4.4,
//     "location": "HYD",
//     "patients": [
//         {
//             "pid": 1,
//             "pdisease": "d1",
//             "pname": "p1"
//         },
//         {
//             "pid": 2,
//             "pdisease": "d2",
//             "pname": "p2"
//         },
//         {
//             "pid": 3,
//             "pdisease": "d3",
//             "pname": "p3"
//         },
//         {
//             "pid": 4,
//             "pdisease": "d4",
//             "pname": "p4"
//         },
//         {
//             "pid": 5,
//             "pdisease": "d5",
//             "pname": "p5"
//         }
//     ]
// },
// {
//     "id": 2,
//     "name": "NIMS",
//     "rating": 5.4,
//     "location": "HYD",
//     "patients": [
//         {
//             "pid": 1,
//             "pdisease": "d1",
//             "pname": "p1"
//         },
//         {
//             "pid": 2,
//             "pdisease": "d2",
//             "pname": "p2"
//         },
//         {
//             "pid": 3,
//             "pdisease": "d3",
//             "pname": "p3"
//         },
//         {
//             "pid": 4,
//             "pdisease": "d4",
//             "pname": "p4"
//         },
//         {
//             "pid": 5,
//             "pdisease": "d5",
//             "pname": "p5"
//         }
//     ]
// }
//]