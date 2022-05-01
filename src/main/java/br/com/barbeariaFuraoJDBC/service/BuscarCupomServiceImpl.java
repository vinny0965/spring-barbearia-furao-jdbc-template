//package br.com.barbeariaFuraoJDBC.service;
//
//import java.util.List;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.CupomDesconto;
//import br.com.barbeariaFuraoJDBC.datasource.model.dao.CupomDescontoDao;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.CupomDescontoResource;
//
//@Service
//public class BuscarCupomServiceImpl {
//
//	
//	public ResponseEntity<List<CupomDesconto>> listarCupons(){
//		return ResponseEntity.ok(CupomDescontoDao.getAll());
//	}
//	
//	public ResponseEntity<CupomDesconto> buscarCupomPorId(int id) throws  NotFoundException {
//		CupomDesconto byId = CupomDescontoDao.getById(id);
//		if(byId==null) {
//			throw new NotFoundException("cupom de desconto não encontrado");
//		}else {
//			return ResponseEntity.ok(byId);
//		}
//	}
//	
//	public CupomDesconto buscarCupomPorIds(int id) throws  NotFoundException {
//		CupomDesconto byId = CupomDescontoDao.getById(id);
//		if(byId==null) {
//			throw new NotFoundException("cupom de desconto não encontrado");
//		}else {
//			return byId;
//		}
//	}
//	
//	public ResponseEntity<Void> deletarCupomPorId(int id) throws  NotFoundException {
//		boolean deleteById = CupomDescontoDao.deleteById(id);
//		if(deleteById==false) {
//			throw new NotFoundException("não foi pessível deletar o cupom");
//		}else {
//			return ResponseEntity.noContent().build();
//		}
//	}
//	
//	public ResponseEntity<Void> atualizarCupomPorId(CupomDescontoResource cupomDescontoResource, int id) throws  ResourceExeption {
//		boolean updateById = CupomDescontoDao.updateById(cupomDescontoResource, id);
//		if(updateById == false) {
//			throw new ResourceExeption("não foi possível atualizar o cupom");
//		}else {
//			return new ResponseEntity<Void>(HttpStatus.OK);
//		}
//	}
//	
//
//}
