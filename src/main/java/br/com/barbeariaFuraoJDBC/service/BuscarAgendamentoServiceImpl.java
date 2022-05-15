package br.com.barbeariaFuraoJDBC.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.barbeariaFuraoJDBC.conversor.AgendamentoConversor;
import br.com.barbeariaFuraoJDBC.datasource.model.Agendamento;
import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
import br.com.barbeariaFuraoJDBC.repository.AgendamentoRepository;
import br.com.barbeariaFuraoJDBC.resource.model.AgendamentoResource;

@Service
public class BuscarAgendamentoServiceImpl {
	
	@Autowired
	private AgendamentoRepository agendamentoRepository;
	
	@Autowired
	private AgendamentoConversor conversor;
	
	public List<AgendamentoResource> listarAgendamentos() throws ResourceExeption{
		return conversor.conversor(agendamentoRepository.getAll());
	}
	
	public List<AgendamentoResource> listarAgendamentosPorId(int id) throws ResourceExeption{
		return conversor.conversor(agendamentoRepository.listByCliente(id));
	}
	
	public List<AgendamentoResource> listarAgendamentosPorData(String data) throws ResourceExeption{
		
		return conversor.conversor(agendamentoRepository.listByData(convert(data)));
	}
	
	public ResponseEntity<AgendamentoResource> buscarAgendamento(int id) throws NotFoundException, ResourceExeption {
		Agendamento agendamento = agendamentoRepository.findById(id);
		if(agendamento == null) {
			throw new NotFoundException("agendamento não encontrado"); 
		}else {
			return ResponseEntity.ok(conversor.conversor(agendamento));
		}
	}
	
	private LocalDate convert (String data) {
		return LocalDate.parse(data);
	}
	
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

}
