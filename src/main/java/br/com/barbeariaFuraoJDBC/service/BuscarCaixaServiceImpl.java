//package br.com.barbeariaFuraoJDBC.service;
//
//import java.util.List;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.Caixa;
//import br.com.barbeariaFuraoJDBC.datasource.model.dao.CaixaDao;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.CaixaResource;
//
//@Service
//public class BuscarCaixaServiceImpl {
//	
//	
//	public ResponseEntity<List<Caixa>> listarCaixas(){
//		return ResponseEntity.ok(CaixaDao.getAll());
//	}
//	
//	public Caixa buscarCaixaPorId(int id) throws NotFoundException {
//		Caixa byId = CaixaDao.getById(id);
//		if(byId==null) {
//			throw new NotFoundException("não foi possível cadastrar o caixa"); 
//		}else {
//			return byId;
//		}
//	}
//	
//	public ResponseEntity<Void> deletarCaixa(int id) throws  NotFoundException {
//			boolean deleteById = CaixaDao.deleteById(id);
//			if(deleteById == false) {
//				throw new NotFoundException("não foi possível deletar o caixa");
//			}else {
//				return ResponseEntity.noContent().build();
//			}
//	}
//	
//	public ResponseEntity<Void> atualizarCaixa(CaixaResource caixaResource, int id) throws  ResourceExeption {
//		boolean updateById = CaixaDao.updateById(caixaResource, id);
//		if(updateById == false) {
//			throw new ResourceExeption("não foi possível atualizar o caixa");
//		}else {
//			return new ResponseEntity<Void>(HttpStatus.OK);
//		}
//	}
//	
//	
//
//}
