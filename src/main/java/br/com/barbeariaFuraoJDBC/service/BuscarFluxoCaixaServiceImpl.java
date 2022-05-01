//package br.com.barbeariaFuraoJDBC.service;
//
//import java.util.List;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.FluxoCaixa;
//import br.com.barbeariaFuraoJDBC.datasource.model.dao.FluxoCaixaDao;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.FluxoCaixaResource;
//
//@Service
//public class BuscarFluxoCaixaServiceImpl {
//	
//	
//	public List<FluxoCaixa> listarFluxosCaixa(){
//		return FluxoCaixaDao.getAll();
//	}
//	
//	public FluxoCaixa buscarFluxoCaixaPorId(int id) throws NotFoundException {
//		FluxoCaixa byId = FluxoCaixaDao.getById(id);
//		if(byId == null) {
//			throw new NotFoundException("não foi possível encontrar o fluxo do caixa pelo id");
//		}else {
//			return byId;
//		}
//	}
//	
//	public ResponseEntity<Void> atualizarFluxoCaixa(FluxoCaixaResource fluxoCaixaResource, int id) throws ResourceExeption {
//		boolean updateById = FluxoCaixaDao.updateById(fluxoCaixaResource, id);
//		if(updateById == false) {
//			throw new ResourceExeption("não foi possível atualizar o fluxo");
//		}else {
//			return new ResponseEntity<Void>(HttpStatus.OK);
//		}
//	}
//	
//	public ResponseEntity<Void> deletarPorId(int id) throws NotFoundException {
//		boolean deleteById = FluxoCaixaDao.deleteById(id);
//		if(deleteById == false) {
//			throw new NotFoundException("não foi possível deletar por id");
//		}else {
//			return ResponseEntity.noContent().build();
//		}
//	}
//
//}
