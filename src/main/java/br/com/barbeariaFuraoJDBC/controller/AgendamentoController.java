//package br.com.barbeariaFuraoJDBC.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.Agendamento;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.AgendamentoResource;
//import br.com.barbeariaFuraoJDBC.service.BuscarAgendamentoServiceImpl;
//import br.com.barbeariaFuraoJDBC.service.CadastrarAgendamentoServiceImpl;
//
//@RestController
//@RequestMapping("/api")
//public class AgendamentoController {
//	
//	@Autowired
//	private BuscarAgendamentoServiceImpl buscarAgendamentoServiceImpl;
//	
//	@Autowired
//	private CadastrarAgendamentoServiceImpl cadastrarAgendamentoServiceImpl;
//	
//	@GetMapping(path = "/agendamentos")
//	public List<Agendamento> listarAgendamentos(){
//		return buscarAgendamentoServiceImpl.listarAgendamentos();
//	}
//	
//	@GetMapping(path = "/agendamento/id/{id}")
//	public Agendamento buscarAgendamentoPorId(@PathVariable(name = "id",required = true)int id) throws NotFoundException {
//		return buscarAgendamentoServiceImpl.buscarAgendamento(id);
//	}
//	
//	@PostMapping(path = "/agendamento/save")
//	public ResponseEntity<AgendamentoResource> CadastrarAgendamento(@RequestBody AgendamentoResource agendamentoResource) throws ResourceExeption {
//		return cadastrarAgendamentoServiceImpl.cadastrarAgendamento(agendamentoResource);
//	}
//	
//	@PutMapping(path = "/agendamento/update/id/{id}")
//	public ResponseEntity<Void> atualizarAgendamento(@PathVariable(name = "id",required = true)int id, @RequestBody AgendamentoResource agendamentoResource) throws ResourceExeption {
//		return buscarAgendamentoServiceImpl.atualizarAgendamento(agendamentoResource, id);
//	}
//	
//	@DeleteMapping(path = "/agendamento/delete/id/{id}")
//	public ResponseEntity<Void> deletarAgendamento(@PathVariable(name = "id",required = true)int id) throws NotFoundException {
//		return buscarAgendamentoServiceImpl.deletarAgendamentoPorId(id);
//	}
//	
//	
//	
//
//}
