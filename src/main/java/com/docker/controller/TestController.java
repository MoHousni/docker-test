package com.docker.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.docker.ClientRepository;
import com.docker.models.Client;

@RestController
public class TestController {

	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping("/clients")
	public List<Client> getAllClient() {
		return clientRepository.findAll();
	}
	
	@GetMapping("/clients/{id}")
	public Optional<Client> getClient(@PathVariable("id") Long id) {
		return clientRepository.findById(id);
	}
	
	@PostMapping("/saveClient")
	public ResponseEntity<Boolean> saveClient(@RequestBody Client client){
		clientRepository.save(client);
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
}
