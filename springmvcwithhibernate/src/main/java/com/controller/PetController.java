package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.PetService;

@Controller
@RequestMapping(value = "/main")
public class PetController {

	@Autowired
	private PetService petService;

	@GetMapping(value = "/pets")
	public String petHome(Model model) {
		model.addAttribute("allpets", petService.getAllPets());
		return "pethome";

	}

	@GetMapping(value = "/success")
	public String success() {
		return "success";
	}

}
