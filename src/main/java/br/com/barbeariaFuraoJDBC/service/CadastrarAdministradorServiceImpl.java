//package br.com.barbeariaFuraoJDBC.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import br.com.barbeariaFuraoJDBC.conversor.AdministradorConversor;
//import br.com.barbeariaFuraoJDBC.datasource.model.Administrador;
//import br.com.barbeariaFuraoJDBC.datasource.model.dao.AdministradorDao;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.AdministradorResource;
//
//@Service
//public class CadastrarAdministradorServiceImpl {
//
//	@Autowired
//	private AdministradorConversor administradorConversor;
//	
//	public ResponseEntity<AdministradorResource> cadastrar(AdministradorResource administradorResource) throws ResourceExeption, NotFoundException{
//		Administrador conversor = administradorConversor.conversor(administradorResource);
//		boolean create = AdministradorDao.create(conversor);
//		if(create == false) {
//			throw new ResourceExeption("não foi possível cadastrar o administrador, resource:"+administradorResource);
//		}else {
//			return new ResponseEntity<>(administradorResource, HttpStatus.CREATED);
//		}
//	}
//	
//}
