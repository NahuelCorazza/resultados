package tec.colmena.resultados.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ResultadoController {

	@GetMapping("/resultado/{numero}") /* entre llaves recibe el numero */
	public String mostrarResultado(@PathVariable float numero) { /* PathVariable permite que se mapee con el numero que viene en la ruta */
		
		return "El resultado es: " + numero;
	}
	
}
