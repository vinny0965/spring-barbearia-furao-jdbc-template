//package br.com.barbeariaFuraoJDBC.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import br.com.barbeariaFuraoJDBC.conversor.ClienteConversor;
//import br.com.barbeariaFuraoJDBC.datasource.model.Cliente;
//import br.com.barbeariaFuraoJDBC.datasource.model.Endereco;
//import br.com.barbeariaFuraoJDBC.datasource.model.dao.ClienteDao;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.ClienteResource;
//
//@Service
//public class CadastrarClienteServiceImpl {
//	
//	@Autowired
//	private ClienteConversor clienteConversor;
//	
//	@Autowired
//	private BuscarEnderecoServiceImpl buscarEnderecoServiceImpl;
//	
//	public ResponseEntity<ClienteResource> cadastrar(ClienteResource clienteResource) throws ResourceExeption {
//		if(ClienteDao.create(clienteResource) == false){
//			throw new ResourceExeption("não foi possível converter o resource para entidade, resource: "+clienteResource);
//		}
//		return ResponseEntity.ok(clienteResource);
//	}
//	
//	
////	public void cadastrarCliente(ClienteResource clienteResource) throws ResourceExeption {
////		Cliente map = modelMapper.map(clienteResource, Cliente.class);
////		ClienteDao.createCliente(map);
////	}
//	
//	public void cadastrarClienteResource(ClienteResource clienteResource) throws ResourceExeption, NotFoundException {
//			Cliente converter = clienteConversor.converter(clienteResource);
//			ClienteDao.createCliente(converter);
//		
//	}
//
//}
