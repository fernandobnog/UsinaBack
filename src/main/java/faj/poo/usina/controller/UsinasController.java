package faj.poo.usina.controller;

import faj.poo.usina.dao.UsinasDao;
import faj.poo.usina.model.Usinas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsinasController {

	@Autowired
	UsinasDao dao;

	@CrossOrigin
	@GetMapping("/usinas")
	public Retorno listarUsinas() {
		try {
			return new Retorno(dao.listar());
		} catch (Exception ex) {
			return new Retorno(ex.getMessage());
		}
	}
	@CrossOrigin
	@PostMapping("/usinas")
	public Retorno incluir(@RequestBody Usinas u) {
		try {
			return new Retorno(dao.incluir(u));
		} catch (Exception ex) {
			return new Retorno(ex.getMessage());
		}
	}
}
