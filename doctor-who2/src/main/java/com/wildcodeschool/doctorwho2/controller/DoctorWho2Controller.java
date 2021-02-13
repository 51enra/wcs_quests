package com.wildcodeschool.doctorwho2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.core.sym.Name;
import com.wildcodeschool.doctorwho2.DoctorDetail;

@Controller
public class DoctorWho2Controller {

	@RequestMapping("/doctor/{strNumber}")
	@ResponseBody
	public Object getQuestion(@PathVariable String strNumber) {
		
		// Prüfung ob String eine Zahl enthält 
		if (strNumber.matches("[0-9]+")) {
			
			// String nach int umwandeln
			int id = Integer.parseInt(strNumber);

			if (id == 9)
				return new DoctorDetail(9, "Christopher Eccleston");
			if (id == 10)
				return new DoctorDetail(10, "David Tennant");
			if (id == 11)
				return new DoctorDetail(11, "Matt Smith");
			if (id == 12)
				return new DoctorDetail(12, "Peter Capaldi");
			if (id == 13)
				return new DoctorDetail(13, "Jodie Whittaker");

			if (id > 0 && id < 9) {
				throw new ResponseStatusException(HttpStatus.SEE_OTHER, "");
			} else {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND,
						"Impossible to retrieve the incarnation " + String.valueOf(id));
			}
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					"Impossible to retrieve the incarnation " + strNumber);
		}
	}
}