//package br.com.barbeariaFuraoJDBC.service;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.dao.AgendamentoDao;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.AgendamentoResource;
//
//@Service
//public class CadastrarAgendamentoServiceImpl {
//
////	
//	public ResponseEntity<AgendamentoResource> cadastrarAgendamento(AgendamentoResource agendamentoResource) throws ResourceExeption {
//		if(AgendamentoDao.create(agendamentoResource)==false) {
//			throw new ResourceExeption("Não foi possível cadastrar o agendamento, resource: "+agendamentoResource);
//		}else {
//			return new ResponseEntity<>(agendamentoResource,HttpStatus.CREATED);
//		}
//		
//	}
//
//}
