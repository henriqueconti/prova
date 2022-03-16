package br.com.fiap.prova.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.prova.model.Moto;

@RestController
@RequestMapping("/moto")
public class MotoController {

	@GetMapping
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("motos/index.html");
		
		Moto moto = new Moto("preta", 10.000, "hayabusa", 14, "1234H5", 2023);
		Moto moto2 = new Moto("marron", 104.000, "hydai", 11, "1534H5", 2022);
		Moto moto3 = new Moto("azul", 3.000, "dafra", 12, "1536H5", 2020);
		
		List<Moto> motos = Arrays.asList(moto, moto2, moto3);
		modelAndView.addObject("listarMotos", motos);
		
		return modelAndView;
	}
}
