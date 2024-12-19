package br.com.uniciv.test_api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class TestApiApplication {
	
	private final MensagemRepository repository;
	
	@Autowired
	public TestApiApplication(MensagemRepository repository) {
		this.repository=repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TestApiApplication.class, args);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Mensagem> getAll(){
		return repository.findAll();
		
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void post(@RequestBody Mensagem mensagem) {
		mensagem.setId(UUID.randomUUID());
		repository.save(mensagem);
	}
}
