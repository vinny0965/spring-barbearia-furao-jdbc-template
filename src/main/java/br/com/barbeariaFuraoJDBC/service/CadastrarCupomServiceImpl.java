//package br.com.barbeariaFuraoJDBC.service;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.CupomDesconto;
//import br.com.barbeariaFuraoJDBC.datasource.model.dao.CupomDescontoDao;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.CupomDescontoResource;
//
//@Service
//public class CadastrarCupomServiceImpl {
//	
//	
//	public ResponseEntity<CupomDesconto> cadastrarCupom(CupomDescontoResource cupomDescontoResource) throws ResourceExeption {
//		boolean create = CupomDescontoDao.create(cupomDescontoResource);
//		if(create==false) {
//			throw new ResourceExeption("não foi possível cadastrar o cupom, resource: "+cupomDescontoResource);
//		}else {
//			return new ResponseEntity<>(HttpStatus.CREATED);
//		}
//	}
//
//
//}
