package Controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Empleado;
import interfacesservice.EmpleadoService;

@Controller
@RequestMapping
public class EmpleadoControlador {
	@Autowired
	private EmpleadoService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Empleado>empleado=service.listar();
		model.addAttribute("empleado",empleado);
		return "index";
	}

	@GetMapping("/nuevo")
	public String agregar(Model model) {
		model.addAttribute("empleado",new Empleado());
		return "formulario";
	}

	@PostMapping("/guardar")
	public String save(@Validated Empleado e, Model model) {
		service.save(e);
		return "redirect:/listar";
	}
}
