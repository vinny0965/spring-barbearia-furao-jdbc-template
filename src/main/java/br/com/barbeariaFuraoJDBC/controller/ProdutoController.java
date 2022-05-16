package br.com.barbeariaFuraoJDBC.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
import br.com.barbeariaFuraoJDBC.resource.model.ProdutoResource;
import br.com.barbeariaFuraoJDBC.service.BuscarProdutoServiceImpl;
import lombok.val;

@RestController
@RequestMapping("/api")
public class ProdutoController {
	
	@Autowired
	private BuscarProdutoServiceImpl buscarProdutoServiceImpl;
	
	@GetMapping(value = "/produtos")
	public List<ProdutoResource>listar() throws ResourceExeption{
		return buscarProdutoServiceImpl.listar();
	}
	
	@GetMapping(value = "/produto/id/{id}")
	public ProdutoResource buscarProdutoPorId(@PathVariable(value = "id",required = true)int id) throws ResourceExeption, NotFoundException {
		return buscarProdutoServiceImpl.buscarPorId(id);
	}
	
	@PostMapping(value = "/produto/save")
	public void create(@Valid @RequestBody ProdutoResource produtoResource) throws ResourceExeption {
		buscarProdutoServiceImpl.cadastrarProduto(produtoResource);
	}

}
