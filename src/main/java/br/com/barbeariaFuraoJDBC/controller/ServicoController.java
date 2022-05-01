//package br.com.barbeariaFuraoJDBC.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.Servico;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.ServicoResource;
//import br.com.barbeariaFuraoJDBC.service.BuscarServicoServiceImpl;
//import br.com.barbeariaFuraoJDBC.service.CadastrarServicoServiceImpl;
//
//@RestController
//@RequestMapping("/api")
//public class ServicoController {
//	
//	@Autowired
//	private BuscarServicoServiceImpl buscarServicoServiceImpl;
//	
//	@Autowired
//	private CadastrarServicoServiceImpl cadastrarServicoServiceImpl;
//	
//	@GetMapping(path = "/servicos")
//	public List<Servico> listarServicos(){
//		return buscarServicoServiceImpl.listarServicos();
//	}
//	
//	@GetMapping(path = "/servico/id/{id}")
//	public Servico busServico(@PathVariable(name = "id",required = true)int id) throws NotFoundException {
//		return buscarServicoServiceImpl.buscarServicoPorId(id);
//	}
//	
//	@DeleteMapping(path = "/servico/delete/id/{id}")
//	public void deletarServico(@PathVariable(name = "id",required = true)int id) throws NotFoundException {
//		buscarServicoServiceImpl.deletarServico(id);
//	}
//	
//	@PutMapping(path = "/servico/update/id/{id}")
//	public void atualizarServico(@PathVariable(name = "id",required = true)int id, @RequestBody ServicoResource servicoResource) throws ResourceExeption {
//		buscarServicoServiceImpl.atualizarServico(servicoResource, id);
//	}
//	
//	@PostMapping(path = "/servico/save")
//	public void cadastrar(@RequestBody ServicoResource servicoResource) throws ResourceExeption {
//		cadastrarServicoServiceImpl.cadastrar(servicoResource);
//	}
//	
//	@PostMapping(path = "/servico/saves")
//	public void cadastrarServico(@RequestParam(value = "administrador",defaultValue = "0")int id,@RequestBody ServicoResource servicoResource) throws ResourceExeption, NotFoundException {
//		cadastrarServicoServiceImpl.cadastrarServico(servicoResource,id);
//	}
//
//}
