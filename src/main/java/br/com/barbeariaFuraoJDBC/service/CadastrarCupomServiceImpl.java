package br.com.barbeariaFuraoJDBC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.barbeariaFuraoJDBC.conversor.CupomDescontoConversor;
import br.com.barbeariaFuraoJDBC.datasource.model.CupomDesconto;
import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
import br.com.barbeariaFuraoJDBC.repository.CupomRepository;
import br.com.barbeariaFuraoJDBC.resource.model.CupomDescontoResource;

@Service
public class CadastrarCupomServiceImpl {
	
	@Autowired
	private CupomRepository cupomRepository;
	
	@Autowired
	private CupomDescontoConversor conversor;
	
	public ResponseEntity<CupomDesconto> cadastrarCupom(CupomDescontoResource cupomDescontoResource) throws ResourceExeption, NotFoundException {
		CupomDesconto conversor2 = conversor.conversor(cupomDescontoResource);
		int create = cupomRepository.create(conversor2);
		if(create==0) {
			throw new ResourceExeption("não foi possível cadastrar o cupom, resource: "+cupomDescontoResource);
		}else {
			return new ResponseEntity<>(conversor2,HttpStatus.CREATED);
		}
	}


}
