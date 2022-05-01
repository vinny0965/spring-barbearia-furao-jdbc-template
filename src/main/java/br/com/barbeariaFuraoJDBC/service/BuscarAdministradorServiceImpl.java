package br.com.barbeariaFuraoJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.barbeariaFuraoJDBC.conversor.AdministradorConversor;
import br.com.barbeariaFuraoJDBC.datasource.model.Administrador;
import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
import br.com.barbeariaFuraoJDBC.repository.AdministradorRepository;
import br.com.barbeariaFuraoJDBC.resource.model.AdministradorResource;

@Service
public class BuscarAdministradorServiceImpl {
	
	@Autowired
	private AdministradorConversor administradorConversor;
	
	@Autowired
	private AdministradorRepository administradorRepository;
	
	public List<AdministradorResource> listarAdministradores(){
		return administradorConversor.conversor(administradorRepository.list());
	}
	
	public Administrador buscarAdministradorPorId(int id) throws  NotFoundException, ResourceExeption {
		Administrador byId = administradorRepository.getById(id);
		administradorConversor.conversor(byId);
		return byId;
		
	}
//	
//	public void deletarAdministrador(int id) throws NotFoundException {
//		if(AdministradorDao.deleteById(id)==false) {
//			throw new NotFoundException("não foi possível deletar, id inválido, id: "+id);
//		}
//	}
//	
//	public void atualizarAdministrador(AdministradorResource administradorResource, int id) throws ResourceExeption{
//		if(AdministradorDao.updateById(administradorResource, id) == false) {
//			throw new ResourceExeption("não foi possível converter o resouce para entidade, resource :"+administradorResource);
//		}
//	}
	
}
