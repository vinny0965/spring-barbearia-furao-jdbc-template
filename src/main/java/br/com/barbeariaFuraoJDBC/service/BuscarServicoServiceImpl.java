//package br.com.barbeariaFuraoJDBC.service;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.Servico;
//import br.com.barbeariaFuraoJDBC.datasource.model.dao.ServicoDao;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.ServicoResource;
//
//@Service
//public class BuscarServicoServiceImpl {
//
//	
//	public List<Servico> listarServicos(){
//		return ServicoDao.getAll();
//	}
//	
//	public Servico buscarServicoPorId(int id) throws NotFoundException {
//		Servico byId = ServicoDao.getById(id);
//		if(byId == null) {
//			throw new NotFoundException("serviço não encontrado pelo id");
//		}
//		return byId;
//	}
//	
//	public void deletarServico(int id) throws NotFoundException {
//		if(ServicoDao.deleteById(id)==false) {
//			throw new NotFoundException("não foi possível deletar o serviço");
//		}
//	}
//	
//	public void atualizarServico(ServicoResource servicoResource, int id) throws ResourceExeption {
//		if(ServicoDao.updateById(servicoResource, id)==false) {
//			throw new ResourceExeption("não foi possível atualizar o serviço");
//		}
//		
//	}
//	
//	
//}
