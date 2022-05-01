//package br.com.barbeariaFuraoJDBC.service;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.Cliente;
//import br.com.barbeariaFuraoJDBC.datasource.model.dao.ClienteDao;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.ClienteResource;
//
//@Service
//public class BuscarClienteServiceImpl {
//	
//	
//	
//	
//	public List<Cliente> listarClientes(){
//		return ClienteDao.getAll();
//	}
//
//	public Cliente buscarClientePorId(int id) throws NotFoundException {
//		Cliente byId = ClienteDao.getById(id);
//		if(byId == null) {
//			 throw new NotFoundException("não foi possível encontrar o cliente");
//		 }else {
//			 return byId;
//		 }
//	}
//	
//	public void atualizarCliente(ClienteResource clienteResource, int id) throws  ResourceExeption {
//		if(ClienteDao.upadateById(clienteResource, id) == false) {
//			throw new ResourceExeption("erro ao atualizar cliente, resource com dados inválidos");
//		}
//		
//		
//	}
//	
//	public void deletarCliente(int id) throws NotFoundException {
//		if(ClienteDao.deletebyId(id) ==false) {
//			throw new NotFoundException("não foi possível encontrar o cliente");
//		}
//	}
//	
//}
