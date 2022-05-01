//package br.com.barbeariaFuraoJDBC.service;
//
//import java.util.List;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.Agendamento;
//import br.com.barbeariaFuraoJDBC.datasource.model.dao.AgendamentoDao;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.AgendamentoResource;
//
//@Service
//public class BuscarAgendamentoServiceImpl {
//	
//	
//	public List<Agendamento> listarAgendamentos(){
//		return AgendamentoDao.getAll();
//	}
//	
//	public Agendamento buscarAgendamento(int id) throws NotFoundException {
//		Agendamento byId = AgendamentoDao.getById(id);
//		if(byId == null) {
//			throw new NotFoundException("agendamento não encontrado"); 
//		}else {
//			return byId;
//		}
//	}
//	
//	public ResponseEntity<Void> atualizarAgendamento(AgendamentoResource agendamentoResource, int id) throws ResourceExeption {
//		boolean updateById = AgendamentoDao.updateById(agendamentoResource, id);
//		if(updateById == false) {
//			throw new ResourceExeption("não foi possível atualizar o agendamento");
//		}else {
//			return new ResponseEntity<Void>(HttpStatus.OK);
//		}
//	}
//	
//	public ResponseEntity<Void> deletarAgendamentoPorId(int id) throws NotFoundException {
//		boolean deleById = AgendamentoDao.deleById(id);
//		if(deleById == false) {
//			throw new NotFoundException("não foi possível deletar o agendamento");
//		}else {
//			return ResponseEntity.noContent().build();
//		}
//	}
//
//}
