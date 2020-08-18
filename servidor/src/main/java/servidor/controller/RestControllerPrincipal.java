package servidor.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import servidor.model.DadosPagamento;

@RestController
@RequestMapping("/pagamento")
public class RestControllerPrincipal {

	@GetMapping()
	public String ola() {
		return "ola";
	}
	
	@PostMapping()
	public ResponseEntity<String> recebePagamento(@RequestBody @Valid DadosPagamento dadosPagamento) {

		return dadosPagamento.getValue().doubleValue() > 0 ? ResponseEntity.ok("Pagamento realizado com sucesso!")
				: ResponseEntity.badRequest().body("Valor não aceito.");
	}
}
