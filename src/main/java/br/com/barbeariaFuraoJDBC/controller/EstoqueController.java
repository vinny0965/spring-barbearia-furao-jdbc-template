package br.com.barbeariaFuraoJDBC.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.barbeariaFuraoJDBC.datasource.model.Estoque;
import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
import br.com.barbeariaFuraoJDBC.resource.model.EstoqueResource;
import br.com.barbeariaFuraoJDBC.service.BuscarEstoqueServiceImpl;

@RestController
@RequestMapping("/api")
public class EstoqueController {
	
	@Autowired
	private BuscarEstoqueServiceImpl buscarEstoqueServiceImpl;
	
	
	@GetMapping(path = "/estoques")
	public List<EstoqueResource> buscar() throws ResourceExeption{
		return buscarEstoqueServiceImpl.list();
	}
	
	@PostMapping(path = "/estoque/save")
	public void cadastrar(@Valid @RequestBody EstoqueResource estoqueResource,@RequestParam(name = "idProduto",defaultValue = "0")int idProduto) throws NotFoundException, ResourceExeption{
		buscarEstoqueServiceImpl.create(estoqueResource, idProduto);
	}

}
