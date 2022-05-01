//package br.com.barbeariaFuraoJDBC.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import br.com.barbeariaFuraoJDBC.conversor.ServicoConversor;
//import br.com.barbeariaFuraoJDBC.datasource.model.Administrador;
//import br.com.barbeariaFuraoJDBC.datasource.model.Servico;
//import br.com.barbeariaFuraoJDBC.datasource.model.dao.ServicoDao;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.ServicoResource;
//
//@Service
//public class CadastrarServicoServiceImpl {
//	@Autowired
//	private BuscarAdministradorServiceImpl administradorServiceImpl;
//	
//	
//	@Autowired
//	private ServicoConversor conversor;
//	
//	public ResponseEntity<ServicoResource> cadastrar(ServicoResource servicoResource) throws ResourceExeption {
//		if(ServicoDao.create(servicoResource)==false) {
//			throw new ResourceExeption("não foi possível salvar o serviço, dados resource inválidos, resource: "+servicoResource);
//		}else {
//			return new ResponseEntity<>(servicoResource, HttpStatus.CREATED);
//		}
//	}
//	
////	public ResponseEntity<ServicoDTO> cadastrarServico(ServicoDTO servicoDto, int id) throws ResourceExeption, NotFoundException {
////		Administrador buscarAdministradorPorId = administradorServiceImpl.buscarAdministradorPorId(id);
////		servicoDto.setAdministrador(buscarAdministradorPorId);
////		Servico map = mapper.map(servicoDto, Servico.class);
////		if(ServicoDao.createServico(map,id)==false) {
////			throw new ResourceExeption("não foi possível salvar o serviço, dados resource inválidos, resource: "+servicoDto);
////		}else {
////			return new ResponseEntity<>(servicoDto, HttpStatus.CREATED);
////		}
////	}
//
//	public void cadastrarServico(ServicoResource servicoResource, int id) throws ResourceExeption, NotFoundException {
//		Servico conversor2 = conversor.conversor(servicoResource);
//		ServicoDao.createServico(conversor2);
//	}
//}
