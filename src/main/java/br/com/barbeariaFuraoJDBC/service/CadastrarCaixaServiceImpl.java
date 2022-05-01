//package br.com.barbeariaFuraoJDBC.service;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.dao.CaixaDao;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.CaixaResource;
//
//@Service
//public class CadastrarCaixaServiceImpl {
//	
//	
//	public ResponseEntity<CaixaResource> CadastrarCaixa(CaixaResource caixaResource) throws ResourceExeption {
//		if(CaixaDao.create(caixaResource)==false) {
//			throw new ResourceExeption("não foi possível cadastrar o caixa, resource: "+caixaResource);
//		}else {
//			return new ResponseEntity<>(caixaResource,HttpStatus.CREATED);
//		}
//	}
//
//}
