package com.sistema.pmo.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ServicesModelo {

	// PUT
	// Uma requisição PUT é utilizada quando desejamos criar ou atualizar uma
	// informação identificada por uma URL.

	// DELETE
	// O DELETE deve atuar ao contrária do PUT; deve ser utilizado quando você
	// deseja deletar o recurso identificar pela URL, na requisição.

	// POST
	// O POST é utilizado quando houver repetição no processo executado no servidor,
	// ou seja, quando uma requisição POST é executada mais de uma vez.
	// Complementando, requisições POST devem executar o processo no corpo como um
	// subordinado da URL que você está postando.
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		return new ResponseEntity("",HttpStatus.OK);
	}
}
