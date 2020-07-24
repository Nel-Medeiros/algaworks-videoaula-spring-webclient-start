package br.com.algaworks.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.algaworks.consumer.model.ProdutoComPreco;
import br.com.algaworks.consumer.service.PrecoProdutoService;

@RestController
public class PrecoProdutoController {

	@Autowired
	private PrecoProdutoService precoProdutoService;
	
	@GetMapping("/produto/{codigo}/preco")
	public ResponseEntity<ProdutoComPreco> obeterProdutoComPreco(@PathVariable Long codigo) {
		ProdutoComPreco produtoComPreco = this.precoProdutoService.obterPorCodigo(codigo);
		
		return ResponseEntity.ok(produtoComPreco);
	}
}
