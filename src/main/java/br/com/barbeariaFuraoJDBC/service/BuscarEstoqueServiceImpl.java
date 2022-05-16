package br.com.barbeariaFuraoJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.barbeariaFuraoJDBC.conversor.EstoqueConversor;
import br.com.barbeariaFuraoJDBC.datasource.model.Estoque;
import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
import br.com.barbeariaFuraoJDBC.repository.EstoqueRepository;
import br.com.barbeariaFuraoJDBC.resource.model.EstoqueResource;

@Service
public class BuscarEstoqueServiceImpl {
	
	@Autowired
	private EstoqueRepository estoqueRepository;
	
	@Autowired
	private EstoqueConversor conversor;
	
	public List<EstoqueResource> list() throws ResourceExeption{
		return conversor.conversor(estoqueRepository.list());
	}
	
	public void create(EstoqueResource estoqueResource, int idProduto) throws NotFoundException, ResourceExeption {
		Estoque conversor2 = conversor.conversor(estoqueResource, idProduto);
		estoqueRepository.create(conversor2);
	}
	

}
