package com.animaismarinhos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.animaismarinhos.entidades.AnimaisMarinhos;
import com.animaismarinhos.repository.AnimaisMarinhosRepository;

@Controller
@RequestMapping("/")
public class AnimaisMarinhosController {
	
	@Autowired
	private AnimaisMarinhosRepository repo;
	
	@GetMapping
	public String index() {
		return "indexAnimaisMarinhos";
	}
	@GetMapping("/cadastroAnimaisMarinhos")
	public String formCadastro() {
		return "cadastroAnimaisMarinhos";
	}
	@GetMapping("/consultaAnimaisMarinhos")
	public String formConsulta(Model model) {
		Iterable<AnimaisMarinhos> animaisMarinhos = repo.findAll();
		model.addAttribute("animaisMarinhos", animaisMarinhos);
		return "consultaAnimaisMarinhos";
	}
	@GetMapping("/consultaAnimaisMarinhos/{idanimaismarinhos}")
	public String formEditar(@PathVariable("idanimaismarinhos") int id, Model model) {
		AnimaisMarinhos animaismarinhos = repo.findById(id).get();
		model.addAttribute("animaismarinhos", animaismarinhos);
		return "edicaoAnimaisMarinhos";
	}
	
	@PostMapping("/cadastroAnimaisMarinhos")
	public String salvar(AnimaisMarinhos animaisMarinhos) {
		repo.save(animaisMarinhos);
	return "redirect:/consultaAnimaisMarinhos";
	}
	@GetMapping("/delete/{idanimaismarinhos}")
	public String delete(@PathVariable("idanimaismarinhos") int id) {
		repo.deleteById(id);
		return "redirect:/consultaAnimaisMarinhos";
	}
}

